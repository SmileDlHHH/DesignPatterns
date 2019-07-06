package com.designpatterns.simplefactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @description:
 * @projectName:DesignPatterns
 * @see:com.designpatterns.simplefactory
 * @author:xiaoyige
 * @createTime:2019/7/6 8:55
 * @version:1.0
 */
public class XmlUtil {
    /**
     * 该方法用于从Xml中提取图表类型，并返回类型名
     *
     * @return
     */
    public static String getChartType() {
        //创建文档对象
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src//com//designpatterns//simplefactory//config.xml"));

            //获取包含图表类型的文本结点
            NodeList nodeList = document.getElementsByTagName("chartType");
            Node classNode = nodeList.item(0).getFirstChild();
            String chartType = classNode.getNodeValue().trim();
            return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
