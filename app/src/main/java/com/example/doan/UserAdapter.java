package com.example.doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>{
        private final UserAdapter.onitemclick onitemclick;
        ArrayList<User> lstUser;
        Context context;
     UserGridCallBack userGridCallBack;

        public interface onitemclick{
            void onItemClick(User user);
        }

        public UserAdapter(ArrayList<User> lstUser,onitemclick onitemclick ) {
            this.onitemclick = onitemclick;
            this.lstUser = lstUser;
            this.userGridCallBack = userGridCallBack;
        }

        @NonNull
        @Override
        public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
            View userView = inflater.inflate(R.layout.layoutitem, parent, false);
            UserViewHolder viewHolder = new UserViewHolder(userView);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
            User item = lstUser.get(position);
            holder.imAvatar.setImageBitmap(Utils.convertToBitmapFromAssets(context,item.getAvatar()));
            holder.tvNameC.setText(item.getName());
            holder.tvAuthorC.setText(item.getAuthor());
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
        static class UserViewHolder extends RecyclerView.ViewHolder {
            ImageView imAvatar;
            TextView tvNameC;
            TextView tvAuthorC;
            LinearLayout linearLayout;
            public UserViewHolder(@NonNull View itemView) {
                 super(itemView);
                imAvatar  = itemView.findViewById(R.id.ivAvatar);
                tvNameC = itemView.findViewById(R.id.tvName);
                tvAuthorC = itemView.findViewById(R.id.tvAuthor);
                linearLayout = itemView.findViewById(R.id.btItem);
            }
        }
     public interface UserGridCallBack {
          void onItemClick(String id);
        }
}
