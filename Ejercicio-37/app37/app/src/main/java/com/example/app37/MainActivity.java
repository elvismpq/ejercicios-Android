package com.example.app37;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout1=(ConstraintLayout) findViewById(R.id.layout1);
        Lienzo fondo = new Lienzo(this);
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
    class Lienzo extends View{
        public Lienzo(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            canvas.drawRGB(0,0,255);
            int alto=canvas.getHeight();

            Path camino=new Path();
            camino.moveTo(0,alto/2);
            camino.lineTo(40,alto/2-30);
            camino.lineTo(80,alto/2-60);
            camino.lineTo(120,alto/2-90);
            camino.lineTo(160,alto/2-120);
            camino.lineTo(220,alto/2-150);
            camino.lineTo(280,alto/2-180);
            camino.lineTo(340,alto/2-210);
            Paint pincell = new Paint();
            pincell.setARGB(255,255,0,0);
            pincell.setTextSize(30);
            canvas.drawTextOnPath("Hola Mundo Hola Mundo",camino,0,0,pincell);
        }
    }
}