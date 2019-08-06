package com.bwei;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<Integer>();

        // 读取并解析XML文档

        // SAXReader就是一个管道，用一个流的方式，把xml文件读出来

        // SAXReader reader = new SAXReader(); //User.hbm.xml表示你要解析的xml文档

        // Document document = reader.read(new File("User.hbm.xml"));

        // 下面的是通过解析xml字符串的
        SAXReader saxReader = new SAXReader();
        //通过获得当前线程，然后获取当前的类加载器，来获取对应的资源
        //read之后会返回一个document对象
        Document read = saxReader.read(new File("D:\\dianshang1611B\\dianshang2\\test01\\src\\main\\java\\com\\bwei\\array.xml"));//这里也可以直接读取文件reader.read(new File("sarray.xml"))
        //获取根节点元素对象
        Element node = read.getRootElement();
        //获取子节点
        System.err.println("当前节点的名字:"+node.getName());
        //获取当前节点所有的属性
    /*    List<Attribute> attributes = node.attributes();
        for (Attribute name :attributes ){
            System.err.println("节点名字是:"+name.getText()+"节点属性是:"+name.getStringValue());
        }
*/
        List<Element> value = node.elements("value");
        for (Element name :value){
            System.err.println(name.getText());
            list.add(Integer.parseInt(name.getText()));
        }


    }



}
