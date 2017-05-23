package com.pengjiawei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Date;

/**
 * @author 彭家玮
 * @version V1.0
 * @className ActionController
 * @description //TODO 描述这个类的作用
 * @date 2017/5/2
 */
@RestController
public class ActionController {
    @RequestMapping(value="/upload", method= RequestMethod.POST)
    //这里RequestParam应该和form的name属性值一样
    public String action1(@RequestParam("file") MultipartFile[] files){
        long  startTime=System.currentTimeMillis();
        if(files!=null&&files.length>0){
            //循环获取file数组中得文件
            for(int i = 0;i<files.length;i++){
                MultipartFile file = files[i];
                InputStreamReader reader = null; // 建立一个输入流对象reader
                try {
                    String Path = "E:/"+new Date().getTime()+file.getOriginalFilename();
                    File localFile = new File(Path);
                    try {
                        file.transferTo(localFile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    reader = new InputStreamReader(
                            new FileInputStream(localFile));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                BufferedReader br = new BufferedReader(reader); // 建立一个对象，转换文件内容

                String line = null;
                try {
                    while ((line = br.readLine()) != null) {
                        String uid = line;
                        System.out.println("number " + i + "  user = " + uid);
                        i++;
                        try {
                            Thread.sleep(20);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(file.getOriginalFilename()+"   "+file.getContentType());
            }
        }
        return "/success";
    }
}
