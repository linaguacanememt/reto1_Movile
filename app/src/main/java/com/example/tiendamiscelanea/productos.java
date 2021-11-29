package com.example.tiendamiscelanea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class productos extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        img1=(ImageView) findViewById(R.id.img_varios1);
        img1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar G",Toast.LENGTH_SHORT).show();
            }
        });
        img1.setClickable(true);

        img2=(ImageView) findViewById(R.id.img_materiales);
        img2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar M",Toast.LENGTH_SHORT).show();
            }
        });
        img2.setClickable(true);

        img3=(ImageView) findViewById(R.id.img_papeleria);
        img3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Futura Version prox. a implementar P",Toast.LENGTH_SHORT).show();
            }
        });
        img3.setClickable(true);
    }
}