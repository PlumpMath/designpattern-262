/**   
 * Filename:    Test.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-4-21 下午5:52:06   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.adapter.class_;

public class Test {

    public static void main(String[] args) {// 目的:
                                            // 调动要被适配的类Adaptee中的sampleOperation1方法
        Target target = new Adapter();
        target.sampleOperation2();

    }

}
