package com.example.app33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
RelativeLayout layout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout1=(RelativeLayout) findViewById(R.id.layout1);
        Lienzo fondo=new Lienzo(this);
        layout1.addView(fondo);
    }
/*@Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    /* @Override
     public boolean onOptionsItemSelected(MenuItem item){
         int id=item.getItemId();
         if(id==R.id.action_settings){
             return true;
         }
         return super.onOptionsItemSelected(item);
     }*/
    class Lienzo extends View {
        public Lienzo(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            canvas.drawRGB(255,255,255);
            int ancho=canvas.getWidth();
            int alto=canvas.getHeight();
            Paint pincell=new Paint();
            pincell.setARGB(255,255,0,0);
            pincell.setStyle(Paint.Style.STROKE);
            for (int f=0;f<10;f++){
                canvas.drawCircle(ancho/2,alto/2,f*15,pincell);
            }
        }
    }
}