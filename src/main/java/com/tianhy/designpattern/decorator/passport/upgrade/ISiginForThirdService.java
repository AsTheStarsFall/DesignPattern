package com.tianhy.designpattern.decorator.passport.upgrade;

import com.tianhy.designpattern.decorator.passport.old.ISigninService;
import com.tianhy.designpattern.decorator.passport.old.ResultMsg;

/**
 * 扩展接口继承原来登陆接口（is-a）
 */
public interface ISiginForThirdService extends ISigninService {

    /**
     * QQ登录
     * @param id
     * @return
     */
    ResultMsg loginForQQ(String id);

    /**
     * 微信登录
     * @param id
     * @return
     */
    ResultMsg loginForWechat(String id);

    /**
     * 记住登录状态后自动登录
     * @param token
     * @return
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机号登录
     * @param telphone
     * @param code
     * @return
     */
    ResultMsg loginForTelphone(String telphone, String code);

    /**
     * 注册后自动登录
     * @param username
     * @param passport
     * @return
     */
    ResultMsg loginForRegist(String username, String passport);
}
