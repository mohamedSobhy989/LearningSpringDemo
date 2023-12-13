package com.springframework.MockitoTest;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
/*
* the behave of sutbs in test is
* every time i need to test by deffrant data i will create new class of service data and give new static data from me
* */
public class BusinessServicestubsTest {

    @Test
    public void testGetGratestnum(){
        BusnissServiceImp busnissServiceImp = new BusnissServiceImp(new dataService());
        int result = busnissServiceImp.getGratestnum();
        assertEquals(55,result);
    }

}


class  dataService implements serviceData{
    @Override
    public int[] retriveAllData() {
        return new int[]{24,3,55,44};
    }
}