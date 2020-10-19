package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
Main main;
    @BeforeEach
    void setUp() {
       main = new Main();
    }

    @Test
    void testF() {
        double expected =4;
        double rez=main.f(2);
        assertEquals(expected,rez,0.00001);
    }

    @Test
    void testFill() {
        main.fillX(0,1,0.1);
        assertEquals(0.3,main.x[3],0.000001);
        for (int i = 0; i <main.x.length ; i++) {
            System.out.printf("%24.20f \n",main.x[i]);
        }


    }

    @Test
    void testFillY() {
        main.fillX(0,1,0.1);
        main.fillY(main.x);
        assertEquals(0.09,main.y[3],0.000001);
        for (int i = 0; i <main.x.length ; i++) {
            System.out.printf("x= %24.20f  y= %24.20f \n",main.x[i],main.y[i]);
        }


    }

    @Test
    void testSumElementArray() {
        double [] a ={1.2,6,10};
        assertEquals(17.2,main.sumElementArray(a),0.001,"sum");

    }
}