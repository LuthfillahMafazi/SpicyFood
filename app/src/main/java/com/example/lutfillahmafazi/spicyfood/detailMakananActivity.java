package com.example.lutfillahmafazi.spicyfood;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class detailMakananActivity extends AppCompatActivity {

    @BindView(R.id.imgMakanan)
    ImageView imgMakanan;
    @BindView(R.id.txtMakanan)
    TextView txtMakanan;
    @BindView(R.id.txtDetailMakanan)
    TextView txtDetailMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);
        ButterKnife.bind(this);


        txtDetailMakanan.setText(getIntent().getStringExtra("nm"));
        txtMakanan.setText(getIntent().getStringExtra("dm"));
        Glide.with(this).load(getIntent().getIntExtra("gm",0)).into(imgMakanan);
    }
}
