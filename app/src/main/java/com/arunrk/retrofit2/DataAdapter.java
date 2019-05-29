package com.arunrk.retrofit2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.DataViewHolder> {

    List<Company> list;

    public DataAdapter(List<Company> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DataViewHolder(
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        holder.txtCompanyName.setText(list.get(position).coName);
        holder.txtSuppName.setText(list.get(position).suppName);
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {

        TextView txtSuppName, txtCompanyName;

        public DataViewHolder(@NonNull View itemView) {
            super(itemView);
            txtSuppName = itemView.findViewById(R.id.txtSuppName);
            txtCompanyName = itemView.findViewById(R.id.txtCompanyName);
        }
    }
}
