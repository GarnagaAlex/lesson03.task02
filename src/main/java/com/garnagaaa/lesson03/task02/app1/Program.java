package com.garnagaaa.lesson03.task02.app1;

public class Program {
    public static void main(String[] args) {
        ObjectBox oBox = new ObjectBox();
        oBox.addObject("www");
        oBox.addObject(2);
        oBox.addObject(6);
        oBox.deleteObject(6);
        System.out.println(oBox.dump());
    }
}