package com.example.lutfillahmafazi.spicyfood;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    String[] namaMakanan, detailMakanan;
    int[] gambarMakanan;

    public Adapter(Context context, String[] namaMakanan, String[] detailMakanan, int[] gambarMakanan) {
        this.context = context;
        this.namaMakanan = namaMakanan;
        this.detailMakanan = detailMakanan;
        this.gambarMakanan = gambarMakanan;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_makanan,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.txtMakanan.setText(namaMakanan[i]);
        Glide.with(context).load(gambarMakanan[i]).into(viewHolder.imgMakanan);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context, detailMakananActivity.class);
                pindah.putExtra("nm",namaMakanan[i]);
                pindah.putExtra("dm",detailMakanan[i]);
                pindah.putExtra("gm",gambarMakanan[i]);
                context.startActivity(pindah);

            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarMakanan.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgMakanan;
        TextView txtMakanan;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMakanan = itemView.findViewById(R.id.imgListMakanan);
            txtMakanan = itemView.findViewById(R.id.txtListMakanan);
        }
    }
}
