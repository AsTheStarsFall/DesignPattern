package com.tianhy.designpattern.proxy.dynamicProxy.jdkProxy;

import com.tianhy.designpattern.proxy.staticProxy.Person;



/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/15
 **/
public class JDKProxyTest {

    public static void main(String[] args) {
        Person person = (Person) new JDKMeipo().getInstance(new SinglePerson());
        person.findLove();

//        try {
//            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
//            FileOutputStream fos = new FileOutputStream("D://$Proxy0.class");
//            fos.write(bytes);
//            fos.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

    }
}
