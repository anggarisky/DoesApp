package com.example.anggarisky.doesapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder>{

    Context context;
    ArrayList<MyDoes> myDoes;

    public DoesAdapter(Context c, ArrayList<MyDoes> p) {
        context = c;
        myDoes = p;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_does,viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.titledoes.setText(myDoes.get(i).getTitledoes());
        myViewHolder.descdoes.setText(myDoes.get(i).getDescdoes());
        myViewHolder.datedoes.setText(myDoes.get(i).getDatedoes());
    }

    @Override
    public int getItemCount() {
        return myDoes.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titledoes, descdoes, datedoes;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descdoes = (TextView) itemView.findViewById(R.id.descdoes);
            datedoes = (TextView) itemView.findViewById(R.id.datedoes);
        }
    }

}
