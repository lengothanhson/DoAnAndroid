package com.example.doan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doan.R;
import com.example.doan.users.User;
import com.example.doan.utils.Utils;

import java.util.ArrayList;

public class UserAdapterSearch extends RecyclerView.Adapter<UserAdapterSearch.UserViewHolder>  {
    Context context;
    ArrayList<User> lstUser;
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.layoutitemsearch, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(userView);
        return viewHolder;
    }
    public UserAdapterSearch(ArrayList<User> lstUser) {
        this.lstUser = lstUser;
    }
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User item = lstUser.get(position);
        holder.imAvatar.setImageBitmap(Utils.convertToBitmapFromAssets(context,item.getAvatar()));
        holder.tvTypeC.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return lstUser.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
     ImageView imAvatar;
     TextView tvTypeC;
     public UserViewHolder(@NonNull View itemView) {
         super(itemView);
         imAvatar  = itemView.findViewById(R.id.ivsearch);
         tvTypeC = itemView.findViewById(R.id.tvType);
        }
    }
}