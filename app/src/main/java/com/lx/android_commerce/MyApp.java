package com.lx.android_commerce;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.greendao.gen.DaoMaster;
import com.greendao.gen.DaoSession;
import com.lx.android_commerce.weight.entity.GreenCache;
import com.lx.lib_core.weight.utils.LogUtil;
import com.zhy.autolayout.config.AutoLayoutConifg;

import java.util.List;

public
/**
 *@author : 阿森
 *@date : 2020-10-24 10:42
 *@params : 
 *@description:
 */
class MyApp extends Application {

    private static MyApp instance;
    private DaoMaster.DevOpenHelper mHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initDao();
        //初始化屏幕适配
        AutoLayoutConifg.getInstance().useDeviceSize();
    }

    public static MyApp getInstance() {
        return instance;
    }

    private void initDao() {
        mHelper = new DaoMaster.DevOpenHelper(this,"dark_cache.db");
        db = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }

    public DaoSession getDaoSession(){ return mDaoSession; }

    public void insertLocalData(int id,String value) {
        List<GreenCache> greenCaches = mDaoSession.getGreenCacheDao().loadAll();
        boolean isExist = false;
        //判断是否有重复的用户ID
        for (GreenCache greenCache : greenCaches) {
            if(greenCache.getId() == id) {
                isExist = true;
            }
        }

        if(!isExist) {
            mDaoSession.getGreenCacheDao().insert(new GreenCache((long) id,value));
        } else {
            LogUtil.getInstance().LogE("存入数据库失败,ID以存在",202);
        }
    }

}
