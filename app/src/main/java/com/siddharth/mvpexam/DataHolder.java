package com.siddharth.mvpexam;

public class DataHolder implements IncrementBaseinterface.Model{
    @Override
    public int increment(int value) {
        value += 1;
        return value;
    }

   /* public int increment(int value){
        value += 1;
       return value;
    }*/


}
