package com.designpatterns.simplefactory;

/**
 * @description:
 * @projectName:DesignPatterns
 * @see:com.designpatterns.simplefactory
 * @author:xiaoyige
 * @createTime:2019/7/5 22:21
 * @version:1.0
 */
public class PieChart implements Chart {
    public PieChart(){
        System.out.println("创建饼图");
    }
    @Override
    public void display() {
        System.out.println("显示饼图");
    }
}
