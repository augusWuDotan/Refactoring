package com.wdt.refactoring.refactor01.object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 測試物件
 * 包含
 * testString 測試文字
 * testStringList 測試文字列表
 */
public class TestObject {

    //增加 get / set ; 並修改參數的權限 public -> private
    private String testString = null;
    private List<String> testStringList = new ArrayList<>();


    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public List<String> getTestStringList() {
        return testStringList;
    }

    public void setTestStringList(List<String> testStringList) {
        this.testStringList = testStringList;
    }

    //增加 addTestStringList method
    //並修改model建立方式
    public void clearTestStringList() {
        this.testStringList.clear();
    }

    public void addTestStringList(String testString) {
        testStringList.add(testString);
    }

    //增加 addTestStringVarags method
    //並修改model建立方式
    public void addTestStringVarags(String... testStrings) {
        Collections.addAll(testStringList, testStrings);
    }
}
