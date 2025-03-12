package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MainApp;

public class MainAppTest {
	@Test
    public void test1() {
    MainApp map = new MainApp();
    int result = map.addition(8, 6);
    assertEquals(14, result);
}
	@Test
    public void test2() {
    MainApp map = new MainApp();
    int result = map.addition(8, -8);
    assertEquals(0, result);
}

}
