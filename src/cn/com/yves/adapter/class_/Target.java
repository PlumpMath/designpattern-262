/**   
 * Filename:    Target.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-4-21 下午5:53:21   
 * Description:  目标(Target)角色
 * 
 * 这就是所期待得到的接口。 里面定义需要执行的方法
 *
 * Author       Yves He 
 */
package cn.com.yves.adapter.class_;

public interface Target {

    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();

    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();

}
