/**   
 * Filename:    Adapter.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-4-21 下午5:56:15   
 * Description:  适配器(Adaper)角色
 * 
 * 适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。
 *
 * Author       Yves He 
 */
package cn.com.yves.adapter.class_;

public class Adapter extends Adaptee implements Target {

    /**
     * 适配器角色Adapter扩展了Adaptee,同时又实现了目标(Target)接口。
     * 
     * 由于Adaptee没有提供sampleOperation2() 方法，而目标接口又要求这个方法，因此适配器角色Adapter实现了这个方法。
     */
    @Override
    public void sampleOperation2() {
        this.sampleOperation1();
    }

}
