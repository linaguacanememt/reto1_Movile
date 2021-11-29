package com.example.tiendamiscelanea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class sucursales extends AppCompatActivity {

    ImageView img7;
    ImageView img8;
    ImageView img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);
        img7=(ImageView) findViewById(R.id.img_bbogota);
        img7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar G",Toast.LENGTH_SHORT).show();
            }
        });
        img7.setClickable(true);

        img8=(ImageView) findViewById(R.id.img_cali);
        img8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar M",Toast.LENGTH_SHORT).show();
            }
        });
        img8.setClickable(true);

        img9=(ImageView) findViewById(R.id.img_medellin);
        img9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar P",Toast.LENGTH_SHORT).show();
            }
        });
        img9.setClickable(true);
    }
}