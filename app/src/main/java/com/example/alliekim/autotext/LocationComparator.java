package com.example.alliekim.autotext;
import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
/**
 * Created by alliekim on 11/3/15.
 */
public class LocationComparator extends Activity implements OnClickListener {
    Button locationReached;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        locationReached = (Button) findViewById(R.id.buttonLocationReached);
        locationReached.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, SendSMSActivity.class);

        // calling an activity using <intent-filter> action name
        //Intent intent = new Intent("com.example.alliekim.autotext.SEND_SMS");

        startActivity(intent);
    }
}
