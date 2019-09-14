package com.example.eat_master;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class foodhitAdapter extends RecyclerView.Adapter<foodhitAdapter.MyViewHolder> {

    Context mcontext;
    List<footHit> mfoothit;
    View view;
    private ImageView img;

    public foodhitAdapter(Context mcontext, List<footHit> mfoothit) {
        this.mcontext = mcontext;
        this.mfoothit = mfoothit;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(mcontext).inflate(R.layout.item_home,parent,false);
        MyViewHolder vHolder = new MyViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.rnamefoot.setText(mfoothit.get(position).getFoodname());
        holder.namerest.setText(mfoothit.get(position).getFoodres());
        holder.price.setText(mfoothit.get(position).getPrice());
       // holder.url_ima.setImageURI();

       // holder.url_ima.setText(mfoothit.get(position).getIma());
       // Picasso.get().load("http://i.imgur.com/DvpvklR.png").into();
        Glide.with(view.getContext()).load(mfoothit.get(position).getIma()).into(holder.url_ima);



    }

    @Override
    public int getItemCount() {
        return mfoothit.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView rnamefoot,namerest,price;
        public ImageView url_ima;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            rnamefoot = itemView.findViewById(R.id.namefood);
            namerest = itemView.findViewById(R.id.nameres);
            price = itemView.findViewById(R.id.pricefood);
            url_ima = itemView.findViewById(R.id.imagefood);


        }
    }

}
