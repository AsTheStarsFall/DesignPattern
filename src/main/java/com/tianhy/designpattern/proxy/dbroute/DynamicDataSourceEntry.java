package com.tianhy.designpattern.proxy.dbroute;

/**
 * @Desc: 动态切换数据源
 * @Author: thy
 * @CreateTime: 2019/3/14
 **/
public class DynamicDataSourceEntry {

    //默认数据源
    private static final String DEFAULT_SOURCE = null;

    //用ThradLocal单例实现
    private static final ThreadLocal<String> local = new ThreadLocal<>();

    public DynamicDataSourceEntry() {
    }

    //清空数据源
    public static void clear(){
        local.remove();
    }
    //获取当前数据源名称
    public static String get(){
        return local.get();
    }

    //还原当前数据源
    public static void restore(){
        local.set(DEFAULT_SOURCE);
    }

    //设置数据源名称
    public static void set(String name){
        local.set(name);
    }

    //根据年份动态设置数据源
    public static void set(int year){
        local.set("DB_"+year);
    }
}
