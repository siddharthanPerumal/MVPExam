package com.siddharth.mvpexam;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

import static org.junit.Assert.*;

public class MainActivityPresenterTest {
    @Mock
    IncrementBaseinterface.Model model;

    @Mock
    IncrementBaseinterface.View view;

    MainActivityPresenter mPresenter;

    @Before
    public void setUp() throws Exception {
        //dataHolder = new DataHolder();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void add() {
        mPresenter = new MainActivityPresenter(view,model);
        mPresenter.add(0);
        verify(model).increment(0);
        verify(view).updateView(0);
    }
}