package com.linearlayout.ontap1.Main.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.linearlayout.ontap1.Model.ContactResult;
import com.linearlayout.ontap1.R;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    public Context context;
    public List<ContactResult> data;

    public void setContext(Context context) {
        this.context = context;
    }

    public void setData(List<ContactResult> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_item_layout,viewGroup,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {
        ContactResult contactResult = data.get(i);
        contactViewHolder.tvName.setText(contactResult.getName());
        contactViewHolder.tvPhone.setText(contactResult.getPhone());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvPhone;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tv_name);
            tvPhone=itemView.findViewById(R.id.tv_phone_number);
        }
    }
}

