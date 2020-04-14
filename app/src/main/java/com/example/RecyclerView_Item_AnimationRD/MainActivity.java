package com.example.RecyclerView_Item_AnimationRD;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import static com.example.RecyclerView_Item_AnimationRD.R.id.root_layout;

public class MainActivity extends AppCompatActivity {
    RecyclerView NewsRecyclerview;
    NewsAdapter newsAdapter;
    List<NewsItem> mData;
    FloatingActionButton fabSwitcher;
    boolean isDark =false;
    ConstraintLayout rootLayout;
    CharSequence search="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        // vamos a hacer esta actividad en pantalla completa
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView( R.layout.activity_main );

        // Ocultar el ActionBar

         //getSupportActionBar().hide();

         //Iniciar el Wiew

        fabSwitcher = findViewById( R.id.fab_switcher );
        rootLayout = findViewById( root_layout );
        NewsRecyclerview = findViewById( R.id.news_rv );
        mData = new ArrayList<>();
        //fill list news with data

        mData.add( new NewsItem( "Lo que el viento se llevo ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "El origen del universo ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "El amor cura todas las heridas ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Aprender a aprender ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Ciencia de lo absurdo ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Matematica avanzada","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "El porvenir del mundo revelado","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Cuando un amigo se va","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "No temas yo estoy contigo","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Todos los caminos conducen a Roma","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Lo que el viento se llevo ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "El origen del universo ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "El amor cura todas las heridas ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Aprender a aprender ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Ciencia de lo absurdo ","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Matematica avanzada","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "El porvenir del mundo revelado","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Cuando un amigo se va","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "No temas yo estoy contigo","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );
        mData.add( new NewsItem( "Todos los caminos conducen a Roma","Lorem ipsum dolor sit ametLorem ipsum dolor sit amet Lorem ipsum dolor sit ametLorem ipsum dolor sit amet","6 Julio 1944",R.drawable.boton ) );



        //adapter ini and setup
        newsAdapter= new NewsAdapter( this,mData, isDark );
        NewsRecyclerview.setAdapter( newsAdapter );
        NewsRecyclerview.setLayoutManager( new LinearLayoutManager( this ) );

        fabSwitcher.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               isDark = !isDark;
                if(isDark){
                  rootLayout.setBackgroundColor(getResources().getColor(R.color.black ) );

                   // Toast.makeText( getApplicationContext(),"Oscuro",Toast.LENGTH_LONG ).show();
                }
                else
                {
                   rootLayout.setBackgroundColor(getResources().getColor( R.color.white ) );
                  //  Toast.makeText( getApplicationContext(),"Blanco",Toast.LENGTH_LONG ).show();
                }


                newsAdapter = new NewsAdapter( getApplicationContext(),mData,isDark );
                NewsRecyclerview.setAdapter( newsAdapter );
            }
        } );

        //just for testing purpose i wil fill the news list with random data
        // you may get your data from an api firebase or sqlite database

    }
}
