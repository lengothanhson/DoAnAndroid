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

public class UserAdapterChart extends RecyclerView.Adapter<UserAdapterChart.UserViewHolder> {
    private final onitemclick onitemclick;
  ArrayList<User> lstUser;
  Context context;
  public interface UserCallback{

  }
    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context =parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.layoutchart,parent,false);
        UserViewHolder viewHolder = new UserViewHolder(userView);
        return viewHolder;
    }
    public interface onitemclick{
        void onItemClick(User user);
    }


    public UserAdapterChart(ArrayList<User> lstUser, onitemclick onitemclick ) {
        this.lstUser = lstUser;
        this.onitemclick = onitemclick;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
    User item = lstUser.get(position);
    holder.ImageChart.setImageBitmap(Utils.convertToBitmapFromAssets(context,item.getAvatar()));
    holder.text1.setText(item.getName());
    holder.text2.setText(item.getAuthor());
    }

    @Override
    public int getItemCount() {
        return lstUser.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
        ImageView ImageChart;
        TextView text1;
        TextView text2;
    RecyclerView rclchart;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageChart = itemView.findViewById(R.id.imagechart);
            text1 = itemView.findViewById(R.id.textchart);
            text2 = itemView.findViewById(R.id.textchart2);
            rclchart = itemView.findViewById(R.id.rvListChart);
        }
    }
}
