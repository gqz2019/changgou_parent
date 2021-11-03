package com.gqz.goods.service.impl;

import com.gqz.core.service.impl.CoreServiceImpl;
import com.gqz.goods.dao.AlbumMapper;
import com.gqz.goods.pojo.Album;
import com.gqz.goods.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>相册管理的业务类</p>
 *
 * @author gqz20
 * @create 2021-10-30 19:44
 **/
@Service
public class AlbumServiceImpl extends CoreServiceImpl<Album> implements AlbumService {
    private AlbumMapper albumMapper;

    @Autowired
    public AlbumServiceImpl(AlbumMapper albumMapper) {
        super(albumMapper, Album.class);
        this.albumMapper = albumMapper;
    }
}
