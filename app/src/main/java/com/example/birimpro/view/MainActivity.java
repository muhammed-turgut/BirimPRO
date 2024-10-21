package com.example.birimpro.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.birimpro.myfunction.OnNumberClickListener;
import com.example.birimpro.R;
import com.example.birimpro.fragments.HacimFragment;
import com.example.birimpro.fragments.HizFragment;
import com.example.birimpro.fragments.KutleFragment;
import com.example.birimpro.fragments.SicaklikFragment;
import com.example.birimpro.fragments.SureFragment;
import com.example.birimpro.fragments.UzunlukFragment;
import com.example.birimpro.fragments.VeriFragment;
import com.example.birimpro.fragments.alanFragment;

public  class MainActivity extends AppCompatActivity {

    TextView birim, donusturucu;
    Button button_alan, button_uzunluk, button_sicaklik, button_hacim, button_kutle, button_veri, button_hiz, button_sure;
    public ImageView isaretbutton, sifirbutton, virgulbutton, asagibutton, birbuttton, ikibutton, ucbutton, yukaributton, dortbutton, besbutton, altibutton, resetbutton, yedibutton, sekizbutton, dokuzbutton, clearbutton;
    String fragmentSelected;
   int reset=0,clear=0,yukari=1,asagi=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Fragment'i yükle
        loadFragment(new alanFragment());

        // TextView'leri tanımla
        birim = findViewById(R.id.birim);
        donusturucu = findViewById(R.id.donusturucu);

        // Button'ları tanımla
        button_alan = findViewById(R.id.button_Alan);
        button_uzunluk = findViewById(R.id.button_uzunluk);
        button_sicaklik = findViewById(R.id.button_sıcaklık);
        button_hacim = findViewById(R.id.button_hacim);
        button_kutle = findViewById(R.id.button_kütle);
        button_veri = findViewById(R.id.button_veri);
        button_hiz = findViewById(R.id.button_hız);
        button_sure = findViewById(R.id.button_süre);

        // Tuş takımındaki butonları tanımla
        isaretbutton = findViewById(R.id.isaretbutton);
        sifirbutton = findViewById(R.id.sifirbutton);
        virgulbutton = findViewById(R.id.virgulbutton);
        asagibutton = findViewById(R.id.asagibutton);
        birbuttton = findViewById(R.id.birbutton);
        ikibutton = findViewById(R.id.ikibutton);
        ucbutton = findViewById(R.id.ucbutton);
        yukaributton = findViewById(R.id.yukaributton);
        dortbutton = findViewById(R.id.dortbutton);
        besbutton = findViewById(R.id.besbutton);
        altibutton = findViewById(R.id.altibutton);
        resetbutton = findViewById(R.id.resetbutton);
        yedibutton = findViewById(R.id.yedibutton);
        sekizbutton = findViewById(R.id.sekizbutton);
        dokuzbutton = findViewById(R.id.dokuzbutton);
        clearbutton = findViewById(R.id.cleanbutton);

        // Tıklama olaylarını ayarla
        setNumberButtonClickListeners();

        button_alan.setOnClickListener(v -> {
            loadFragment(new alanFragment());
            fragmentSelected = "Alan";
        });

        button_uzunluk.setOnClickListener(v -> {
            loadFragment(new UzunlukFragment());
            fragmentSelected = "Uzunluk";
        });

        button_sicaklik.setOnClickListener(v -> {
            loadFragment(new SicaklikFragment());
            fragmentSelected = "Sicaklik";
        });

        button_hacim.setOnClickListener(v -> {
            loadFragment(new HacimFragment());
            fragmentSelected = "Hacim";
        });

        button_kutle.setOnClickListener(v -> {
            loadFragment(new KutleFragment());
            fragmentSelected = "Kutle";
        });

        button_veri.setOnClickListener(v -> {
            loadFragment(new VeriFragment());
            fragmentSelected = "Veri";
        });

        button_hiz.setOnClickListener(v -> {
            loadFragment(new HizFragment());
            fragmentSelected = "Hiz";
        });

        button_sure.setOnClickListener(v -> {
            loadFragment(new SureFragment());
            fragmentSelected = "Sure";
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }

    private void setNumberButtonClickListeners() {

        //Burda sayı buttonları dısındaki buttonlara tıklandığını kontrol ettmek için.
        resetbutton.setOnClickListener(v -> onProcessClick("reset",asagi,yukari));
        clearbutton.setOnClickListener(v -> onProcessClick("clear",asagi,yukari));
        yukaributton.setOnClickListener(v -> onProcessClick("yukari",asagi=0,yukari=1));
        asagibutton.setOnClickListener(v -> onProcessClick("asagi",asagi=1,yukari=0));
        isaretbutton.setOnClickListener(v -> onProcessClick("-",asagi,yukari));

        // Sayı butonlarına tıklama olaylarını ayarla
        virgulbutton.setOnClickListener(v -> onNumberButtonClick("."));
        birbuttton.setOnClickListener(v -> onNumberButtonClick("1"));
        ikibutton.setOnClickListener(v -> onNumberButtonClick("2"));
        ucbutton.setOnClickListener(v -> onNumberButtonClick("3"));
        dortbutton.setOnClickListener(v -> onNumberButtonClick("4"));
        besbutton.setOnClickListener(v -> onNumberButtonClick("5"));
        altibutton.setOnClickListener(v -> onNumberButtonClick("6"));
        yedibutton.setOnClickListener(v -> onNumberButtonClick("7"));
        sekizbutton.setOnClickListener(v -> onNumberButtonClick("8"));
        dokuzbutton.setOnClickListener(v -> onNumberButtonClick("9"));
        sifirbutton.setOnClickListener(v -> onNumberButtonClick("0"));
        // Diğer butonlar için ekleyebilirsin
    }

    private void onNumberButtonClick(String number) {

        //Aşağıdaki fragment nesnesi seçilen fragemete anlıyor.
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (currentFragment instanceof OnNumberClickListener) {
            ((OnNumberClickListener) currentFragment).onNumberClick(number);
        }
    }
    private void onProcessClick(String islem,int tipAsagi,int tipyukari){
        Fragment currentFragment = getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (currentFragment instanceof OnNumberClickListener) {
            ((OnNumberClickListener) currentFragment).onProcessClick(islem,tipAsagi,tipyukari);
        }
    }

}
