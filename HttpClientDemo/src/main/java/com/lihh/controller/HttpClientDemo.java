package com.lihh.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lihh.pojo.User;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class HttpClientDemo {

    @Test
    public void testGetReturnString() throws URISyntaxException, IOException {
        // 1. 创建http工具
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 2. 请求路径
        URIBuilder uriBuilder = new URIBuilder("http://localhost:8081/getInfo");
        uriBuilder.addParameter("params", "123");

        // 3. 创建http get对象
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        // 4. 创建响应对象
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

        //由于响应体是字符串，因此把HttpEntity类型转换为字符串类型，并设置字符编码
        String result = EntityUtils.toString(httpResponse.getEntity(), "utf-8");

        System.out.println(result);

        httpResponse.close();
        httpClient.close();
    }

    @Test
    public void testGetResultUser() throws URISyntaxException, IOException {
        // 1. 创建http工具
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 2. 请求路径
        URIBuilder uriBuilder = new URIBuilder("http://localhost:8081/testDemo");
        uriBuilder.addParameter("id", "123");
        uriBuilder.addParameter("name", "lxx");

        // 3. 创建http get对象
        HttpGet httpGet = new HttpGet(uriBuilder.build());
        // 4. 创建响应对象
        CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

        //由于响应体是字符串，因此把HttpEntity类型转换为字符串类型，并设置字符编码
        String result = EntityUtils.toString(httpResponse.getEntity(), "utf-8");

        // 此时返回字符串
        System.out.println(result);

        // 将json对象 转换为 对象
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(result, User.class);
        System.out.println(user);


        httpResponse.close();
        httpClient.close();
    }

    @Test
    public void testPostReturnString() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://localhost:8081/getInfo");

        // 参数
        List<NameValuePair> list = new ArrayList<>();
        list.add(new BasicNameValuePair("params", "123"));


        HttpEntity httpEntity = new UrlEncodedFormEntity(list, "utf-8");
        httpPost.setEntity(httpEntity);

        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);

        String result = EntityUtils.toString(httpResponse.getEntity());
        System.out.println(result);

        httpResponse.close();
        httpClient.close();
    }
}
