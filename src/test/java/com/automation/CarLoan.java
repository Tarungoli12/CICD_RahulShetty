package com.automation;

import org.testng.annotations.Test;

public class CarLoan extends Annotations{

    @Test(groups = {"smoke"})
    public void testCase1() {
        System.out.println("Thrid CICD Integration  - testCase 1");
    }

    @Test(dependsOnMethods = {"testCase5"})
    public void testCase2() {
        System.out.println("testCase 2");
    }

    @Test(enabled = false)
    public void testCase3() {
        System.out.println("testCase 3");
    }

    @Test(timeOut = 4000)
    public void testCase4() {
        System.out.println("testCase 4");
    }

    @Test
    public void testCase5() {
        System.out.println("testCase 5");
    }

    @Test
    public void testCase6() {
        System.out.println("testCase 6");
    }


}
