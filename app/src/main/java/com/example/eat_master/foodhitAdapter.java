package com.example.eat_master;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.List;

public class foodhitAdapter extends RecyclerView.Adapter<foodhitAdapter.MyViewHolder> {

    Context mcontext;
    List<footHit> mfoothit;
    View view;
    Dialog myDialog;
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

        vHolder.order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mcontext, "TestClick", Toast.LENGTH_SHORT).show();
            }
        });

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
        private LinearLayout item_click;
        private TextView rnamefoot,namerest,price,order;
        public ImageView url_ima;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_click = itemView.findViewById(R.id.Mitem_home);
            rnamefoot = itemView.findViewById(R.id.namefood);
            namerest = itemView.findViewById(R.id.nameres);
            price = itemView.findViewById(R.id.pricefood);
            url_ima = itemView.findViewById(R.id.imagefood);
            order = itemView.findViewById(R.id.orderFood);


        }
    }

}
