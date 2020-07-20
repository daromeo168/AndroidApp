package com.example.androidapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmailsAdapter extends RecyclerView.Adapter<EmailViewHolder> {
    //Dataset
    private Email[] emails;
    private OnNoteListener mOnNoteListener;

    public EmailsAdapter(Email[] emails,OnNoteListener onNoteListener) {
        this.emails = emails;
        this.mOnNoteListener = onNoteListener;
    }

    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_holder_email, parent, false);

        return new EmailViewHolder(itemView,mOnNoteListener);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {
        Email email = emails[position];
        holder.bind(email);
    }

    @Override
    public int getItemCount() {
        return emails.length;
    }



    public interface OnNoteListener{
        void onNoteClick(int position);

    }


}

