package com.example.androidrecipeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {
    private Context mContext;
    private List<Recipes> mData;

    public RecyclerViewAdapter(Context mContext, List<Recipes> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_recipe, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.recipeTitle.setText(mData.get(position).getRecipeName());
        holder.img_recipe_thumbnail.setImageResource(mData.get(position).getThumbnail());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, RecipeActivity.class);

                intent.putExtra("Name", mData.get(holder.getAdapterPosition()).getRecipeName());
                intent.putExtra("Ingredients", mData.get(holder.getAdapterPosition()).getRecipeIngredients());
                intent.putExtra("MethodTitle", mData.get(holder.getAdapterPosition()).getRecipeMethodTitle());
                intent.putExtra("Recipe", mData.get(holder.getAdapterPosition()).getRecipe());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView recipeTitle;
        CardView cardView;
        ImageView img_recipe_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            recipeTitle = itemView.findViewById(R.id.deneme);
            img_recipe_thumbnail = itemView.findViewById(R.id.recipe_img_id);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
