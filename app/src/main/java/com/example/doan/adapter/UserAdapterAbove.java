package com.example.doan.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doan.R;
import com.example.doan.users.User;
import com.example.doan.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class UserAdapterAbove extends RecyclerView.Adapter<UserAdapterAbove.userViewholder> {
   ArrayList<User> lstUser;
   Context context;
    @NonNull
    @Override
    public userViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull userViewholder holder, int position) {
        User item = lstUser.get(position);
        holder.ImageChart.setImageBitmap(Utils.convertToBitmapFromAssets(context,item.getAvatar()));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class userViewholder extends RecyclerView.ViewHolder{
        ImageView ImageChart;
        public userViewholder(@NonNull View itemView) {
            super(itemView);
            ImageChart = itemView.findViewById(R.id.imageabove);
        }
    }

}
