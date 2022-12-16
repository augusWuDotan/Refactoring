package com.wdt.refactoring.refactor01.object;

import java.util.ArrayList;
import java.util.List;

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
//        testObject.getTestStringList().add("123");
//        testObject.getTestStringList().add("123");

        //共用字串、清空陣列
//        String inputString = "123";
//        List<String> testStringList = new ArrayList<>();
//        testStringList.add(inputString);
//        testStringList.add(inputString);
//        testObject.setTestStringList(
//                testStringList
//        );

        //增加 addTestStringList method
//        String inputString = "123";
//        testObject.clearTestStringList();
//        testObject.addTestStringList(inputString);
//        testObject.addTestStringList(inputString);

        //增加 addTestStringList method(varags)
        String inputString = "123";
        testObject.clearTestStringList();
        testObject.addTestStringVarags(inputString,inputString);
    }
}

