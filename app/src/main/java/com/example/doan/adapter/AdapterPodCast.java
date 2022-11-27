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
import com.example.doan.users.MSPList;
import com.example.doan.users.PodCast;
import com.example.doan.users.User;
import com.example.doan.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class AdapterPodCast extends RecyclerView.Adapter<AdapterPodCast.PCastViewHolder> {
    private final onitemclick onitemclick;
  ArrayList<PodCast> mPodcast;
  Context context;
    public interface onitemclick{
        void onItemClick(User user);
    }
    public AdapterPodCast(ArrayList<PodCast> mPodcast, onitemclick onitemclick) {
      this.mPodcast=mPodcast;
        this.onitemclick = onitemclick;
    }
    @NonNull
    @Override
    public PCastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context =parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View userView = inflater.inflate(R.layout.layoutpodcast,parent,false);
        PCastViewHolder viewHolder = new PCastViewHolder(userView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PCastViewHolder holder, int position) {
    PodCast podCast = mPodcast.get(position);
    if(podCast ==null)
    {
        return;
    }
    holder.imagepodcast.setImageBitmap(Utils.convertToBitmapFromAssets(context,podCast.getAvatar()));
    holder.tvpodcast1.setText(podCast.getTitle());
    holder.tvpodcast2.setText(podCast.getContent());
    }

    @Override
    public int getItemCount() {
        return mPodcast.size();
    }

    class PCastViewHolder extends RecyclerView.ViewHolder{
        ImageView imagepodcast;
        TextView tvpodcast1;
        TextView tvpodcast2;
        public PCastViewHolder(@NonNull View itemView) {
            super(itemView);
            imagepodcast = itemView.findViewById(R.id.image_podcast);
            tvpodcast1 = itemView.findViewById(R.id.tv_podcast1);
            tvpodcast2 = itemView.findViewById(R.id.tv_podcast2);
        }
    }
}
