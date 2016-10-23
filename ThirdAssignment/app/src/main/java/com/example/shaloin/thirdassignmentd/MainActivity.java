package com.example.shaloin.thirdassignmentd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.etnameID);
        button=(Button)findViewById(R.id.btnloginID);
    }

    public void clickme(View v){
        editText=(EditText)findViewById(R.id.etnameID);
        Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
        String string=editText.getText().toString();
        intent.putExtra("name",string);
        startActivity(intent);
    }
}
