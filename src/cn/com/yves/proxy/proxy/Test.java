/**   
 * Filename:    Test.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-22 上午10:04:43   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.proxy.proxy;


public class Test {

    public static void main(String[] args) {

        ProxySubject proxy = new ProxySubject();

        proxy.beforeRequest();
        proxy.request();
        proxy.afterRequest();

    }

}
