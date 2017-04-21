/**   
 * Filename:    Test.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-22 上午10:26:20   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {

        Subject realSubject = new RealSubject();
        InvocationHandler handler = new Handler(realSubject);

        /* realSubject中的类 */
        System.out.println("*******类*********");
        System.out.println(realSubject.getClass());// cn.com.yves.proxy.dynamicproxy.RealSubject
        System.out.println();

        /* realSubject中的实现的接口 */
        System.out.println("*******实现的接口*********");
        for (Class<?> clazz : realSubject.getClass().getInterfaces()) {
            System.out.println(clazz.getName());
        }
        System.out.println();

        /**
         * ClassLoader loader: 定义代理类的类加载器(也就是是哪个委托类的类加载器,可以是该委托类实现的接口的类加载器,
         * 一定要是实现了第二个参数中包括的接口的类的类加载器)
         * 
         * 
         * Class<?>[] interfaces: 代理类要实现的接口列表
         * 
         * 
         * InvocationHandler h : 指派方法调用的调用处理程序
         */
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject
                .getClass().getClassLoader(), realSubject.getClass()
                .getInterfaces(), handler);

        System.out.println("代理对象:" + subject.getClass().getName());// 打印结果
                                                                   // cn.com.yves.proxy.dynamicproxy.$Proxy0
        Object request = subject.request(null);
        System.out.println("request: " + request);

        // 实现了多个接口
        Subject2 subject2 = (Subject2) Proxy.newProxyInstance(realSubject
                .getClass().getClassLoader(), realSubject.getClass()
                .getInterfaces(), handler);

        System.out.println(subject2.request2(null));

    }
}

/**
 * 委托类 和 代理类 要实现的接口
 * 
 * @author Yves He
 * 
 */
interface Subject {
    //
    public Object request(Object arg);
}

interface Subject2 {
    //
    public Object request2(Object arg);
}

/**
 * 委托类(也就是真是类)
 * 
 * @author Yves He
 * 
 */
class RealSubject implements Subject, Subject2 {

    @Override
    public Object request(Object arg) {
        return "request1方法被调用!";
    }

    @Override
    public Object request2(Object arg) {
        return "request2方法被调用!";
    }
}

/**
 * 处理器
 * 
 * @author Yves He
 * 
 */
class Handler implements InvocationHandler {

    private final Subject subject;

    public Handler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {// 真正产生代理类的地方

        System.out.println("invoke中参数proxy: " + proxy.getClass().getName()); // proxy
                                                                             // 这个参数可要可不要?

        System.out.println("====before====");// 定义预处理的工作，当然你也可以根据 method
                                             // 的不同进行不同的预处理工作
        Object result = method.invoke(subject, args);

        System.out.println("====after====");

        return result;
    }

}
