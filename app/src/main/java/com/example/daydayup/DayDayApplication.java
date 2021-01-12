package com.example.daydayup;

import android.app.Application;
import android.content.Context;

public class DayDayApplication extends Application {
private static Context context;//静态方法处理静态变量
@Override
    public void onCreate(){
super.onCreate();
context=getApplicationContext();//重写父类方法，不改变，只是添加一个获得context的方法
}
public static Context getContext(){
    return context;
}
//类方法（静态方法）：用static所有对象共享一个方法，节省栈的开销
    //静态方法不能访问非静态变量
    //java规则：静态变量原则上用静态方法去访问和操作
}
