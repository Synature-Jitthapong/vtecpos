package com.vtec.j1tth4.vtecpos;

import android.content.Context;

/**
 * Created by j1tth4 on 5/15/15.
 */
public class GlobalVar {
    private static GlobalVar sInstance = null;

    public static GlobalVar getInstance(Context c){
        if(sInstance == null){
            sInstance = new GlobalVar();
        }
        return sInstance;
    }

    private GlobalVar(){

    }
}
