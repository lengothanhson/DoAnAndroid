package com.example.doan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doan.R;
import com.example.doan.users.User;
import com.example.doan.utils.Utilschart;

import java.util.ArrayList;

public class UserAdapterLibrary extends RecyclerView.Adapter<UserAdapterLibrary.UserViewHolder> {
//    private final UserAdapter.onitemclick onitemclick;
    ArrayList<User> lstUser;
    Context context;
    UserAdapterLibrary.UserGridCallBack userGridCallBack;

    public UserAdapterLibrary(ArrayList<User> lstUser) {
        this.lstUser = lstUser;
        this.userGridCallBack = userGridCallBack;
    }

    @NonNull
    @Override
    public UserAdapterLibrary.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.layoutitemlibrary, parent, false);
        UserAdapterLibrary.UserViewHolder viewHolder = new UserViewHolder(userView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapterLibrary.UserViewHolder holder, int position) {
        User item = lstUser.get(position);
        holder.ivLibraryC.setImageBitmap(Utilschart.convertToBitmapFromAssets(context,item.getAvatar()));
        holder.tvNamePlaylistC.setText(item.getName());
        holder.tvTypeC.setText(item.getAuthor());
    }

    @Override
    public int getItemCount() {
        return lstUser.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView ivLibraryC;
        TextView tvNamePlaylistC;
        TextView tvTypeC;
        LinearLayout linearLayout;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLibraryC  = itemView.findViewById(R.id.ivLibrary);
            tvNamePlaylistC = itemView.findViewById(R.id.tvNamePlaylist);
            tvTypeC = itemView.findViewById(R.id.tvType);
            linearLayout = itemView.findViewById(R.id.btItemLibrary);
        }
    }

    public interface UserGridCallBack {
        void onItemClick(String id);
    }
}
