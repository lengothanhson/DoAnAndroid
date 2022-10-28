package com.example.doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapterSearch extends RecyclerView.Adapter<UserAdapterSearch.UserGridViewHolder> {
    ArrayList<User> lstUser;
    Context context;
//    UserAdapter.UserGridCallBack userGridCallBack;

    public UserAdapterSearch(ArrayList<User> lstUser) {
        this.lstUser = lstUser;
    }

    @NonNull
    @Override
    public UserGridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.layoutitemsearch, parent, false);
        UserGridViewHolder viewHolder = new UserGridViewHolder(userView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserGridViewHolder holder, int position) {
        User item = lstUser.get(position);
        holder.imAvatar.setImageBitmap(Utils.convertToBitmapFromAssets(context,item.getAvatar()));
        holder.tvTypeC.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return lstUser.size();
    }

    class UserGridViewHolder extends RecyclerView.ViewHolder {
        ImageView imAvatar;
        TextView tvTypeC;
        public UserGridViewHolder(@NonNull View itemView) {
            super(itemView);
            imAvatar  = itemView.findViewById(R.id.ivsearch);
            tvTypeC = itemView.findViewById(R.id.tvType);
        }
    }
}