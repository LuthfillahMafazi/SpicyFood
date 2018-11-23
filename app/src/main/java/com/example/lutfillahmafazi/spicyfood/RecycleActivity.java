package com.example.lutfillahmafazi.spicyfood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.myRecycle)
    RecyclerView myRecycle;

    String[] namaMakanan, detailMakanan;
    int[] gambarMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaMakanan = getResources().getStringArray(R.array.DaftarMakanan);
        detailMakanan = getResources().getStringArray(R.array.DetailMakananSpicy);
        gambarMakanan = new int[]{R.drawable.sambal_uleg_dari_indonesia,R.drawable.lobak_lada_sihcuan,R.drawable.kimchi,
        R.drawable.suicide_chicken,R.drawable.vindaloo_dari_india,R.drawable.shrimp_creole_dari_amerika,
        R.drawable.tom_yum_dari_thailand,R.drawable.red_dog_saloon_naga_viper_wings,R.drawable.bengal_village_phaal_curry};

        Adapter adapter = new Adapter(this,namaMakanan,detailMakanan,gambarMakanan);
        myRecycle.setHasFixedSize(true);
        myRecycle.setLayoutManager(new LinearLayoutManager(this));
        myRecycle.setAdapter(adapter);
    }
}
