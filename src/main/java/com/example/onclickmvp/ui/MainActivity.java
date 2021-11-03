package com.example.onclickmvp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.onclickmvp.R;

public class MainActivity extends AppCompatActivity implements MovieView{
    MoviePresenter presenter;
    TextView MovienameTV;
    Button getmoviebutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MovienameTV = findViewById(R.id.textView);
        getmoviebutton= findViewById(R.id.button2);

         presenter = new MoviePresenter(this);

         getmoviebutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 presenter.getMovieName();
             }
         });
    }

    @Override
    public void onGetMovieName(String MovieName) {
        MovienameTV.setText(MovieName);

    }
}