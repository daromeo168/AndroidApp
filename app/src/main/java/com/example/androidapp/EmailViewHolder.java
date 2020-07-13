package com.example.androidapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmailViewHolder extends RecyclerView.ViewHolder {
    private TextView fullName;
    private TextView eemail;
    private TextView City;

    public EmailViewHolder(@NonNull View ItemView){
        super(ItemView);
        fullName = itemView.findViewById(R.id.fullName);
        eemail = itemView.findViewById(R.id.email);
        City = itemView.findViewById(R.id.City);
    }
    public void bind(Email email){
        fullName.setText(email.getFullName());
        eemail.setText(email.getEmail());
        City.setText(email.getCity());

    }
}

