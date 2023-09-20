package com.luisestupinan.walletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Category> dataSet;

    public CategoryAdapter(ArrayList<Category> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_rb,parent,false);
        return new ViewHolder(myView);
    }


    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        Category myCategory = dataSet.get(position);
        holder.loadInfo(myCategory);
    }



    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvcategory,tvcolorcategory;
        private ImageView rbcategory;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvcategory = itemView.findViewById(R.id.tvNameCategory);
            tvcolorcategory = itemView.findViewById(R.id.tvColorCategory);

            rbcategory = itemView.findViewById(R.id.rb_im_category);
        }


        public void loadInfo(Category myCategory){
            tvcategory.setText(myCategory.getNombre());
            tvcolorcategory.setText(myCategory.getDescripcion());

            Picasso.get().load(myCategory.getIcon()).into(rbcategory);

        }
    }
}