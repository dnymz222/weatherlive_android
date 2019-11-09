package com.xueping.weatherlive.helper;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.squareup.picasso.Picasso;
import com.xueping.weatherlive.R;

public class NetworkImageHolderView extends Holder<String> {

    private ImageView imageView;
    private Context mcontext;


    public NetworkImageHolderView(View itemView, Context contex, View.OnClickListener listerner) {
        super(itemView);

        mcontext = contex;

        imageView.setOnClickListener(listerner);



    }


    @Override
    protected void initView(View itemView) {

        imageView =itemView.findViewById(R.id.ivPost);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override
    public void updateUI(String data) {

        Picasso.with(mcontext).load(data).into(imageView);
        imageView.setTag(data);


    }

}
