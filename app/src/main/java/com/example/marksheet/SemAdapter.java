package com.example.marksheet;

import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SemAdapter extends RecyclerView.Adapter<SemAdapter.ListItemHolder> {

    private List<String> msem ;
    private MainActivity mainActivity;

    public SemAdapter(List<String> msem, MainActivity mainActivity) {
        this.msem = msem;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public SemAdapter.ListItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.semitem,parent,false);
        return new ListItemHolder(itemView) ;
    }

    @Override
    public void onBindViewHolder(@NonNull SemAdapter.ListItemHolder holder, int position) {

        holder.sem.setText(msem.get(holder.getAdapterPosition()));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),subjects.class);
                intent.putExtra("semCount",holder.getAdapterPosition());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return msem.size();
    }
    public class ListItemHolder extends RecyclerView.ViewHolder{

        TextView sem;

        public ListItemHolder(View view){
            super(view);
            sem=view.findViewById(R.id.tv_sem);
        }
    }
}
