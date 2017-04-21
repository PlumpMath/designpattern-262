/**   
 * Filename:    RealSubject.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-22 上午10:07:22   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.proxy.proxy;

/**
 * 要操作的 真实对象类
 * 
 * @author Yves He
 * 
 */
public class RealSubject extends Subject {

    @Override
    public void request() {
        System.out.println("真实的对象方法!");
    }

}
