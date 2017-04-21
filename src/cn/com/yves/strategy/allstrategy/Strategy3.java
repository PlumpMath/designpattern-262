/**   
 * Filename:    Strategy3.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-17 下午5:20:49   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.strategy.allstrategy;

import cn.com.yves.strategy.Strategy;

/**
 * 策略3
 * 
 * @author Yves He
 * 
 */
public class Strategy3 extends Strategy {

    @Override
    public Object strategyMethod(Object object) {// 策略3的据图策略算法
        return Strategy3.class;
    }

}
