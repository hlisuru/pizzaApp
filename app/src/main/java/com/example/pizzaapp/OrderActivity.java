package com.example.pizzaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }
    public void submit(View view) {
        Intent intent = new Intent(OrderActivity.this, Pizza_List_Activity.class);
        startActivity(intent);

        Toast.makeText(this, " Order Completed", Toast.LENGTH_LONG).show();
    }

}
