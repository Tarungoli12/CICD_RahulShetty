package com.automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan{

    @Parameters({"URL"})
    @Test
    public void testCase3(String url){
        System.out.println("testCase 3");
        System.out.println(url);
    }

    @Test
    public void testCase4(){
        System.out.println("testCase 4");
    }

    @Test(groups = {"smoke"})
    public void Demo(){
        System.out.println(" CICD Integration Demo Test case");
    }

    @Test
    public void testCase5(){
        System.out.println("testCase 5");
    }

    @Test(dataProvider="getData")
    public void testCase6(String user, String pass){
        System.out.println("testCase 6");
        System.out.println(user);
        System.out.println(pass);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];
        data[0][0] = "FirstSetUser";
        data[0][1] = "FirstSetPass";
        data[1][0] = "SecondSetUser";
        data[1][1] = "SecondSetPass";
        data[2][0] = "ThirdSetUser";
        data[2][1] = "ThirdSetPass";
        return data;
    }
}
