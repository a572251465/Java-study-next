package com.lihh.controller;

import com.lihh.common.Utils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping(value = "/files")
public class FileController {

    // 这是本地启动的另一个tomcat服务器 作为文件服务器
    private final String SERVER_ADDR = "http://192.168.31.121:8090/upload/";

    @RequestMapping(method = RequestMethod.POST, value = "/uploadFile")
    public Map<String, Object> uploadFile(MultipartFile file) throws IOException {
        HashMap<String, Object> hashMap = new HashMap<>();

        // 文件名称
        String originalFilename = file.getOriginalFilename();
        // 表示获取扩展名
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
        // 避免文件名称冲突 使用uuid
        String uuid = UUID.randomUUID() + "_" + Utils.getCurrentDate();
        String newFileName = uuid.concat(suffix);

        // 创建 sun公司提供的jersey包中的client对象
        Client client = Client.create();
        WebResource webResource = client.resource(SERVER_ADDR + newFileName);

        // 将文件存储到另一个服务器上去
        webResource.put(String.class, file.getBytes());

        // 上传成功后 返回对应的状态
        hashMap.put("code", "200");

        HashMap<String, String> data = new HashMap<>();
        data.put("path", SERVER_ADDR);
        data.put("filename", newFileName);
        data.put("type", file.getContentType());
        hashMap.put("data", data);
        return hashMap;
    }

    @GetMapping(value = "/downloadFile")
    public void downloadFile(String filename, String fileType, HttpServletResponse resp) throws IOException {
        // 1. 设置响应头
        resp.setHeader("Content-Disposition", "attachment;filename=" + filename);
        // 2. 设置响应类型
        resp.setContentType(fileType);
        // 3. 获取一个文件的输入流
        InputStream inputStream = new URL(SERVER_ADDR + filename).openStream();
        // 4. 设置一个输出流
        ServletOutputStream outputStream = resp.getOutputStream();
        // 5. 向浏览器响应文件即可
        IOUtils.copy(inputStream, outputStream);
    }
}
