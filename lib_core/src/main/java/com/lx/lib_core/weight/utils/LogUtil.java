package com.lx.lib_core.weight.utils;

import android.util.Log;

public
/**
 *@author : 阿森
 *@date : 2020-10-16 09:37
 *@params : 
 *@description:
 */
class LogUtil {
    private static LogUtil instance;

    public static LogUtil getInstance() {
        if(instance == null) {
            instance = new LogUtil();
        }
        return instance;
    }

    public void LogI(Object msg) {
        Log.i("gfs", "LogI: "+msg);
    }

    public void LogE(Object msg,int errorCode) {
        Log.e("gfs", "LogE: "+msg+"错误码:"+errorCode );
    }

}
