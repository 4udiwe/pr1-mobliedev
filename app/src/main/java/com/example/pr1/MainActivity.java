package com.example.pr1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("rrr", "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("rrr", "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("rrr", "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("rrr", "onResume: " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("rrr", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("rrr", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("rrr", "onPause: ");
    }
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}