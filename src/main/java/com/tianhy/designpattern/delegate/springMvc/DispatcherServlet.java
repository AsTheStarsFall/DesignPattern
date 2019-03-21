package com.tianhy.designpattern.delegate.springMvc;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author: thy
 * @CreateTime: 2019/3/20
 **/
public class DispatcherServlet extends HttpServlet {

    private List<Handler> handlerMapping = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        try {
            Class<?> memberController = MemberController.class;
            handlerMapping.add(new Handler()
                    .setController(memberController.getDeclaredConstructor().newInstance())
                    .setMethod(memberController.getMethod("getMemberById",new Class[]{String.class}))
                    .setUrl("/web/getMemberById.json"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        dispatch(req,resp);

    }

    //根据url分发请求
    private void dispatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String url=req.getRequestURI();

        //如果url过多，会造成if else/switch过多
//        switch (url){
//            case "getOrderById":
//                new OrderController().getOrderById(id);
//                break;
//            case "login":
//                new SystemController().login();
//                break;
//                default:
//                    resp.getWriter().write("404 NOT FOUND!");
//        }

        Handler handler = null;
        for (Handler h:handlerMapping) {
            if(h.getUrl().equals(url)){
                handler = h;
                break;
            }
        }
        try {

            Object object = null;
            object = handler.method.invoke(handler.getController(),req.getParameter("mid"));

        }catch (Exception e){
            e.printStackTrace();
        }


    }
    class Handler{
        private Object controller;
        private Method method;
        private String url;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return this;
        }
    }

}
