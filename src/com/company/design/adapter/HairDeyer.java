package com.company.design.adapter;

public class HairDeyer implements Electronic110V{
    @Override
    public void poweron() {
        System.out.println("헤어드라이기 110v");
    }
}
