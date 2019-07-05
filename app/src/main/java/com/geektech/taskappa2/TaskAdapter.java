package com.geektech.taskappa2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.MyViewHolder> {

    List<Task> list;

    public TaskAdapter(List<Task> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater= LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_task,viewGroup,false);
        MyViewHolder myViewHolder= new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.onBind(list.get(i));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleTextView;
        TextView descriptionTextView;
        TextView textSize;
        Task task;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView= itemView.findViewById(R.id.textTitle);
            descriptionTextView= itemView.findViewById(R.id.textDesc);
            textSize = itemView.findViewById(R.id.textSize);


        }
        public void onBind(Task task){
            this.task=task;
            titleTextView.setText(task.title);
            descriptionTextView.setText(task.description);
//            titleTextView.setTextSize(Integer.parseInt(task.textSize));
//            descriptionTextView.setTextSize(Integer.parseInt(task.textSize));
//            textSize.setText("Размер шрифта - " + task.textSize);
//            textSize.setTextSize(Integer.parseInt(task.textSize));
//            Log.d("textSize", task.textSize + " ");

        }
    }
}
