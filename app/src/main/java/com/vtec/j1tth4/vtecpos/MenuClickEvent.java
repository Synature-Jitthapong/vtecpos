package com.vtec.j1tth4.vtecpos;

/**
 * Created by j1tth4 on 18/5/2558.
 */
public class MenuClickEvent {
    private int orderId;

    public MenuClickEvent(int orderId){
        this.orderId = orderId;
    }

    public int getOrderId(){
        return orderId;
    }
}
