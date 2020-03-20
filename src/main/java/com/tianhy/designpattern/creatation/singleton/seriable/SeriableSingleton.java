package com.tianhy.designpattern.creatation.singleton.seriable;

import java.io.Serializable;

/**
 * @Desc: 反序列化时破坏单例
 * @Author: thy
 * @CreateTime: 2019/3/12
 **/
public class SeriableSingleton implements Serializable {
    private static final long serialVersionUID = 8554660153861154696L;

    //序列化就是说把内存中的状态通过转换成字节码的形式
    // 从而转换一个 IO 流，写入到其他地方(可以是磁盘、网络 IO)
    // 内存中状态给永久保存下来了


    //反序列化
    // 将已经持久化的字节码内容，转换为 IO 流
    // 通过 IO 流的读取，进而将读取的内容转换为 Java 对象
    // 在转换过程中会重新创建对象 new
    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance() {
        return INSTANCE;
    }


    //防止序列化，增加readResolve()方法返回实例
    //在源码中，新创建的实例并没有返回，还是原来的
    private Object readResolve() {
        return INSTANCE;
    }

}
