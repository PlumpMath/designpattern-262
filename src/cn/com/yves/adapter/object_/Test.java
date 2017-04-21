/**   
 * Filename:    Test.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-4-21 下午6:13:14   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.adapter.object_;

public class Test {

    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);

        target.sampleOperation1();
        target.sampleOperation2();

    }

}
