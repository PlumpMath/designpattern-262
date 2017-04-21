/**   
 * Filename:    Strategy2.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-17 下午5:18:43   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.strategy.allstrategy;

import cn.com.yves.strategy.Strategy;

/**
 * 策略2
 * 
 * @author Yves He
 * 
 */
public class Strategy2 extends Strategy {

    @Override
    public Object strategyMethod(Object object) {// 策略2的据图策略算法
        return Strategy2.class;
    }

}
