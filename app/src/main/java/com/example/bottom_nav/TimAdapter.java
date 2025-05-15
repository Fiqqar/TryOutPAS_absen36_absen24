package com.example.bottom_nav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.bottom_nav.api_service.TimModel;

import java.util.ArrayList;

public class TimAdapter extends RecyclerView.Adapter<TimAdapter.ViewHolder> {

    private final ArrayList<TimModel> listClub;
    private final OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(TimModel clubModel);
    }

    public TimAdapter(ArrayList<TimModel> listClub, OnItemClickListener listener) {
        this.listClub = listClub;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TimModel club = listClub.get(position);
        holder.tvNamaClub.setText(club.getNamaClub());
        holder.tvStadion.setText(club.getStadion());

        Glide.with(holder.itemView.getContext())
                .load(club.getImageUrl())
                .into(holder.ivClub);

        holder.itemView.setOnClickListener(v -> listener.onItemClick(club));
    }

    @Override
    public int getItemCount() {
        return listClub.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaClub;
        TextView tvStadion;
        ImageView ivClub;

        public ViewHolder(View itemView) {
            super(itemView);
            tvNamaClub = itemView.findViewById(R.id.tvNamaClub);
            tvStadion = itemView.findViewById(R.id.tvDeskripsiClub);
            ivClub = itemView.findViewById(R.id.ivClub);
        }
    }
}

