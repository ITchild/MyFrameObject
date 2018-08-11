package com.fei.myframeobject;

import com.cily.utils.app.BaseApplication;
import com.fei.myframeobject.base.BaseAc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/8/10 0010.
 */

public class FramApplication extends BaseApplication {
    private static FramApplication app;


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public static FramApplication getApp() {
        return app;
    }


    private List<BaseAc> acTask;

    public void addTask(BaseAc ac) {
        if (ac == null) {
            return;
        }
        if (acTask == null) {
            acTask = new ArrayList<>();
        }
        acTask.add(0, ac);
    }

    public void delTask(BaseAc ac) {
        if (ac == null) {
            return;
        }
        if (acTask == null) {
            return;
        }
        Iterator it = acTask.iterator();
        while (it.hasNext()) {
            if (it.next() == ac) {
                it.remove();
            }
        }
    }
}
