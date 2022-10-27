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
import com.example.myproject.Domain.ChatDomain;
import com.example.myproject.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    ArrayList<ChatDomain>chatDomains;


    public ChatAdapter(ArrayList<ChatDomain> chatDomains) {
        this.chatDomains = chatDomains;
    }

    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_message,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ViewHolder holder, int position) {

        holder.chat_title.setText(chatDomains.get(position).getTitle());
        holder.chat_msg.setText(chatDomains.get(position).getLastMsg());
        //holder.chat_num.setText(chatDomains.get(position).getNum());

    }

    @Override
    public int getItemCount() {
        return chatDomains.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView chat_title, chat_msg, chat_num;
        CircleImageView chat_img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            chat_img = itemView.findViewById(R.id.chat_item_imageview);
            chat_title = itemView.findViewById(R.id.chat_textview_title);
            chat_msg = itemView.findViewById(R.id.chat_item_textview_lastmessage);
            chat_num = itemView.findViewById(R.id.chat_textview_num);

        }
    }
}
