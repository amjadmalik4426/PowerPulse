package com.example.workout.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.workout.Activity.WorkoutActivity;
import com.example.workout.Domain.Workout;
import com.example.workout.databinding.ViewholderWorkoutBinding;

import java.util.ArrayList;

public class WorkoutAdapter extends RecyclerView.Adapter<WorkoutAdapter.ViewHolder> {

    private final ArrayList<Workout> list;
    private Context context;

    public WorkoutAdapter(ArrayList<Workout> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public WorkoutAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ViewholderWorkoutBinding binding = ViewholderWorkoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkoutAdapter.ViewHolder holder, int position) {

        holder.binding.tittleTxt.setText(list.get(position).getTittle());
        int resId = context.getResources().getIdentifier(list.get(position).getPicPath(), "drawable", context.getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(resId)
                .into(holder.binding.pic);

        holder.binding.exersiceTxt.setText(list.get(position).getLessions().size() + " Exercise");
        holder.binding.kcalTxt.setText(list.get(position).getKcal() + " Kcal");
        holder.binding.durationTxt.setText(list.get(position).getDurationAll());

        holder.binding.getRoot().setOnClickListener(v -> {
            Intent intent = new Intent(context, WorkoutActivity.class);
            intent.putExtra("object", list.get(position));
            context.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ViewholderWorkoutBinding binding;
        public ViewHolder(ViewholderWorkoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
