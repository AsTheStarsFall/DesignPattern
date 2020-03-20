package com.tianhy.designprinciple.LSP.geek;

/**
 * @Author: thy
 * @Date: 2020/2/22 23:19
 * @Desc: 里式替换原则测试类
 */
public class LSPTest {

    public static void main(String[] args) {
        Demo demo = new Demo();
        //替换了父类，并且原来的代码逻辑行为没有被破坏
        demo.functon(new FuncExtends(new Func(), "123", 1L));
    }
}
