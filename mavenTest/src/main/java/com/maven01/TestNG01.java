package com.maven01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG01 {

    @Test
    public void TestCase01(){
        Assert.assertEquals(1,2,"fail");
    }
    
    @Test
    public void TestCase02(){
        Assert.assertEquals(1,1,"success");
    }
}
