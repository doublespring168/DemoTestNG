package com.jas;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class DBConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println(this.getClass().getSimpleName() + " -->  @BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(this.getClass().getSimpleName() + " -->  @AfterSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(this.getClass().getSimpleName() + " -->  @BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(this.getClass().getSimpleName() + " -->  @AfterTest");
    }
}
