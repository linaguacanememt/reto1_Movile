package com.example.tiendamiscelanea;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //imagen del mipmap cambiar
        getSupportActionBar().setIcon(R.mipmap.icon_pproductos);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(getApplicationContext(),"option 1 selected",Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this, productos.class);
                startActivity(intent1);
                //finish();
                return true;
            case R.id.option2:
                Toast.makeText(getApplicationContext(),"option 2 selected",Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(MainActivity.this, servicios.class);
                startActivity(intent2);
                //finish();
                return true;
            case R.id.option3:
                Toast.makeText(getApplicationContext(),"option 3 selected",Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(MainActivity.this, sucursales.class);
                startActivity(intent3);
                //finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}