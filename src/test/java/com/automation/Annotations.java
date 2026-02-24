package com.automation;

import org.testng.annotations.*;

public class Annotations {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test..........");
        System.out.println();
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test..........");
        System.out.println();
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite..........");
        System.out.println();
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite..........");
        System.out.println();
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method.........");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method.........");
    }

}
