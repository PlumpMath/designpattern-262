/**   
 * Filename:    Strategy1.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-17 下午5:17:57   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.strategy.allstrategy;

import cn.com.yves.strategy.Strategy;

/**
 * 策略1
 * 
 * @author Yves He
 * 
 */
public class Strategy1 extends Strategy {

    @Override
    public Object strategyMethod(Object object) {// 策略1的据图策略算法
        return Strategy1.class; // 这里就没有写算法处理参数了,只是统一打印类测试
    }

}
