package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter (List<ModelClass>userList){this .userList=userList;}


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource= userList.get(position).getImageview1();
        String name=userList.get(position).getTextview();
        String time=userList.get(position).getTextview2();
        String msg=userList.get(position).getTextview3();

        holder.setData(resource,name,msg,time);


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageview;
        private TextView textView,textview2,textview3;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview=itemView.findViewById(R.id.imageview1);
            textView=itemView.findViewById(R.id.textview);
            textview2=itemView.findViewById(R.id.textview2);
            textview3 = itemView.findViewById(R.id.textview3);
        }

        public void setData(int resource, String name, String msg, String time) {

            imageview.setImageResource(resource);
            textView.setText(name);
            textview2.setText(msg);
            textview3.setText(time);

        }
    }
}
