package test.bawei.com.duotiaomu;

import android.app.Application;

import org.xutils.x;

/**
 * name:周振辉
 * 时间：2017/8/13 12:04
 * 类描述：
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
