package com.wuxin.java;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {

    //prsf
    private static final int see = 99;

    //psf
    public static final int NUM  = 11;
    public static final String sdsds = "dsfsdf";


    public static void main(String[] args){

        System.out.println("Hello World!");

        //1.sout, soutv;soutp;soutm;
        System.out.println("sdds");
        System.out.println("HelloWorld.main");
        System.out.println("args = " + Arrays.deepToString(args));

        //2.fori, iter,itar

        /*for (int i = 0; i < 10; i++) {
            System.out.println("sds");
        }

        for (String arg : args) {
            System.out.println("true = " + true);
        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];*/

//      3.list.for
        ArrayList list = new ArrayList();
        list.add(e:123);
        list.add(e:123);
        list.add(e:123);

        for (Object o : list) {
            
        }
        // list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //5.ifn  xxx.null
        if (list == null) {

        }

        //inn     xxx.nn
        if (list != null) {

        }

    }
    }
}





