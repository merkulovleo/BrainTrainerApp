package com.example.mycuculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FirstActivity extends AppCompatActivity {

    static public int Level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_main);
//        Button achivBtn = (Button) findViewById(R.id.achivments);
        Button settingsBtn = (Button) findViewById(R.id.settings);
        Button gameBtn = (Button) findViewById(R.id.play);
    }

//    public void clickAchiv(View view){
//        Toast.makeText(getApplicationContext(),"Достижения!",Toast.LENGTH_SHORT).show();
//        Intent i = new Intent(FirstActivity.this, TableOfResults.class);
//        startActivity(i);
//    }

    public void clickSettings(View view){
        Toast.makeText(getApplicationContext(),"Настройки!",Toast.LENGTH_SHORT).show();
        FragmentManager manager = getSupportFragmentManager();
        MyDialogLevel myDialogFragment = new MyDialogLevel();
        FragmentTransaction transaction = manager.beginTransaction();
        myDialogFragment.show(transaction, "dialog");

    }

    public void clickPlay(View view){
        Toast.makeText(getApplicationContext(),"Игра!",Toast.LENGTH_SHORT).show();
        System.out.println(Level);
        Intent i = new Intent(FirstActivity.this, MainActivity.class);
        i.putExtra("level", Level + "");
        startActivity(i);
    }
}
