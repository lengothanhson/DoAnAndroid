package com.example.doan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.doan.R;
import com.example.doan.users.MSPList;
import com.example.doan.utils.Utils;

import java.util.List;

public class AdapterMSPlist extends RecyclerView.Adapter<AdapterMSPlist.MSPlistViewHolder>{
    List<MSPList> mMSPlist;
    Context mContext;
    public AdapterMSPlist(Context mContext) {
        this.mContext = mContext;
    }



    public void setDataMSPL(List<MSPList> list){
        this.mMSPlist=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MSPlistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from (parent.getContext()).inflate(R.layout.layoutmusicplaylist,parent,false);
        return new  MSPlistViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MSPlistViewHolder holder, int position) {
    MSPList mspList = mMSPlist.get(position);
    if(mspList == null)
    { return ;}
    holder.imageMSPlist.setImageBitmap(Utils.convertToBitmapFromAssets(mContext,mspList.getAvatar()));
    holder.textMSPlist.setText(mspList.getText1());
    holder.textMSPlist2.setText(mspList.getText2());
    }



    @Override
    public int getItemCount() {
       if(mMSPlist!= null)
       {return mMSPlist.size();}
        return 0;
    }

    class MSPlistViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageMSPlist;
        private TextView textMSPlist;
        private TextView textMSPlist2;
        public MSPlistViewHolder(@NonNull View itemView) {
            super(itemView);
            imageMSPlist = itemView.findViewById(R.id.image_MSPlist);
            textMSPlist = itemView.findViewById(R.id.text_MSPlist);
            textMSPlist2=itemView.findViewById(R.id.text_MSPlist2);
        }
    }
}
