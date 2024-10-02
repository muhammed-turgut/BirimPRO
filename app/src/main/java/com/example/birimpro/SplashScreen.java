package com.example.birimpro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Layout dosyasını ayarla
        setContentView(R.layout.activity_splash_screen); // Burada doğru layout dosyasını belirtin

        // Lottie animasyonunu başlat
        LottieAnimationView animationView = findViewById(R.id.lottieAnimationView);
        animationView.playAnimation();

        // SPLASH_DURATION süresi boyunca Splash Screen'i göster ve sonra ana ekrana geç
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // MainActivity'ye geçiş yap
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish(); // SplashActivity'yi kapat
            }
        }, 3000); // 3 saniye bekle
    }
}
