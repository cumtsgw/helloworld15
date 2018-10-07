package com.matrix;

import java.util.ArrayList;
import java.util.Date;

/**
 * here is doc comment
 */
public class HelloWorld {
    public static int a = 12;
    /*
    here is block comment
     */
    public static void main(String[] args) {
        //region Description
        System.out.println("Hello World!");
        method1();
        ArrayList list = new ArrayList();
        //endregion
    }

    // here is line comment
    public static void method1() {
        System.out.println("here is method1");
        Date date = new Date();
    }
}
