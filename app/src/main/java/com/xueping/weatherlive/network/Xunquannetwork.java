package com.xueping.weatherlive.network;

import java.io.IOException;
import java.util.Map;

import okhttp3.Response;

public class Xunquannetwork extends Basenetwork {

    private static final String  CouponsearchPath = "/xunquan/search";
    private static final String  AllcatePath = "/xunquan/allcate";
    private static final String  catePath = "/fish/cate";
    private static final String  pinpaicatePath = "/xunquan/pinpai/cate";
    private static final String  muyincatePath = "/xunquan/muyin/cate";

    private static final String  CatCouponPath  = "/xunquan/cat/";
    private static final String  couponRecommendPath = "/xunquan/recommend";
    //    #define homePath @"/xunquan/home"
//            #define sec(secstring)   [NSString stringWithFormat:@"/xunquan/sec/%@",secstring]
    private static final String homepath = "/xunquan/home";
    private static final String secpath = "/xunquan/sec/";
    private static final String configpath = "/xunquan/config";
    private static final String specialItemPath = "/xunquan/column/config";
    private static final  String subcatesearchpath = "/xunquan/search/cat/";
    private static final  String qianggouAllcatepath = "/qianggou/cate";
    private static final  String  qianggoucatepath = "/qianggou/new/cat/";
    private static final  String  qianggounearcatepath = "/qianggou/near/cat/";
    private static final  String pintuanlistpath = "/pintuan/list";
    private static final  String jusearchpath = "/ju/search";
    private static final  String searchHintPath = "/xunquan/search/hint";
    private static final String specialPath = "/xunquan/special/";
    private static final  String couponcheckPath = "/xunquan/search/check";
    private static final  String fishingsearchpath = "/xunquan/search/cat/50013886";

    private static final  String lunitidalSitePath = "/lunitidalsite";
    private static final  String chinatidespath = "/tide/china/forecast";

    private static final String fishbannerpath = "/fish/banner";
    private static final String appitemspath = "/app/items";
    private static final String luanchadpath  =  "/launch/ad";

    private static final String adbannerpath  =  "/ad/banner";
    private static final String addownloadpath = "/ad/download";



    public Xunquannetwork() {

    }

    public void searchCoupon(Map paramaters, final NetCallback callback){

        super.sentGetRequest(CouponsearchPath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }

    public void catCoupon(String url, String cat, Map paramaters, final NetCallback callback){

        String path = url + cat ;
        super.sentGetRequest(path, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);

            }
        });


    }

    public void catCouponUrl(String url,  Map paramaters, final NetCallback callback){

        String path = url ;
        super.sentGetRequest(path, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);

            }
        });


    }

    public void allcate(String s, Map paramaters, final NetCallback callback){

        super.sentGetRequest(AllcatePath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }

    public void cate( Map paramaters, final NetCallback callback){

        super.sentGetRequest(catePath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }




    public void pinpaicate( Map paramaters, final NetCallback callback){

        super.sentGetRequest(pinpaicatePath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }


    public void muyincate( Map paramaters, final NetCallback callback){

        super.sentGetRequest(muyincatePath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }




    public void qianggoucate(Map paramaters, final NetCallback callback){

        super.sentGetRequest(qianggouAllcatepath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }

    public void catqianggou( boolean isNext,String cat, Map paramaters, final NetCallback callback){

        String path ;
        if (isNext) {
            path = qianggounearcatepath + cat;

        } else {
            path = qianggoucatepath + cat;
        }
        super.sentGetRequest(path, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);

            }
        });


    }

    public void pintuanlist(Map paramaters, final NetCallback callback){

        super.sentGetRequest(pintuanlistpath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });

    }






    public  void home(Map paramaters,final NetCallback callback) {

        super.sentGetRequest(homepath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });

    }



    public void config(Map paramaters,final NetCallback callback) {

        super.sentGetRequest(configpath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }


    public void specialconfig(Map paramaters,final NetCallback callback) {

        super.sentGetRequest(specialItemPath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }

    public void fishbanner(Map paramaters,final NetCallback callback) {

        super.sentGetRequest(fishbannerpath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }

    public void subcate(Map paramaters,String cate,final NetCallback callback) {

        String getcatepath = "/xunquan/" + cate +"/subcate";

        super.sentGetRequest(getcatepath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }


    public void subcatesearch(Map paramaters,String cate,final NetCallback callback) {

        String searchcatepath = subcatesearchpath + cate;

        super.sentGetRequest(searchcatepath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }



    public void searchHint(Map paramaters,final NetCallback callback) {



        super.sentGetRequest(searchHintPath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }


    public void getspecial(String specialId,Map paramaters,final NetCallback callback) {


        String path = specialPath + specialId;
        super.sentGetRequest(path, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }

    public void couponSearchCheck(Map paramaters,final NetCallback callback) {



        super.sentGetRequest(couponcheckPath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }


    public  void  fishcouponsearch(Map paramaters,final NetCallback callback){
        super.sentGetRequest(fishingsearchpath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });
    }

    public void lunitidalSite(Map paramaters,final NetCallback callback) {



        super.sentGetRequest(lunitidalSitePath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }

    public void chinatidesforecast(Map paramaters,final NetCallback callback) {



        super.sentGetRequest(chinatidespath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });


    }

    public  void  appitems(Map paramaters,final NetCallback callback){
        super.sentGetRequest(appitemspath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });
    }

    public  void  luanchad(Map paramaters,final NetCallback callback){
        super.sentGetRequest(luanchadpath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });
    }



    public  void  adbanner(Map paramaters,final NetCallback callback){
        super.sentGetRequest(adbannerpath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });
    }


    public  void  addownload(Map paramaters,final NetCallback callback){
        super.sentGetRequest(addownloadpath, paramaters, new NetCallback() {
            @Override
            public void onFailure(IOException e,int code) {
                callback.onFailure(e,code);
            }

            @Override
            public void onSuccess(Object object, Response response) {
                callback.onSuccess(object,response);
            }
        });
    }







}
