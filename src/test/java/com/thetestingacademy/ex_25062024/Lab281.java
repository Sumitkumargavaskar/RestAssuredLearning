package com.thetestingacademy.ex_25062024;

import org.testng.annotations.Test;

@Test
public class Lab281 {
    public void serverStartedOk(){
        System.out.println("I will be run first");

    }
   @Test(dependsOnMethods = "serverStartedOk")
    public void Method1(){
        System.out.println("Method1");
    }
}
