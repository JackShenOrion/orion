package com.shenpinyi.algorithms.chapter22;

/**
 * Created by sj on 2017/3/4.
 */
public class Edge <T> {
    private int source;
    private int target;
    private T cost;

    public int getSource() {
        return source;
    }

    public Edge setSource(int source) {
        this.source = source;
        return this;
    }

    public int getTarget() {
        return target;
    }

    public Edge setTarget(int target) {
        this.target = target;
        return this;
    }

    public T getCost() {
        return cost;
    }

    public Edge setCost(T cost) {
        this.cost = cost;
        return this;
    }
}