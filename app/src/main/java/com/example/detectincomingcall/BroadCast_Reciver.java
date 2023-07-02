package com.example.detectincomingcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class BroadCast_Reciver extends BroadcastReceiver {
    Context context;
    @Override
    public void onReceive(Context context, Intent intent) {
        this.context = context;

        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);

        if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
            Toast.makeText(context, "Call Incoming", Toast.LENGTH_SHORT).show();

            String incomingCallerNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER);

            if (incomingCallerNumber != null){

                Intent intent1 = new Intent(context,MainActivity.class);
                intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent1.putExtra("number",incomingCallerNumber);
                context.startActivity(intent1);

            }
        }
    }
}
