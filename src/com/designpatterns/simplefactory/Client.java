package com.designpatterns.simplefactory;

/**
 * @description:客户端测试类
 * @projectName:DesignPatterns
 * @see:com.designpatterns.simplefactory
 * @author:xiaoyige
 * @createTime:2019/7/5 22:45
 * @version:1.0
 */
public class Client {
    public static void main(String[] args) {
//        Chart chart;
//        //创建柱状图
//        chart=ChartFactory.getChart("histogram");
//        chart.display();
//        //创建饼图
//        chart=ChartFactory.getChart("pie");
//        chart.display();
        Chart chart;
        //读取配置文件中的参数
        String type=XmlUtil.getChartType();
        chart=ChartFactory.getChart(type);
        chart.display();
    }
}
