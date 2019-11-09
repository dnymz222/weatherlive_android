package com.xueping.weatherlive.helper;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.widget.Toast;

import com.alibaba.baichuan.android.trade.AlibcTradeSDK;
import com.alibaba.baichuan.android.trade.callback.AlibcTradeInitCallback;

import com.umeng.commonsdk.UMConfigure;

public class MyApplication extends Application {


    private static MyApplication application;
//    public static String APP_ID = "wx11b0be43c651e385";
    public static String localversion;

    public static String taobao = "com.taobao.taobao";
    public static String tmall = "com.tmall.wireless";
    public static String xunquan = "com.xueping.xunquan";
    public static String shouldShowTaobaoKey = "shouldShowTaobaoKey";//0:不显示 1：安装了淘宝就显示，没有安装不显示 3：强制显示淘宝


    @Override
    public void onCreate() {
        super.onCreate();

//        IWXAPI api = WXAPIFactory.createWXAPI(this, APP_ID, false);
//        api.registerApp(APP_ID);


        UMConfigure.init(this,UMConfigure.DEVICE_TYPE_PHONE,null);


        if (MyApplication.shouldShowTaobao()){
            AlibcTradeSDK.asyncInit(this, new AlibcTradeInitCallback() {
                @Override
                public void onSuccess() {
                    //初始化成功，设置相关的全局配置参数

                    // ...
                }

                @Override
                public void onFailure(int code, String msg) {
                    //初始化失败，可以根据code和msg判断失败原因，详情参见错误说明
                    Toast.makeText(MyApplication.getApplication(), "初始化失败："+msg, Toast.LENGTH_LONG).show();
                }
            });

        }



        application = this;

        localversion = MyApplication.getLocalVersion(this);



    }




    public static String getLocalVersion(Context ctx) {
        String localVersion = "0";
        try {
            PackageInfo packageInfo = ctx.getApplicationContext()
                    .getPackageManager()
                    .getPackageInfo(ctx.getPackageName(), 0);
            localVersion = packageInfo.versionName;

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return localVersion;
    }




    public  static   boolean HasBlueTooth() {
        BluetoothAdapter ba = BluetoothAdapter.getDefaultAdapter();
        if (ba == null) {
            return false;
        } else {
            // 如果有蓝牙不一定是有效的。获取蓝牙名称，若为null 则默认为模拟器
            String name = ba.getName();
            if (TextUtils.isEmpty(name)) {
                return false;
            } else {
                return true;
            }
        }
    }



    public static boolean isPkgInstalled(Context context, String pkgName) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(pkgName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            packageInfo = null;
            e.printStackTrace();
        }
        return packageInfo != null;
    }




    public static boolean shouldShowTaobao(){

        return MyApplication.HasBlueTooth();

    }




    public static MyApplication getApplication() {
        return application;
    }

}
