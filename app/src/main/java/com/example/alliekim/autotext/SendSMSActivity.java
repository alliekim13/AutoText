package com.example.alliekim.autotext;

/**
 * Created by alliekim on 9/15/15.
 */

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class SendSMSActivity extends Activity {

    Button buttonSend;
    EditText textPhoneNo;
    EditText textSMS;

    //Intent i = new Intent(this, LocationComparator.class);
    //startActivityForResult(i, 1);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // locate elements from xml file
        buttonSend = (Button) findViewById(R.id.buttonSend);
        textPhoneNo = (EditText) findViewById(R.id.editTextPhoneNo);
        textSMS = (EditText) findViewById(R.id.editTextSMS);

        buttonSend.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // get data from elements
                String phoneNo = textPhoneNo.getText().toString();
                String sms = textSMS.getText().toString();
                try {
                    // initialize an SmsManager class called smsManager
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null, sms, null, null);
                    Toast.makeText(getApplicationContext(), "SMS Sent!",
                            Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "SMS failed, please try again later!",
                            Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }
}


