package com.example.myproject.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myproject.Domain.BreadLocation;
import com.example.myproject.R;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BreadLocationAdapter extends RecyclerView.Adapter<BreadLocationAdapter.BreadLocationViewHolder>{

    private List<BreadLocation> breadLocations;

    public BreadLocationAdapter(List<BreadLocation> breadLocations) {
        this.breadLocations = breadLocations;
    }

    @NonNull
    @Override
    public BreadLocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BreadLocationViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.item_container_location,
                        parent,
                        false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull BreadLocationViewHolder holder, int position) {
        holder.setLocationData(breadLocations.get(position));
    }

    @Override
    public int getItemCount() {
        return breadLocations.size();
    }


    static class BreadLocationViewHolder extends RecyclerView.ViewHolder{


        private KenBurnsView kenBurnsView;
        private TextView textTitle, textLocation, textStartRating;


        public BreadLocationViewHolder(@NonNull View itemView) {
            super(itemView);
            kenBurnsView = itemView.findViewById(R.id.kbvLocation);
            textTitle = itemView.findViewById(R.id.textTitle);
            textLocation = itemView.findViewById(R.id.textLocation);
            textStartRating = itemView.findViewById(R.id.textStarRating);
        }

        void setLocationData(BreadLocation breadLocation){
            Picasso.get().load(breadLocation.imageUrl).into(kenBurnsView);
            textTitle.setText(breadLocation.title);
            textLocation.setText(breadLocation.location);
            textStartRating.setText(String.valueOf(breadLocation.starRating));
        }

    }
}
