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
import com.example.doan.utils.Utils;

import java.util.List;

public class AdapterPodCast extends RecyclerView.Adapter<AdapterPodCast.PCastViewHolder> {
  List<PodCast> mPodcast;
  Context context;

    public AdapterPodCast(Context context) {
        this.context = context;
    }
    public void setDataPCast(List<PodCast> list){
        this.mPodcast=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public PCastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutpodcast,parent,false);
        return new PCastViewHolder(view);
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
