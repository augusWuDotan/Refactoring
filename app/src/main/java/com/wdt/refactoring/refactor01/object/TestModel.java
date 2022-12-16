package com.wdt.refactoring.refactor01.object;

/**
 * 測試模組
 * 生成時，建立一個 TestObject，並將
 */
public class TestModel {
    TestModel() {
        TestObject testObject = new TestObject();

        //定義測試文字 //改用Set定義
        testObject.setTestString("123");

        //加入測試列表文字項目 //改用Set定義
        testObject.getTestStringList().add("123");
        testObject.getTestStringList().add("123");
        //or
//        List<String> customList = new ArrayList<>();
//        customList.add("123");
//        customList.add("123");
//        testObject.setTestStringList(
//                customList
//        );
    }
}

