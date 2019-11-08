package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private  static final String TAG = "zhztest";

    MyService.MyBinder downLoadBinder;

    ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d(TAG, "onServiceConnected: ");
            downLoadBinder = (MyService.MyBinder)service;
            downLoadBinder.startFunction();
            int id = downLoadBinder.getAppId();
            Log.d(TAG, "onServiceConnected: id = " + id);
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d(TAG, "onServiceDisconnected: ");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActivityTest(View view) {
        Intent intent = new Intent(this, FragmentActivity.class);
        startActivity(intent);
    }

    public void startServiceTest(View view) {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }

    public void stopServiceTest(View view) {
        Intent intent = new Intent(this, MyService.class);
        stopService(intent);
    }

    public void bindServiceTest(View view) {
        Intent intent = new Intent(this, MyService.class);
        bindService(intent, connection, BIND_AUTO_CREATE);
    }

    public void unbindServiceTest(View view) {
        unbindService(connection);
    }

    public void intentServiceTest(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        Log.d(TAG, "intentServiceTest: MainActivity thread id is " + Thread.currentThread().getId());
        startService(intent);
    }
}
