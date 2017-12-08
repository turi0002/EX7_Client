package com.example.user.ex7_client;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view) {
        Toast toast = Toast.makeText(this, "hello", Toast.LENGTH_SHORT);
        toast.show();
        switch (view.getId()) {
            case R.id.bCall:
                String number = ((EditText)findViewById(R.id.edCall)).getText().toString();
                callPhone(number);
                break;
            case R.id.bsurf:
                break;
            case R.id.bEmail:
                break;
            case R.id.bRegister:
                break;
        }
    }
        private void callPhone(String phoneNumber){

            Uri call = Uri.parse("tel:" + phoneNumber);
            Intent surf = new Intent(Intent.ACTION_DIAL, call);
            startActivity(surf);
    }
    }


