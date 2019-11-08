package com.example.androidtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);
        replaceFragment(new RightFragment());

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button:
                replaceFragment(new ThirdFragment());
                break;
            default:
                break;
        }
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.right_layout, fragment)
                .commit();
    }
}
