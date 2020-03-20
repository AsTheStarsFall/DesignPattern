package com.tianhy.designpattern.structural.adapter.loginadapter.version2;

import com.tianhy.designpattern.structural.adapter.loginadapter.ResultMsg;
import com.tianhy.designpattern.structural.adapter.loginadapter.version1.service.SiginService;
import com.tianhy.designpattern.structural.adapter.loginadapter.version2.adapters.*;

import java.lang.reflect.InvocationTargetException;

/**
 * @Desc: 新旧接口都在这个适配器当中,继承老版本登陆接口（is-a），实现新版本扩展登陆接口(has-a)
 * @Author: thy
 * @CreateTime: 2019/3/21
 **/
public class PassportForThirdAdapter extends SiginService implements PassportForThird {

    // 综合策略、工厂、适配器模式

    //通过调用各自的适配器进行登陆
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id, LoginForWechatAdapter.class);

    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token, LoginForTokenAdapter.class);

    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return processLogin(telphone, LoginForTelAdapter.class);

    }

    //原来的登陆
    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,passport);
        return super.login(username,passport);
    }

    //工厂
    //新的登陆，通过传入各自的适配器实现各自的登陆方法
    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz){
        try {
            //因为是动态传过来的适配器，不知道是哪一个，要判断是否是它的一个实例
            LoginAdapter adapter = clazz.getConstructor().newInstance();
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
