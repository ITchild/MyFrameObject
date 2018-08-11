package com.fei.myframeobject.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.widget.Toast;

import com.cily.utils.app.rx.ac.BaseOkHttpRxBusActivity;
import com.cily.utils.app.utils.ToastUtils;
import com.fei.myframeobject.FramApplication;
import com.fei.myframeobject.utils.MyToastUtils;

/**
 * Created by fei on 2018/8/9 0009.
 */

public class BaseAc extends BaseOkHttpRxBusActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FramApplication.getApp().addTask(this);
    }

    /**
     * Toast
     * @param str
     */
    public void showToast(String str) {
        super.showToastNoDelay(str);
    }

    public void showToastMyLocation(String str, int location) {
        ToastUtils.hideToast();
        ToastUtils.showToast(this, str, location, true);
    }

    public void showToastMySelf(String str) {

        MyToastUtils myToastUtils = MyToastUtils.makeText(this, str, Toast.LENGTH_SHORT);
        myToastUtils.setGravity(Gravity.CENTER, 0, 0);
        myToastUtils.show();
    }

    @Override
    protected void onDestroy() {
        FramApplication.getApp().delTask(this);
        super.onDestroy();
    }




}
