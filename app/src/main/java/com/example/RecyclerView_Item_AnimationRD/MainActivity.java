package com.example.RecyclerView_Item_AnimationRD;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView NewsRecyclerview;
    NewsAdapter newsAdapter;
    List<NewsItem> mData;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

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
        newsAdapter= new NewsAdapter( this,mData );
        NewsRecyclerview.setAdapter( newsAdapter );
        NewsRecyclerview.setLayoutManager( new LinearLayoutManager( this ) );


        //just for testing purpose i wil fill the news list with random data
        // you may get your data from an api firebase or sqlite database

    }
}
