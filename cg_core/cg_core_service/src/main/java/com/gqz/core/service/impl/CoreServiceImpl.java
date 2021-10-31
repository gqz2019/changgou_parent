package com.gqz.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gqz.core.service.CoreService;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * <p>核心实现类</p>
 *
 * @author gqz20
 * @create 2021-10-31 15:31
 **/
public abstract class CoreServiceImpl<T> implements CoreService<T> {
    protected Mapper<T> baseMapper;
    /**
     * 操作的实体类
     */
    protected Class<T> clazz;

    public CoreServiceImpl(Mapper<T> baseMapper, Class<T> clazz) {
        this.baseMapper = baseMapper;
        this.clazz = clazz;
    }

    /**
     * 根据条件删除
     *
     * @param record
     * @return
     */

    @Override
    public int delete(T record) {
        int i = baseMapper.delete(record);
        if (i == 0) {
            throw new RuntimeException("条件删除失败");
        }
        return i;
    }

    /**
     * 根据ID 删除
     *
     * @param id
     * @return
     */
    @Override
    public int deleteById(Object id) {
        int i = baseMapper.deleteByPrimaryKey(id);
        if (i == 0) {
            throw new RuntimeException("根据ID删除失败");
        }
        return i;
    }

    /**
     * 添加记录
     *
     * @param record
     * @return
     */
    @Override
    public int insert(T record) {
        int i = baseMapper.insertSelective(record);
        if (i == 0) {
            throw new RuntimeException("插入失败");
        }
        return i;
    }

    /**
     * 分页查询
     *
     * @param pageNo
     * @param pageSize
     * @return
     */
    @Override
    public PageInfo<T> findPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<T> list = baseMapper.selectAll();
        if (list.isEmpty()) {
            throw new RuntimeException("分页查询失败");
        }
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        return pageInfo;
    }

    /**
     * 分页条件查询
     *
     * @param pageNo
     * @param pageSize
     * @param record
     * @return
     */
    @Override
    public PageInfo<T> findPage(Integer pageNo, Integer pageSize, T record) {
        Example example = new Example(clazz);
        Example.Criteria criteria = example.createCriteria();

        Field[] fields = record.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Transient.class) || field.isAnnotationPresent(Id.class)) {
                continue;
            }
            PropertyDescriptor propertyDescriptor = null;
            try {
                propertyDescriptor = new PropertyDescriptor(field.getName(), field.getClass());
                Object value = propertyDescriptor.getReadMethod().invoke(record);
                if (value instanceof String) {
                    Column columnAnnotation = field.getAnnotation(Column.class);
                    //判断如果是长度为1 则 执行=号
                    int length = columnAnnotation.length();
                    if (length == 1) {
                        criteria.andEqualTo(field.getName(), value);
                    } else {
                        criteria.andLike(field.getName(), "%" + value + "%");
                    }
                }
            } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

        }
        PageHelper.startPage(pageNo, pageSize);
        List<T> ts = baseMapper.selectByExample(example);
        if (ts.isEmpty()) {
            throw new RuntimeException("条件分页查询失败");
        }
        return new PageInfo<T>(ts);
    }

    /**
     * 根据查询条件example来分页查询
     *
     * @param pageNo
     * @param pageSize
     * @param example
     * @return
     */
    @Override
    public PageInfo<T> findPageExample(Integer pageNo, Integer pageSize, Object example) {
        PageHelper.startPage(pageNo, pageSize);
        List<T> list = baseMapper.selectByExample(example);
        if (list.isEmpty()) {
            throw new RuntimeException("条件分页查询失败");
        }
        return new PageInfo<T>(list);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<T> selectAll() {
        List<T> ts = baseMapper.selectAll();
        if (ts.isEmpty()) {
            throw new RuntimeException("查询所有失败");
        }
        return ts;
    }

    /**
     * 通过主key查询
     *
     * @param primaryKey
     * @return
     */
    @Override
    public T selectByPrimaryKey(Object primaryKey) {
        T t = baseMapper.selectByPrimaryKey(primaryKey);
        if (t == null) {
            throw new RuntimeException("根据id查询失败");
        }
        return t;
    }

    /**
     * 根据条件查询
     *
     * @param record
     * @return
     */
    @Override
    public List<T> select(T record) {
        List<T> list = baseMapper.select(record);
        if (list.isEmpty()) {
            throw new RuntimeException("条件查询失败");
        }
        return list;
    }

    /**
     * 根据对象进行更新
     *
     * @param record
     * @return
     */
    @Override
    public int updateByPrimaryKey(T record) {
        int i = baseMapper.updateByPrimaryKeySelective(record);
        if (i == 0) {
            throw new RuntimeException("根据ID更新失败");
        }
        return i;
    }
}
