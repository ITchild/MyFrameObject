package com.fei.myframeobject.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cily.utils.base.StrUtils;
import com.fei.myframeobject.R;

/**
 * Created by fei on 2018/7/4 0004.
 * 自定义的Toast
 */

public class MyToastUtils {

    private Toast mToast;
    private MyToastUtils(Context context, CharSequence text, int duration) {
        if(context == null || StrUtils.isEmpty(text.toString())){
            return;
        }
        View v = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);
        TextView textView = (TextView) v.findViewById(R.id.textView1);
        textView.setText(text);
        mToast = new Toast(context);
        mToast.setDuration(duration);
        mToast.setView(v);
    }

    public static MyToastUtils makeText(Context context, CharSequence text, int duration) {
        return new MyToastUtils(context, text, duration);
    }
    public void show() {
        if (mToast != null) {
            mToast.show();
        }
    }
    public void setGravity(int gravity, int xOffset, int yOffset) {
        if (mToast != null) {
            mToast.setGravity(gravity, xOffset, yOffset);
        }
    }

}
