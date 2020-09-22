package com.example.subs;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class GalleryActivity extends AppCompatActivity {
    int po;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_activity);


        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_keterangan")){

            String imageName = getIntent().getStringExtra("image_name");
            String imageKeterangan = getIntent().getStringExtra("image_keterangan");
            int image = getIntent().getIntExtra("image",po);

            setImage(image,imageName,imageKeterangan);
        }
    }

    private void setImage(int image, String imageName, String imageKeterangan) {
        TextView name = findViewById(R.id.names_gallery);
        name.setText(imageName);
        TextView keterangan = findViewById(R.id.keterangan_gallery);
        keterangan.setText(imageKeterangan);
        ImageView imageView = findViewById(R.id.images_gallery);
        Glide.with(this).asDrawable().load(image).into(imageView);

    }

}
