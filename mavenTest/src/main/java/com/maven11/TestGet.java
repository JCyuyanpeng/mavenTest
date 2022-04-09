package com.maven11;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.colorchooser.ColorSelectionModel;

public class TestGet {

//    CloseableHttpResponse
    CloseableHttpResponse response = null;
    CloseableHttpClient httpclient = HttpClients.createDefault();
    String url = "http://175.178.189.177/bbs/member.php?mod=register";

    @Test
    public void testGet(){
//        HttpGet get = new HttpGet(url);
        HttpGet get = new HttpGet(url);
        get.addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36");
//        List<NameValuePair> params=new ArrayList<NameValuePair>();
        try{
            response = httpclient.execute(get);
            HttpEntity entity=response.getEntity();
            System.out.println(entity);
            int code =response.getStatusLine().getStatusCode();
            Assert.assertEquals(code, 200, "false");
            System.out.println("StatusCode: " + code);
            String entityStr= EntityUtils.toString(entity,"UTF-8");
//            System.out.println(entityStr);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
