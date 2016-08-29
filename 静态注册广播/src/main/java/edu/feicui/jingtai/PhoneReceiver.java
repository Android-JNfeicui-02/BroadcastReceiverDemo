package edu.feicui.jingtai;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by admin on 2016/7/26.
 */
public class PhoneReceiver extends BroadcastReceiver {

    private static final String TAG = "PhoneReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            String state = bundle.getString(TelephonyManager.EXTRA_STATE);
            Log.d(TAG, "当前手机的state: " + state);

            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String number = bundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.d(TAG, "number: " + number);
            }
        }
    }
}
