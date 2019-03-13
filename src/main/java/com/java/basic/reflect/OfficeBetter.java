package com.java.basic.reflect;

public class OfficeBetter {

    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            OfficeAble oa = (OfficeAble) c.newInstance();
            oa.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
