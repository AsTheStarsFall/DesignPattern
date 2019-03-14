package com.tianhy.designpattern.prototype.masteryi;

import java.io.*;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class Jiansheng extends Hero implements Cloneable, Serializable {


    public Jiansheng() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }

    public Object deepClone(){

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Jiansheng js = (Jiansheng) ois.readObject();
            return js;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
