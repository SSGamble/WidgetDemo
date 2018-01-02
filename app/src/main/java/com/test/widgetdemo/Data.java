package com.test.widgetdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * ====================== 列表数据操作类 ========================
 * 模拟数据库
 * @author SGamble
 */
public class Data {

    private static List<String> lstData = new ArrayList<>();

    /**
     * 获取数据
     * --初始化了一些数据
     * @author Gamble
     */
    public static List getLst() {
        lstData.add("q");
        lstData.add("w");
        lstData.add("e");
        return lstData;
    }

    /**
     * 添加
     * @author Gamble
     */
    public static void addLst(String str) {
        lstData.add(str);
    }

    /**
     * 删除
     * @author Gamble
     */
    public static void del(int position) {
        lstData.remove(position);
    }
}
