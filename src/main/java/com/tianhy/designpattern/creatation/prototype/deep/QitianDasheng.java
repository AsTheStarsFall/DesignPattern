package com.tianhy.designpattern.creatation.prototype.deep;


import java.io.*;
import java.util.Date;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class QitianDasheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public QitianDasheng() {
        //只是初始化
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    //深克隆
    public Object deepClone() {
        try {
            //通过字节码在内存中写入对象
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //读
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            //转换成对象,一个新的对象
            QitianDasheng qitianDasheng = (QitianDasheng) ois.readObject();
            qitianDasheng.birthday = new Date();
            return qitianDasheng;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //浅克隆
    public QitianDasheng shallowClone(QitianDasheng original) {
        QitianDasheng qitianDasheng = new QitianDasheng();
        qitianDasheng.birthday = new Date();
        qitianDasheng.jinGuBang = original.jinGuBang;
        qitianDasheng.height = original.height;
        qitianDasheng.weight = original.weight;

        return qitianDasheng;
    }
}
