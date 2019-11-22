package com.yang.javadatastructure.i_designpattern.c1_strategy_pattern;

/**
 * @author: Jing Yang
 * @date: 11/22/2019
 */
public class Subtract implements Calculation {
    @Override
    public float calculate(float a, float b) {
        return a - b;
    }
}
