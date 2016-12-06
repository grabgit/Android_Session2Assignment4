package com.example.abhisheki.imageshowhide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnHideShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHideShow = (Button) findViewById(R.id.BtnHideShow);
        btnHideShow.setText("Hide");
        btnHideShow.setOnClickListener(MainActivity.this);


    }
        @Override
        public void onClick(View v) {

            Button btn = (Button) v;
            ImageView img = (ImageView) findViewById(R.id.MyImage);
            img.setVisibility(btn.getText() == "Hide" ? View.INVISIBLE : View.VISIBLE);
            btn.setText(btn.getText() == "Hide" ? "Show" : "Hide");
      }
}
