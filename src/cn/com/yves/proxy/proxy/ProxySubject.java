/**   
 * Filename:    ProxySubject.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-22 上午10:08:50   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.proxy.proxy;

public class ProxySubject extends Subject {

    private final RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        realSubject.request();
    }

    public void beforeRequest() {// 代理之前要做的事情
        System.out.println("代理之前要做的事情");
    }

    public void afterRequest() {// 代理之后要做的事情
        System.out.println("代理之后要做的事情");
    }

}
