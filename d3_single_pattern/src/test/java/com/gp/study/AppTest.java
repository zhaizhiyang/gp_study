package com.gp.study;

import static org.junit.Assert.assertTrue;

import com.gp.study.singleton.container.ContainerSingleton;
import com.gp.study.singleton.container.ThreadTest;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        new ThreadTest().start();
        new ThreadTest().start();
        new ThreadTest().start();
        System.out.println("开启3个线程");
    }
}
