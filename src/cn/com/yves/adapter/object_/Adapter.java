package cn.com.yves.adapter.object_;

/**
 * Filename: Adapter.java Copyright: Copyright (c)2016 Company: Yves
 * 
 * @version: 1.0 Create at: 2017-4-21 下午6:09:07 Description:
 * 
 *           Author Yves He
 */
public class Adapter implements Target {
    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee有方法sampleOperation1 因此适配器类直接委派即可(这里类似于代理模式)
     */
    @Override
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    /**
     * 源类Adaptee没有方法sampleOperation2 因此由适配器类需要补充此方法
     */
    @Override
    public void sampleOperation2() {
        // 写相关的代码
        System.out.println("Adaptee中没有的方法,需要适配器自己来实现的方法sampleOperation2.");
    }
}