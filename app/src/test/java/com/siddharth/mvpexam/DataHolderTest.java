package com.siddharth.mvpexam;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DataHolderTest {
    @Mock
    IncrementBaseinterface.Presenter presenter;

    DataHolder dataHolder;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        //MockitoAnnotations.initMocks(this);
    }

    @Test
    public void increment() {
        dataHolder = new DataHolder();
        int newTemp = dataHolder.increment(0);
        assertThat(newTemp == 1, is(true));
    }
}