package com.gqz.goods.dao;

import com.gqz.goods.pojo.Album;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * <p>相册dao</p>
 *
 * @author gqz20
 * @create 2021-10-30 19:42
 **/
@Repository
public interface AlbumMapper extends Mapper<Album> {
}
