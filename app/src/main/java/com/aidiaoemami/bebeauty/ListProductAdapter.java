package com.aidiaoemami.bebeauty;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.lang.reflect.Type;
import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class ListProductAdapter extends RecyclerView.Adapter<ListProductAdapter.CategoryViewHolder> {
    private Context context;

    ArrayList<Product> getListProduct(){
        return listProduct;
    }

    void setListProduct(ArrayList<Product> listProduct){
        this.listProduct = listProduct;
    }

    private ArrayList<Product> listProduct;

    ListProductAdapter(Context context){
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_product, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, final int position){
        final Product product = getListProduct().get(position);
        holder.tvName.setText(getListProduct().get(position).getName());
        holder.tvDesc.setText(getListProduct().get(position).getDesc());
        Glide.with(context)
                .load(getListProduct().get(position).getPhoto())
                .override(55,55)
                .into(holder.imgPhoto);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra("photo", getListProduct().get(position).getPhoto());
                i.putExtra("name", product.getName());
                i.putExtra("desc", product.getDesc());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount(){
        return getListProduct().size();
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        TextView tvDesc;
        ImageView imgPhoto;
        RelativeLayout relativeLayout;

        CategoryViewHolder(View itemView){
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tv_item_name);
            tvDesc = (TextView)itemView.findViewById(R.id.tv_item_desc);
            imgPhoto = (ImageView)itemView.findViewById(R.id.img_item_photo);
            relativeLayout = itemView.findViewById(R.id.relativeLayout);
        }
    }
}
