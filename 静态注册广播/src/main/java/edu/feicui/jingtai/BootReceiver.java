package edu.feicui.jingtai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by admin on 2016/7/26.
 */
public class BootReceiver extends BroadcastReceiver {

//    监控需要的Action

    public static final String ACTION_BOOT = "android.intent.action.BOOT_COMPLETED";
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(ACTION_BOOT)) {
            Toast.makeText(context, "成功开机", Toast.LENGTH_SHORT).show();
        }
    }
}
