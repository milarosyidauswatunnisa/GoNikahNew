package com.informatika.gonikah.gedung;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.informatika.gonikah.R;
import com.informatika.gonikah.data.model.Gedung;

import java.util.ArrayList;

public class GedungAdapter extends RecyclerView.Adapter<GedungAdapter.ViewHolder> {
    private ArrayList<Gedung> list = new ArrayList<>();

    public void setList(ArrayList<Gedung> list){
        this.list.clear();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gedung_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name, location;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.gedung_item_img);
            name = itemView.findViewById(R.id.gedung_item_name);
            location = itemView.findViewById(R.id.gedung_item_location);
        }

        void bind(Gedung gedung){
            name.setText(gedung.getName());
            location.setText(gedung.getLocation());
            image.setImageDrawable(itemView.getResources().getDrawable(gedung.getImage()));
        }
    }
}
