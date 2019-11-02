package com.aidiaoemami.bebeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    ImageView imgPhoto;
    TextView tvName, tvDesc;
    String productName, productDesc, productPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imgPhoto = findViewById(R.id.img_item_photo);
        tvDesc = findViewById(R.id.tv_item_desc);
        tvName = findViewById(R.id.tv_item_name);
        productDesc = getIntent().getStringExtra("desc");
        productName = getIntent().getStringExtra("name");
        productPhoto = getIntent().getStringExtra("photo");
        tvName.setText(productName);
        tvDesc.setText(productDesc);
        Glide.with(imgPhoto).load(productPhoto)
                .override(20,20)
                .into(imgPhoto);
//        imgPhoto.setImageURI(Uri.parse(productPhoto));
    }
}
