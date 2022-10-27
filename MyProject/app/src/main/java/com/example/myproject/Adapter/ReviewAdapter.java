package com.example.myproject.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myproject.Domain.CategoryDomain;
import com.example.myproject.Domain.ReviewDomain;
import com.example.myproject.R;

import java.util.ArrayList;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolder> {

    ArrayList<ReviewDomain>reviewDomains;
    int total;

    public ReviewAdapter(ArrayList<ReviewDomain> reviewDomains) {
        this.reviewDomains = reviewDomains;
    }

    @Override
    public ReviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_review,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewAdapter.ViewHolder holder, int position) {
        holder.reviewTitle.setText(reviewDomains.get(position).getTitle());
        holder.reviewContents.setText(reviewDomains.get(position).getContents());
        holder.reviewDate.setText(reviewDomains.get(position).getDate());
        holder.ratingBar.setRating(reviewDomains.get(position).getRating());
        total = (Integer)reviewDomains.get(position).getRating();


    }

    @Override
    public int getItemCount() {
        return reviewDomains.size();
    }

    public int getTotal(){
        return total;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView reviewTitle, reviewContents, reviewDate;
        ImageView reviewPic;
        RatingBar ratingBar;
        CardView reviewCardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            reviewTitle = itemView.findViewById(R.id.review_title);
            reviewContents = itemView.findViewById(R.id.review_contents);
            reviewDate = itemView.findViewById(R.id.review_date);
            reviewPic = itemView.findViewById(R.id.review_Pic);
            ratingBar = itemView.findViewById(R.id.review_ratingbar);
            reviewCardView = itemView.findViewById(R.id.review_cardview);
        }
    }
}
