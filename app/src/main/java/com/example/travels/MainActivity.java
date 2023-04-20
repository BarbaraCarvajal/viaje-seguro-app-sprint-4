package com.example.travels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment fragment_home, fragment_presentation, fragment_verVuelos;

    TextView txtAnimado;
    Button btnVer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            fragment_home = new home();
            fragment_presentation = new presentation();
            fragment_verVuelos = new verVuelos();

            replaceFragment(new verVuelos());

            getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer, fragment_home).commit();

        }
    }

    public void goToHome(View view){
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment_presentation);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void verVuelos(View view){

        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment_verVuelos);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.rv1,fragment);
        fragmentTransaction.commit();
    }


}