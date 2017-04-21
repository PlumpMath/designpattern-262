/**   
 * Filename:    Strategy.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-17 下午5:14:26   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.strategy;

/**
 * 抽象策略类: (也可以用Interface 但是考虑到可能要存放一些策略类的共性成员 ,方便继承建议用abstract类)
 * 
 * @author Yves He
 * 
 */
public abstract class Strategy {

    // 这里还可以定义一些 所有策略有共性的 成员

    /**
     * 策略方法
     * 
     * @param object
     * @return
     */
    public abstract Object strategyMethod(Object object);

}
