package com.example.app9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        num=(int)(Math.random()*100001);
        String cadena=String.valueOf(num);
        Toast notificacion=Toast.makeText(this,cadena,Toast.LENGTH_SHORT);
        notificacion.show();
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
    int id=item.getItemId();
    if(id==R.id.action_settings){
    return true;
    }
    return super.onOptionsItemSelected(item);
    }

    */
public void controlar(View v){
    String valorIngresado=et1.getText().toString();
    int valor=Integer.parseInt(valorIngresado);
    if(valor==num){
        Toast notificacion=Toast.makeText(this,"Muy bien recordaste el número mostrado",Toast.LENGTH_SHORT);
        notificacion.show();
    }else {
        Toast notificacion=Toast.makeText(this,"Lo siento pero no es el número que se mostró",Toast.LENGTH_SHORT);
        notificacion.show();
    }
}
}