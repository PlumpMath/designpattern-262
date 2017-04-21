/**   
 * Filename:    Test.java   
 * Copyright:   Copyright (c)2016  
 * Company:     Yves  
 * @version:    1.0    
 * Create at:   2017-3-17 下午4:50:56   
 * Description:  
 *
 * Author       Yves He 
 */
package cn.com.yves.strategy;

import cn.com.yves.strategy.allstrategy.Strategy1;
import cn.com.yves.strategy.allstrategy.Strategy2;
import cn.com.yves.strategy.allstrategy.Strategy3;

public class Test {

    public static void main(String[] args) {

        /* 这里的策略选择交给 client客户端 , ps这里可以用一个工厂方法模式来生成对象 */

        String selectString = "Strategy1";// 改变选择的条件

        Strategy strategy = null;
        switch (selectString) {
        case "Strategy1":
            strategy = new Strategy1();
            break;
        case "Strategy2":
            strategy = new Strategy2();
            break;
        case "Strategy3":
            strategy = new Strategy3();
            break;
        default:
            break;
        }

        // 创建环境Context
        Context context = new Context(strategy);

        // 选择策略方法计算
        Object result = context.selectStrategy(new Object());// new Object()
                                                             // 为要传递的参数

        System.out.println(result);
    }

}
