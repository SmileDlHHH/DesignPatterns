package com.designpatterns.simplefactory;

/**
 * @description:
 * @projectName:DesignPatterns
 * @see:com.designpatterns.simplefactory
 * @author:xiaoyige
 * @createTime:2019/7/5 22:22
 * @version:1.0
 */
public class LineChart  implements Chart{
    public LineChart(){
        System.out.println("创建折线图");
    }
    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
