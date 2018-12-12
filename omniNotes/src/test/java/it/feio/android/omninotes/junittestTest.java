package it.feio.android.omninotes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class junittestTest {
    private junittest test;
    @Before
    public void setUp() throws Exception{
        test=new junittest();
    }
    @Test
    public void cleanfab() throws Exception{
        assertFalse(test.cleanfab(true));
    }
    @Test
    public void cleanfab1() throws Exception{
        assertFalse(test.cleanfab(false));
    }
}