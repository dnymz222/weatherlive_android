package com.xueping.weatherlive.network;

import android.util.Log;

import java.io.IOException;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;

import java.lang.String;
import java.lang.Object;
import java.util.Map.Entry;
import java.util.Map;


import com.alibaba.fastjson.JSONObject;
import com.xueping.weatherlive.helper.MyApplication;


public class Basenetwork {

    public static final String host = "https://www.xunquan.shop/api/v3.0";
    //public static final String host = "http://127.0.0.1:5000/api/v2.0";
    private OkHttpClient client;

    public Basenetwork()
    {
        client =new  OkHttpClient();

    }


    public void sentGetRequest(String path, Map<String ,String> paramaters, final NetCallback netback)
    {


        Request request = new Request.Builder()
                .url(this.createUrl(path,paramaters))
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                IOException ne = new IOException("网络异常");

                netback.onFailure(ne,201);


            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = null;
                if (null != response.cacheResponse()) {
                    string = response.cacheResponse().body().string();

                } else {

                    string = response.body().string();


                }

                try {
                    JSONObject json = JSONObject.parseObject(string);
                    Map map = (Map) json;
                    if ((int) map.get("code") == 200) {
                        Object data = map.get("data");
                        //Log.i("data",data.toString());
                        netback.onSuccess(data, response);
                    } else {
                        IOException e = new IOException((String) (map.get("message")));
                        int code = (int) map.get("code");
                        netback.onFailure(e,code);
                    }

                }catch (com.alibaba.fastjson.JSONException exception){

                    IOException e = new IOException("");

                    netback.onFailure(e,201);

                }
                finally {

                }
            }

        });



    }



    public void  requestWeather(Map<String ,String> paramaters, final NetCallback netback){

            String path  ="/weather";
        Request request = new Request.Builder()
                .url(this.createUrl(path,paramaters))
                .build();

        Call call = client.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                IOException ne = new IOException("网络异常");

                netback.onFailure(ne,201);


            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = null;
                if (null != response.cacheResponse()) {
                    byte[] bytes = response.cacheResponse().body().bytes();

                    string =GZipUtil.uncompressToString(bytes);

                } else {

                   byte[] bytes  = response.body().bytes();

                    string =GZipUtil.uncompressToString(bytes);

                }



                try {
                    JSONObject json = JSONObject.parseObject(string);
                    Map map = (Map) json;

//                    Log.i("weather",map.toString());
//                    if ((int) map.get("code") == 200) {
//                        Object data = map.get("data");
//                        //Log.i("data",data.toString());
                        netback.onSuccess(map, response);
//                    } else {
//                        IOException e = new IOException("没有更多数据了");
//
//                        netback.onFailure(e);
//                    }

                }catch (com.alibaba.fastjson.JSONException exception){

                    IOException e = new IOException("");

                    netback.onFailure(e,201);

                }
                finally {

                }
            }

        });



    }



    public String createUrl(String path,Map<String,String > paramaers)
    {
        String  string =  host + path + "?" ;

        for (Entry<String,String > entry:paramaers.entrySet())
        {
            String keyvalue = entry.getKey() + "=" + entry.getValue();
            string = string +  keyvalue + "&";
        }

        String localVersion = "1.0";
        if (MyApplication.localversion != null) {
            localVersion = MyApplication.localversion;
        }



        string = string + "appVersion=" + localVersion +"&os=android&adzoneId=97626950033&source=fishingweather";



     Log.i("urlstring",string);

        return string;

    }




}
