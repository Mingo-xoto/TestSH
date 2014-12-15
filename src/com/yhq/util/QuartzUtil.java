package com.yhq.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时器类，用来处理一些定时任务
 * 
 * @author Administrator
 * 
 */
public class QuartzUtil {

    /**
     * 任务1
     */
    public void run() {
	System.out.println("taske1 started ....");
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	System.out.println("在" + formatter.format(new Date()) + "执行了一次");
    }

    /**
     * 任务2
     */
    public void start2() {
	System.out.println("task2 excuting...");
    }
}