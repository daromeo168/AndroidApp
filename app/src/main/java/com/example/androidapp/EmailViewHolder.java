package com.example.androidapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmailViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private TextView fullName;
    private TextView eemail;
    private TextView City;
    EmailsAdapter.OnNoteListener onNoteListener;

    public EmailViewHolder(@NonNull View ItemView, EmailsAdapter.OnNoteListener onNoteListener){
        super(ItemView);
        fullName = itemView.findViewById(R.id.fullName);
        eemail = itemView.findViewById(R.id.email);
        City = itemView.findViewById(R.id.City);
        this.onNoteListener = onNoteListener;
        itemView.setOnClickListener(this);

    }

    public void bind(Email email){
        fullName.setText(email.getFullName());
        eemail.setText(email.getEmail());
        City.setText(email.getCity());

    }

    @Override
    public void onClick(View v) {
        onNoteListener.onNoteClick(getAdapterPosition());

    }
}



