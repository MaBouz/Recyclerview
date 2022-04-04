package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import static java.lang.Integer.parseInt;

public class EquipeAdapter extends RecyclerView.Adapter<EquipeAdapter.MyViewHolder> {
    private Context mContext;
    private Integer[] mImage;
    private String[] mTitle;
    private String[] msubTitle;

    public EquipeAdapter(Context mContext, Integer[] mImage, String[] mTitle, String[] msubTitle) {
        this.mContext = mContext;
        this.mImage = mImage;
        this.mTitle = mTitle;
        this.msubTitle = msubTitle;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout, parent, false);
        EquipeAdapter.MyViewHolder myViewHolder = new EquipeAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.title.setText(mTitle[position]);
        holder.subtitle.setText(msubTitle[position]);
        holder.imgView.setImageResource(mImage[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Position : "+ Integer.parseInt(String.valueOf(position + 1)) ,Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mTitle.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView subtitle;
        ImageView imgView;
        public MyViewHolder( View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title1);
            subtitle = (TextView) itemView.findViewById(R.id.subtitle1);
            imgView = (ImageView) itemView.findViewById(R.id.imgcar1);
        }
    }
}
