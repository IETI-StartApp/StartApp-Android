package com.ieti.startapp_android.view.card;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.ieti.startapp_android.R;


import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<androidx.recyclerview.widget.ListAdapter.ViewHolder> {
    private List<cardProjectElement> projects;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<cardProjectElement> projects, LayoutInflater mInflater, Context context) {
        this.projects = projects;
        this.mInflater = mInflater;
        this.context = context;
    }

    @NonNull
    @Override
    public androidx.recyclerview.widget.ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.card_project_element, null);
        return new androidx.recyclerview.widget.ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull androidx.recyclerview.widget.ListAdapter.ViewHolder holder, int position) {
        holder.bindData(projects.get(position));
    }

    @Override
    public int getItemCount() {
        return projects.size();
    }

    public List<cardProjectElement> getProjects() {
        return projects;
    }

}
