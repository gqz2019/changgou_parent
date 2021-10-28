package com.gqz.file.controller;

import com.gqz.file.pojo.FastDFSFile;
import com.gqz.file.utils.FastDFSClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-28 15:58
 **/
@RestController
@CrossOrigin
@RequestMapping("file")
public class FileController {
    @PostMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file) throws IOException {
        FastDFSFile fastDFSFile = new FastDFSFile();

        fastDFSFile.setName(file.getOriginalFilename());
        fastDFSFile.setContent(file.getBytes());
        fastDFSFile.setExt(
                normalizeFileExtension(file)
        );

        String[] uploads = FastDFSClient.upload(fastDFSFile);

        return FastDFSClient.getTrackerUrl()+"/"+uploads[0]+"/"+uploads[1];
    }
    private static String normalizeFileExtension(MultipartFile file) {
        int index = file.getOriginalFilename().lastIndexOf(".");
        return file.getOriginalFilename().substring(index + 1).toLowerCase();
    }
}
