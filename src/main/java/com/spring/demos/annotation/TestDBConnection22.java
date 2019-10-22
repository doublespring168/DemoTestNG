package com.spring.demos.annotation;

import org.testng.annotations.Test;

@Test
public class TestDBConnection22 {

    @Test
    public void runOtherTest1() {
        System.out.println("    _____" + this.getClass().getSimpleName() + "_____===========  @Test - runOtherTest1");
    }

    @Test
    public void runOtherTest2() {
        System.out.println("    _____" + this.getClass().getSimpleName() + "_____===========  @Test - runOtherTest2");
    }

}