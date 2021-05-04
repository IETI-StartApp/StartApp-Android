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
import com.ieti.startapp_android.cardProjectElement;


import java.util.List;

public class GridAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<cardProjectElement> projects;
    private LayoutInflater mInflater;
    private Context context;

    public GridAdapter(List<cardProjectElement> projects, Context context) {
        this.projects = projects;
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.card_project_element, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
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
