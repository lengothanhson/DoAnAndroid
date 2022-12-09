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
import com.example.doan.utils.Utilschart;

import java.util.ArrayList;

public class UserAdapterSearch extends RecyclerView.Adapter<UserAdapterSearch.UserViewHolder>  {
    private final UserAdapterSearch.onitemclick onitemclick;
    ArrayList<User> lstUser;
    Context context;
    UserAdapter.UserGridCallBack userGridCallBack;

    public interface onitemclick{
        void onItemClick(User user);
    }

    public UserAdapterSearch(ArrayList<User> lstUser, UserAdapterSearch.onitemclick onitemclick ) {
        this.onitemclick = onitemclick;
        this.lstUser = lstUser;
        this.userGridCallBack = userGridCallBack;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.layoutitemsearch, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(userView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User item = lstUser.get(position);
        holder.imAvatar.setImageBitmap(Utilschart.convertToBitmapFromAssets(context,item.getAvatar()));
        holder.tvTypeC.setText(item.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onitemclick.onItemClick(item);
            }
        });
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

    public interface UserGridCallBack {
        void onItemClick(String id);
    }
}