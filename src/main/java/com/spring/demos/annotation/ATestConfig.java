package com.spring.demos.annotation;

import org.testng.annotations.*;

public class ATestConfig {

    @BeforeSuite()
    public void beforeSuite() {
        System.out.println(this.getClass().getSimpleName() + " -->  @BeforeSuite");
    }

    @AfterSuite()
    public void afterSuite() {
        System.out.println(this.getClass().getSimpleName() + " -->  @AfterSuite");
    }

    @BeforeTest()
    public void beforeTest() {
        System.out.println(this.getClass().getSimpleName() + " -->  @BeforeTest");
    }

    @AfterTest()
    public void afterTest() {
        System.out.println(this.getClass().getSimpleName() + " -->  @AfterTest");
    }

    @BeforeClass()
    public void beforeClass() {
        System.out.println(this.getClass().getSimpleName() + " -->  @BeforeClass");
    }

    @AfterClass()
    public void afterClass() {
        System.out.println(this.getClass().getSimpleName() + " -->  @AfterClass");
    }

    @BeforeMethod()
    public void beforeMethod() {
        System.out.println(this.getClass().getSimpleName() + " -->  @BeforeMethod");
    }

    @AfterMethod()
    public void afterMethod() {
        System.out.println(this.getClass().getSimpleName() + " -->  @AfterMethod");
    }

    @BeforeGroups()
    public void beforeGroups() {
        System.out.println(this.getClass().getSimpleName() + " -->  @BeforeGroups");
    }

    @AfterGroups()
    public void afterGroups() {
        System.out.println(this.getClass().getSimpleName() + " -->  @AfterGroups");
    }

}