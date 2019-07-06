package com.designpatterns.simplefactory;

/**
 * @description:
 * @projectName:DesignPatterns
 * @see:com.designpatterns.simplefactory
 * @author:xiaoyige
 * @createTime:2019/7/5 22:19
 * @version:1.0
 */
public class HistogramChart implements Chart {
    public HistogramChart(){
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
