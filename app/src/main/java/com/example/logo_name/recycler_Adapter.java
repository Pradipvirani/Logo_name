package com.example.logo_name;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recycler_Adapter extends RecyclerView.Adapter<recycler_Adapter.user_holder> {
    Level_show level_show;
    String[] level;
    public recycler_Adapter(Level_show level_show, String[] level)
    {
        this.level=level;
        this.level_show=level_show;
    }

    @NonNull
    @Override
    public recycler_Adapter.user_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
       View view= LayoutInflater.from(level_show).inflate(R.layout.level_item,parent,false);
       user_holder userHolder = new user_holder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull recycler_Adapter.user_holder holder, int position)
    {
                holder.textView.setText(""+level[position]);
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(level_show, Logo_show.class);
                        intent.putExtra("position",holder.getAdapterPosition());
                        level_show.startActivity(intent);
                    }
                });
    }

    @Override
    public int getItemCount() {
        return level.length;
    }

    public class user_holder extends RecyclerView.ViewHolder {
        TextView textView;
        public user_holder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.level_txt);
        }
    }
}
