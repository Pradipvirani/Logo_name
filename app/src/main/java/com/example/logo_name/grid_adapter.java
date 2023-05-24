package com.example.logo_name;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class grid_adapter extends RecyclerView.Adapter<grid_adapter.user_holder> {

    Context context;
    ArrayList<String> imagearr;
    int pos;
    public grid_adapter(Context context, ArrayList<String> imagearr, int position) {
        this.context=context;
        this.pos=position;
        this.imagearr=imagearr;
    }

    @NonNull
    @Override
    public grid_adapter.user_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.sub_level,parent,false);
        user_holder holder=new user_holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull grid_adapter.user_holder holder, int position) {
        InputStream stream=null;
        try {
            if (pos==0)
            {
                stream=context.getAssets().open("unsold 1/"+imagearr.get(position));
            }
            if (pos==1)
            {
                stream=context.getAssets().open("unsold 2/"+imagearr.get(position));
            }
            if (pos==2)
            {
                stream=context.getAssets().open("unsold 3/"+imagearr.get(position));
            }
            if (pos==3)
            {
                stream=context.getAssets().open("unsold 4/"+imagearr.get(position));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Drawable drawable=Drawable.createFromStream(stream,null);
        holder.imageView.setImageDrawable(drawable);

    }

    @Override
    public int getItemCount() {
        return imagearr.size();
    }

    public class user_holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public user_holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.logo);
        }
    }
}
