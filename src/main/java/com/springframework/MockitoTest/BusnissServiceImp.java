package com.springframework.MockitoTest;

public class BusnissServiceImp {
    public BusnissServiceImp(serviceData serviceDatas) {
        this.serviceDatas = serviceDatas;
    }

    public serviceData serviceDatas;

    public int getGratestnum(){
        int[] data = serviceDatas.retriveAllData();
        int greatst = Integer.MIN_VALUE;
        for (int number : data) {
            if (number > greatst)
                greatst = number;
        }
        return greatst;
    }
}
