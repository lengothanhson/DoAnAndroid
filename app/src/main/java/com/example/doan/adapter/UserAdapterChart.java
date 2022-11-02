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
 // private final UserAdapterChart.onitemclick onitemclick ;
  ArrayList<User> lstUser;
  Context context;
 // UserGridCallbackChart userGridCallBack;
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context =parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.layoutchart,parent,false);
        UserViewHolder viewHolder = new UserViewHolder(userView);
        return viewHolder;
    }

    public UserAdapterChart(ArrayList<User> lstUser, onitemclick onitemclick ) {
     //   this.onitemclick = onitemclick;
        this.lstUser = lstUser;
 //      this.userGridCallBack = userGridCallBack;
    }
public interface onitemclick{
        void onItemClick(User user);
}
@NonNull
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
User item = lstUser.get(position);
holder.TextChart.setText(item.getContent());
    holder.TextChart2.setText(item.getContent());
holder.ImageChart.setImageBitmap(Utils.convertToBitmapFromAssets(context,item.getAvatar()));
//holder.itemView.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        onitemclick.onItemClick(item);
//    }
//});
    }

    @Override
    public int getItemCount() {
        return lstUser.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder{
        ImageView ImageChart;
        TextView TextChart;
        TextView TextChart2;
    //    RecyclerView linearLayout;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageChart = itemView.findViewById(R.id.imagechart);
    //        linearLayout=itemView.findViewById(R.id.lochart);
            TextChart =itemView.findViewById(R.id.textchart);
            TextChart2 =itemView.findViewById(R.id.textchart2);
        }
    }

//   public interface UserGridCallbackChart{
//      void onItemClick(String id);}

}
