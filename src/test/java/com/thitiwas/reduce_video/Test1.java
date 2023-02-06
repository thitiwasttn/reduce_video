package com.thitiwas.reduce_video;

import com.thitiwas.reduce_video.service.ReduceService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@SpringBootTest(classes = ReduceVideoApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class Test1 {

    @Autowired
    private ReduceService reduceService;
    @Test
    public void reduceSizeV4() throws Exception {
        String sorucePath = "C:\\Users\\Admin\\Downloads\\reduce_video\\src\\main\\resources\\videos\\pentor.mp4";
        String folderDes = "C:\\Users\\Admin\\Downloads\\reduce_video\\src\\main\\resources\\videos\\";
        // File file = new File(sorucePath);
        reduceService.reduceVideoYoutubeBitrate(sorucePath, folderDes);
        reduceSizeV3();
    }

    @Test
    public void reduceSizeV3() throws Exception {
        String sorucePath = "C:\\Users\\Admin\\Downloads\\reduce_video\\src\\main\\resources\\videos\\input1.mp4";
        String folderDes = "C:\\Users\\Admin\\Downloads\\reduce_video\\src\\main\\resources\\videos\\";
        // File file = new File(sorucePath);
        log.info("start avi");
        reduceService.reduceVideo480aAv1bitrateDefault(sorucePath, folderDes);
        log.info("avi done 1");
//        reduceService.reduceVideo720aAv1bitrateDefault(sorucePath, folderDes);
//        log.info("avi done 2");
    }

    @Test
    public void reduceSizeV2() throws Exception {
        String sorucePath = "C:\\Users\\Admin\\Downloads\\reduce_video\\src\\main\\resources\\videos\\pentor.mp4";
        String folderDes = "C:\\Users\\Admin\\Downloads\\reduce_video\\src\\main\\resources\\videos\\";
        // File file = new File(sorucePath);
        reduceService.reduceVideo480bitrate1500(sorucePath, folderDes);
        reduceService.reduceVideo480bitrateDefault(sorucePath, folderDes);
        //reduceService.reduceVideoV5(sorucePath, folderDes);
    }
    @Test
    public void reduceSize() throws Exception {
        String sorucePath = "C:\\Users\\Admin\\Downloads\\reduce_video\\src\\main\\resources\\videos\\pentor.mp4";
        String folderDes = "C:\\Users\\Admin\\Downloads\\reduce_video\\src\\main\\resources\\videos\\";
        // File file = new File(sorucePath);
        reduceService.reduceVideoV3(sorucePath, folderDes);
    }
}
