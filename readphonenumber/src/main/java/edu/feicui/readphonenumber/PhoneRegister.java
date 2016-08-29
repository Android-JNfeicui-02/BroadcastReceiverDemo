package edu.feicui.readphonenumber;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by admin on 2016/7/26.
 */
public class PhoneRegister extends BroadcastReceiver {

    private static final String TAG = "PhoneRegister";
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();

        if (extras != null) {
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Log.d(TAG, "state: " + state);

            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String number = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.d(TAG, "number: " + number);
            }
        }
    }
}
