package com.company.design;

import com.company.design.adapter.*;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {
/*
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
*/
        HairDeyer hairDeyer = new HairDeyer();
        connect(hairDeyer);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new SocketAdapter(airConditioner);
        connect(adapter);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanadapter = new SocketAdapter(cleaner);
        connect(cleanadapter);

    }

    public static void connect(Electronic110V electronic110V){
        electronic110V.poweron();
    }
}