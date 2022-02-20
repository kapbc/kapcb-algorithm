package com.kapcb.ccc.algorithm.thread;


import java.util.concurrent.Callable;

/**
 * <a>Title: TestTask </a>
 * <a>Author: Kapcb <a>
 * <a>Description: TestTask <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/20 21:29
 * @since 1.0
 */
public class TestTask implements Callable<Boolean> {

    private int submitTimes;

    public TestTask(int submitTimes) {
        this.submitTimes = submitTimes;
    }

    @Override
    public Boolean call() throws Exception {
        for (int i = 0; i < this.submitTimes; i++) {

        }
        return null;
    }

}
