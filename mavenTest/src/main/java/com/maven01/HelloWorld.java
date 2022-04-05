package com.maven01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorld {

    TestNG02 tg = new TestNG02("tom", 29);

    @Test
    public void tng(){
        tg.show();
        Assert.assertEquals("tom", tg.name, "fail");
        Assert.assertEquals(29, tg.age, "fail");
    }
}
