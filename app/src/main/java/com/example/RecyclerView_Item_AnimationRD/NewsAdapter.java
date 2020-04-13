package com.example.RecyclerView_Item_AnimationRD;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    Context mContex;
    List<NewsItem> mData;

    public NewsAdapter(Context mContex, List<NewsItem> mData) {
        this.mContex = mContex;
        this.mData = mData;
    }


    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

       View layout;
       layout = LayoutInflater.from(mContex).inflate(R.layout.item_news_tres,viewGroup, false);
       return new NewsViewHolder( layout );
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder newsViewHolder, int position) {
          // bind data here

        //we apply animation to views here
        //first lets create an animation for user photo
        newsViewHolder.img_user.setAnimation( AnimationUtils.loadAnimation( mContex,R.anim.fade_transition ) );
        newsViewHolder.action_container.setAnimation( AnimationUtils.loadAnimation( mContex,R.anim.fade_scale ) );

        //lets create the animationfor the whole card

        newsViewHolder.tv_title.setText( mData.get(position).getTitle());
        newsViewHolder.tv_content.setText( mData.get( position ).getContent() );
        newsViewHolder.tv_date.setText( mData.get( position ).getDate() );
        newsViewHolder.img_user.setImageResource( mData.get( position ).getUsePhoto() );
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class NewsViewHolder  extends  RecyclerView.ViewHolder{
         TextView tv_title,tv_content,tv_date;
         ImageView img_user;
         RelativeLayout action_container;


        public  NewsViewHolder(@NonNull View itemView){
            super(itemView);
            action_container = itemView.findViewById( R.id.container );
          tv_title = itemView.findViewById( R.id.tv_title );
          tv_content = itemView.findViewById( R.id.tv_descripcion );
          tv_date = itemView.findViewById( R.id.tv_date );
          img_user = itemView.findViewById( R.id.img_user );

        }
    }
}
