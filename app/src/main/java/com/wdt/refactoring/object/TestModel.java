package com.wdt.refactoring.object;

/**
 * 測試模組
 * 生成時，建立一個 TestObject，並將
 */
public class TestModel {
    TestModel() {
        TestObject testObject = new TestObject();
        //定義測試文字
        testObject.testString = "123";
        //加入測試列表文字項目
        testObject.testStringList.add("123");
        testObject.testStringList.add("123");
    }
}

