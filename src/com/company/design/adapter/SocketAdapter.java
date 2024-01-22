package com.company.design.adapter;

public class SocketAdapter implements Electronic110V{

    public Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void poweron() {
        electronic220V.connect();
    }

}
