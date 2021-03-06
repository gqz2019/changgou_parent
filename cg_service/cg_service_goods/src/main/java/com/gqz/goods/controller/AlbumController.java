package com.gqz.goods.controller;

import com.gqz.core.controller.AbstractCoreController;
import com.gqz.goods.pojo.Album;
import com.gqz.goods.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-30 20:11
 **/

@RestController
@RequestMapping("/album")
@CrossOrigin
public class AlbumController extends AbstractCoreController<Album> {

    private AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        super(albumService, Album.class);
        this.albumService = albumService;
    }
}

