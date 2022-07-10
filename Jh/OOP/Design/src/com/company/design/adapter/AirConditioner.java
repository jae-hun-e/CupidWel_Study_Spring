package com.company.design.adapter;

public class AirConditioner implements Electronic110v{
    @Override
    public void poverOn() {
        System.out.println("에어컨 220v on");
    }
}
