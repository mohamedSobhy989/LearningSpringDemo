package com.springframework.MockitoTest;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/*
* the mechanism of mockito is very usefull
* if we need to test new data or new case just use three step without creating new class every one like stubs
* mock function take classname.class
* when/thenReturn functions --> when : take function name it's mean when we call this function then return new data
* */
@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceMockTest {

    @Mock
    dataService dataService2;
    @InjectMocks
    BusnissServiceImp busnissServiceImp;
    @Test
    public void testGetGratestnum(){

        when(dataService2.retriveAllData()).thenReturn(new int[] {24,55,44});
        int result = busnissServiceImp.getGratestnum();
        assertEquals(55,result);
    }

    @Test
    public void testGetGratestnumforOnenum(){

        dataService dataService2 = mock(dataService.class);
        when(dataService2.retriveAllData()).thenReturn(new int[] {24});
        BusnissServiceImp busnissServiceImp = new BusnissServiceImp(dataService2);
        int result = busnissServiceImp.getGratestnum();
        assertEquals(55,result);
    }
    @Test
    public void testGetGratestnumforZeronum(){

        dataService dataService2 = mock(dataService.class);
        when(dataService2.retriveAllData()).thenReturn(new int[] {});
        BusnissServiceImp busnissServiceImp = new BusnissServiceImp(dataService2);
        int result = busnissServiceImp.getGratestnum();
        assertEquals(55,result);
    }


}


