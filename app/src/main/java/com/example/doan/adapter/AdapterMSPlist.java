package com.example.doan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.doan.R;
import com.example.doan.users.MSPList;
import com.example.doan.users.User;
import com.example.doan.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class AdapterMSPlist extends RecyclerView.Adapter<AdapterMSPlist.MSPlistViewHolder>{
    private final onitemclick onitemclick;
    ArrayList<MSPList> mMSPlist;
    Context mContext;
    public interface onitemclick{
        void onItemClick(User user);
    }
    public AdapterMSPlist( ArrayList<MSPList> mMSPlist, onitemclick onitemclick ) {
        this.mMSPlist = mMSPlist;
        this.onitemclick = onitemclick;
    }
    @NonNull
    @Override
    public MSPlistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext =parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View userView = inflater.inflate(R.layout.layoutmusicplaylist,parent,false);
        MSPlistViewHolder viewHolder = new MSPlistViewHolder(userView);
        return viewHolder;
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
    public int getItemCount() {return mMSPlist.size();}
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
