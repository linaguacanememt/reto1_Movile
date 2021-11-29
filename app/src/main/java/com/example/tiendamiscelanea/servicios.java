package com.example.tiendamiscelanea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class servicios extends AppCompatActivity {

    ImageView img4;
    ImageView img5;
    ImageView img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);
        img4=(ImageView) findViewById(R.id.img_servprof);
        img4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar G",Toast.LENGTH_SHORT).show();
            }
        });
        img4.setClickable(true);

        img5=(ImageView) findViewById(R.id.img_servgestion);
        img5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar M",Toast.LENGTH_SHORT).show();
            }
        });
        img5.setClickable(true);

        img6=(ImageView) findViewById(R.id.img_servitec);
        img6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar P",Toast.LENGTH_SHORT).show();
            }
        });
        img6.setClickable(true);
    }
}