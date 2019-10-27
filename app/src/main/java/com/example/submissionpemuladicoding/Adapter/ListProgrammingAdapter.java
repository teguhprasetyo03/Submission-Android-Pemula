package com.example.submissionpemuladicoding.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.submissionpemuladicoding.Activity.DetailActivity;
import com.example.submissionpemuladicoding.Model.Programming;
import com.example.submissionpemuladicoding.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class ListProgrammingAdapter extends RecyclerView.Adapter<ListProgrammingAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<Programming> listProgramming;

    public  ListProgrammingAdapter(ArrayList<Programming> list){
        this.listProgramming = list;
    }

    ListProgrammingAdapter(Context context){
        this.context = context;
    }

    @NonNull
    @Override
    public ListProgrammingAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_programming , viewGroup , false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Programming programming = listProgramming.get(position);

        Glide.with(holder.itemView.getContext())
                .load(programming.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(programming.getName());

        holder.programming = programming;

        holder.btnProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Detail " +
                        listProgramming.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(holder.itemView.getContext(),  DetailActivity.class);
                intent.putExtra("key" , programming);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listProgramming.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName , tvDetail;
        Button btnProgramming;
        Programming programming;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photos);
            tvName = itemView.findViewById(R.id.tv_item_name);
            btnProgramming = itemView.findViewById(R.id.btn_programming);
        }
    }
}
