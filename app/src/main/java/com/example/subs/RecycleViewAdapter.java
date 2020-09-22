package com.example.subs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder> {
    private static final String TAG = "RecycleViewAdapter";
    private ArrayList<GetterSetterData> listData;
    private Context mcontext;
    public RecycleViewAdapter (Context context,ArrayList<GetterSetterData> list ) {this.listData = list;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);

        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, final int position) {
        final GetterSetterData getterSetterData = listData.get(position);
        Glide.with(holder.itemView.getContext())
                .load(getterSetterData.getImages())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.snNames.setText(getterSetterData.getNames());
        holder.snKeterangan.setText(getterSetterData.getKeterangan());



        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mcontext=view.getContext();
                Intent intent = new Intent (mcontext,GalleryActivity.class);
                intent.putExtra("image",getterSetterData.getImages());
                intent.putExtra("image_name",getterSetterData.getNames());
                intent.putExtra("image_keterangan",getterSetterData.getKeterangan());
                mcontext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView snNames,snKeterangan;
        RelativeLayout parentLayout;
        public RecycleViewHolder(View view) {
            super(view);
            imgPhoto = view.findViewById(R.id.image_list);
            snNames= view.findViewById(R.id.judul_list);
            snKeterangan = view.findViewById(R.id.keterangan_list);
            parentLayout = view.findViewById(R.id.parent_layout);
        }
    }



}
