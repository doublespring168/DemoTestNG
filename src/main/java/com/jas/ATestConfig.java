package com.jas;

import org.testng.annotations.Test;

/**
 * Created by jasmine529 on 2018/10/17.
 */
public class ATestConfig {
    @Test
    public void runtest1() {
        System.out.println(this.getClass().getSimpleName() + " -->  @Test —— runtest1");
    }

    @Test
    public void runtest2() {
        System.out.println(this.getClass().getSimpleName() + " -->  @Test —— runtest2");
    }
}
