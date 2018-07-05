package com.siddharth.mvpexam;

public interface IncrementBaseinterface {
    interface View {
        public void updateView(int value);
    }
    interface Presenter {
        public void add(int value);
    }
    interface Model{
        int increment(int value);
    }
}
