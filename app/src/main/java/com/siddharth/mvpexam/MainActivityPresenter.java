package com.siddharth.mvpexam;

public class MainActivityPresenter implements IncrementBaseinterface.Presenter {
   private IncrementBaseinterface.Model dataHolder;
    IncrementBaseinterface.View view;
    public MainActivityPresenter(IncrementBaseinterface.View view,IncrementBaseinterface.Model dataHolder){
        this.dataHolder = dataHolder;
        this.view = view;
    }

    @Override
    public void add(int value) {
       int result = dataHolder.increment(value);
        view.updateView(result);
    }
}
