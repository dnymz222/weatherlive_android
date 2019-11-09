package com.xueping.weatherlive.helper;

/**
 * Created by xueping on 2019/8/6.
 */

public class FishUnitTransTool {


    public static float nieshitransfromhuashi(float huashi)

    {


        float nieshi = 5/9.f*(huashi-32.f);
        return nieshi;
    }

    public  static  float mmtransfrominches(float inches) {

        return inches*2.54f*10;
    }

    public static float kmtransfrommiles(float miles ){
        return miles *1.60931f;
    }


    public static String hundrepercentfromfloat(float value) {

        int intvalue =(int) (value *100);
        String string = String.format("%d",intvalue);
        return string + "%";

    }



    public static int directiontypetranfromeWindBearing(int windBearing) {
        int index  = windBearing/45;
        int left = windBearing %45;
        if (left > 22.5f) {
            index ++;
        }
        if (index > 7) {
            index = 0;
        }

        return index;

    }


    public  static String directionDescriptionFromDirection(int direction) {

        String string  =null;
        switch (direction) {
            case 0:

                string  ="北";

                break;
            case 1:
                string = "东北";
                break;
            case 2:
                string  = "东";
                break;
            case 3:
                string = "东南";
                break;
            case 4:
                string  = "南";
                break;
            case 5:
                string = "西南";
                break;
            case 6:
                string = "西";
                break;
            case 7:
                string = "西北";
                break;

            default:
                break;
        }


        return string;


    }

    public  static  float meterpersecondfromnileperhour(float mileh ){

        float meters = FishUnitTransTool.kmtransfrommiles(mileh)*1000;

        return meters/3600.f;
    }


    public static float inchesperhour2mmperday(float inchesperhour){

        float inchesperday = inchesperhour * 24;

        float mmperday = inchesperday/0.39370f *10;

        return mmperday;
    }


}
