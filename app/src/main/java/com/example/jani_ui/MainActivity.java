package com.example.jani_ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    EditText etPassword;
    String stID;
    String stPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //activity_main이 연결되어있다는 뜻

        etID = (EditText)findViewById(R.id.etID);
        etPassword = (EditText)findViewById(R.id.etPassword);
        //이쯤에 DB 코드

        Button btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stID = etID.getText().toString();
                stPassword = etPassword.getText().toString();

                Toast.makeText(MainActivity.this,"Register",Toast.LENGTH_SHORT).show();
                registerUser(stID,stPassword);

                Intent in = new Intent(MainActivity.this, ChatActivity.class);
                startActivity(in);

            }
        });

    }
    /*
    @Override
    public void onStart(){
        super.onStart();

    }
    @Override
    public void onStop(){
        super.onStop();
    }
*/
    private void registerUser(String id, String password){

        Intent in = new Intent(MainActivity.this, ChatActivity.class);
        startActivity(in);

    }


    //on start
    //on stop
    //registerUser .. DB
    //pirvate void userLogin()

}
