package com.gqz.goods.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gqz.goods.dao.AlbumMapper;
import com.gqz.goods.pojo.Album;
import com.gqz.goods.service.AlbumService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * <p>相册管理的业务类</p>
 *
 * @author gqz20
 * @create 2021-10-30 19:44
 **/
@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumMapper albumMapper;

    /**
     * Album多条件分页查询
     *
     * @param album
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<Album> findPage(Album album, int page, int size) {
        PageHelper.startPage(page, size);
        List<Album> albums = albumMapper.selectByExample(createExample(album));
        return new PageInfo<>(albums);
    }

    /***
     * Album分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<Album> findPage(int page, int size) {
        PageHelper.startPage(page, size);
        return new PageInfo<>(albumMapper.selectAll());
    }

    /***
     * Album多条件搜索方法
     * @param album
     * @return
     */
    @Override
    public List<Album> findList(Album album) {
        List<Album> albums = albumMapper.selectByExample(createExample(album));
        return albums;
    }

    /***
     * 删除Album
     * @param id
     */
    @Override
    public void delete(Long id) {
        int i = albumMapper.deleteByPrimaryKey(id);

        if (i == 0) {
            throw new RuntimeException("删除图片失败");
        }
    }

    /***
     * 修改Album数据
     * @param album
     */
    @Override
    public void update(Album album) {
        int i = albumMapper.updateByPrimaryKey(album);
        if (i == 0) {
            throw new RuntimeException("更新图片失败");
        }
    }

    /***
     * 新增Album
     * @param album
     */
    @Override
    public void add(Album album) {
        int i = albumMapper.insert(album);
        if (i == 0) {
            throw new RuntimeException("添加图片失败");
        }
    }

    /**
     * 根据ID查询Album
     *
     * @param id
     * @return
     */
    @Override
    public Album findById(Long id) {
        Album album = albumMapper.selectByPrimaryKey(id);
        if (album == null) {
            throw new RuntimeException("根据ID查找图片失败");
        }
        return album;
    }

    /***
     * 查询所有Album
     * @return
     */
    @Override
    public List<Album> findAll() {
        List<Album> albums = albumMapper.selectAll();
        return albums;
    }

    /**
     * Album构建查询对象
     *
     * @param album
     * @return
     */
    public Example createExample(Album album) {
        Example example = new Example(Album.class);
        Example.Criteria criteria = example.createCriteria();
        if (album != null) {
            // 编号
            if (StringUtils.isNotEmpty(String.valueOf(album.getId()))) {
                criteria.andEqualTo("id", album.getId());
            }
            // 相册名称
            if (!StringUtils.isEmpty(album.getTitle())) {
                criteria.andLike("title", "%" + album.getTitle() + "%");
            }
            // 相册封面
            if (!StringUtils.isEmpty(album.getImage())) {
                criteria.andEqualTo("image", album.getImage());
            }
            // 图片列表
            if (!StringUtils.isEmpty(album.getImageItems())) {
                criteria.andEqualTo("imageItems", album.getImageItems());
            }
        }
        return example;
    }
}
