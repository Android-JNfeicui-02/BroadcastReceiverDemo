package edu.feicui.broadcastreceiverdemo;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
// 动态注册广播
public class MainActivity extends AppCompatActivity {

    private MyReceiver mReceiver;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 监控网络状态的变化
        mReceiver = new MyReceiver();
        // IntentFilter对象
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");

        registerReceiver(mReceiver,filter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: 反注册广播");
        unregisterReceiver(mReceiver);
    }
}
