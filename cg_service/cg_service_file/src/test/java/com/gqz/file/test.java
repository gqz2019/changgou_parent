package com.gqz.file;

import com.gqz.file.utils.FastDFSClient;
import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.net.URL;

/**
 * <p></p>
 *
 * @author gqz20
 * @create 2021-10-26 14:39
 **/
@SpringBootTest
public class test {
    private StorageClient storageClient;

    @BeforeEach
    public void init() throws MyException, IOException {
        ClientGlobal.init(test.class.getClassLoader().getResource("fdfs_client.conf").getPath());
        String path = new ClassPathResource("fdfs_client.conf").getPath();

        TrackerClient trackerClient = new TrackerClient();
        TrackerServer connection = trackerClient.getConnection();

        storageClient = new StorageClient(connection, null);
    }

    @Test
    public void a() throws MyException, IOException {

        String filePath = "D:\\steam\\steamapps\\workshop\\content\\431960\\2114290843\\莲华.mp4";
//        String[] s = storageClient.upload_file(filePath, "mp4", null);


        FileInfo info = storageClient.get_file_info("group1", "M00/00/00/rBnHomF39O6ALOYoBgQkNqOVS_Q605.mp4");
//        for (String s1 : s) {
//            System.out.println(s1);
//        }


        System.out.println(info);

    }

    @Test
    public void b() throws IOException {
        URL url = test.class.getClassLoader().getResource("fdfs_client.conf");
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getProtocol());


        String info = FastDFSClient.getTrackerUrl();
        System.out.println(info);

    }
}
