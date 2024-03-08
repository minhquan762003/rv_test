package com.example.rv_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    List<Model> data = new ArrayList<>();

    public Adapter(){
        init_data();
    }
    public void init_data(){
        for(int i =0; i< 10; i++){
            Model j = new Model("text"+i, "text "+(i+i));
            data.add(j);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater l = LayoutInflater.from(parent.getContext());
        return new ViewHolder(l.inflate(R.layout.items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model model = data.get(position);
        holder.text1.setText(model.getText1());
        holder.text2.setText(model.getText2());
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView text1;
        TextView text2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.textView);
            text2 = itemView.findViewById(R.id.textView2);
        }
    }
}
