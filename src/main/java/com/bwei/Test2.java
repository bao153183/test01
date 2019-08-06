package com.bwei;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Test2 {

    public static void main(String[] args) throws Exception {

        //简历一个通道 以流的形式读取xml
        SAXReader saxReader = new SAXReader();
        //连接xml 解析  返回一个Document 对象 这个对象就是解析完之后的xml对象
        Document read = saxReader.read(new File("D:\\dianshang1611B\\dianshang2\\test01\\src\\main\\java\\com\\bwei\\array.xml"));
        ////获取这个对象(xml)的所有节点(根节点)
        Element node = read.getRootElement();
        //获取根节点下 所有的节点值
        // System.out.println("当前xml根节点的名称：：" + node.getName()+"xml根节点数据"+node.getStringValue());
        //获取某个子节点
        Element numbers = node.element("numbers");
        //取得某节点下所有名为“value”的子节点，并进行遍历
        List<Element> value = node.elements("value");
        for (Element name:value){
            System.err.println("value节点的名字:"+name.getName()+"value节点的值:"+name.getText());
        }

        System.err.println("---------------------------------分割线-------------------------------------------");
        //5.对某节点下的所有子节点进行遍历.
        for(Iterator it = node.elementIterator(); it.hasNext();){
            Element element = (Element) it.next();
            System.err.println("遍历的节点名:"+element.getName()+"遍历节点的值:"+element.getText());
            // do something
        }
        //在某节点下添加一个节点   这个设置的节点名字
        Element dnf = node.addElement("DNF");
        //为这个节点下添加值
        dnf.addAttribute("id","红王爷天下第一");



    }
}
