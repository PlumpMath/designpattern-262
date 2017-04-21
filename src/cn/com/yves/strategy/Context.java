/**   
 * Filename:    Context.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-17 下午5:26:07   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.strategy;

/**
 * 策略环境
 * 
 * @author Yves He
 * 
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 选择策略方法 执行
     * 
     * @param object
     * @return
     */
    public Object selectStrategy(Object object) {
        return this.strategy.strategyMethod(object);
    }
}
