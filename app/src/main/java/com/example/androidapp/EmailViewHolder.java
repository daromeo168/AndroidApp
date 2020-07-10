package com.example.androidapp;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmailViewHolder extends RecyclerView.ViewHolder {
    private TextView txtSender;
    private TextView txtSubject;
    private TextView txtBody;

    public EmailViewHolder(@NonNull View ItemView){
        super(ItemView);
    }
    public void bind(Email email){
        txtSender.setText(email.getSender());
        txtSubject.setText(email.getSubject());
        txtBody.setText(email.getBody());
    }
}

