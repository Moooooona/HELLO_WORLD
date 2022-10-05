package com.example.hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          }
          public Void onBtnClick(View view){
        TextView txtHello=findViewById(R.id.textView2);
        txtHello.setText("Welcome Dear! ");
              return null;
          }

}