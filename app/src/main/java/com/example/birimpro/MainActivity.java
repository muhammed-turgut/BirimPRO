package com.example.birimpro;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.example.birimpro.fragments.HacimFragment;
import com.example.birimpro.fragments.HizFragment;
import com.example.birimpro.fragments.KutleFragment;
import com.example.birimpro.fragments.SicaklikFragment;
import com.example.birimpro.fragments.SureFragment;
import com.example.birimpro.fragments.UzunlukFragment;
import com.example.birimpro.fragments.VeriFragment;
import com.example.birimpro.fragments.alanFragment;

public class MainActivity extends AppCompatActivity {

    TextView birim,donusturucu;
    Button button_alan,button_uzunluk,button_sicaklik,button_hacim,button_kutle,button_veri,button_hiz,button_sure;
    ImageView isaretbutton,sifirbutton,virgulbutton,asagibutton,birbuttton,ikibutton,ucbutton,yukaributton,dortbutton,besbutton,altibutton,resetbutton,yedibutton,sekizbutton,dokuzbutton,clearbutton;

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int buttonId = intent.getIntExtra("buttonId", -1);
            // Burada butona tıklama olayını işleyebilirsin
        }
    };

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Burda bunu yapma sebebim uygulama açıldığı an framLayout kısmının boş kalmaması defult olması.
        loadFragment(new alanFragment());

        //Üsteki yazı kısmı javaya tanıtldı
        birim=findViewById(R.id.birim);
        donusturucu=findViewById(R.id.donusturucu);

        //Buttonların javaya tanıtılması
        button_alan=findViewById(R.id.button_Alan);
        button_uzunluk=findViewById(R.id.button_uzunluk);
        button_sicaklik=findViewById(R.id.button_sıcaklık);
        button_hacim=findViewById(R.id.button_hacim);
        button_kutle=findViewById(R.id.button_kütle);
        button_veri=findViewById(R.id.button_veri);
        button_hiz=findViewById(R.id.button_hız);
        button_sure=findViewById(R.id.button_süre);

        //Tus takimındaki tuslarin tanımlanması

        isaretbutton=findViewById(R.id.isaretbutton);
        sifirbutton=findViewById(R.id.sifirbutton);
        virgulbutton=findViewById(R.id.virgulbutton);
        asagibutton=findViewById(R.id.asagibutton);
        birbuttton=findViewById(R.id.birbutton);
        ikibutton=findViewById(R.id.ikibutton);
        ucbutton=findViewById(R.id.ucbutton);
        yukaributton=findViewById(R.id.yukaributton);
        dortbutton=findViewById(R.id.dortbutton);
        besbutton=findViewById(R.id.besbutton);
        altibutton=findViewById(R.id.altibutton);
        resetbutton=findViewById(R.id.resetbutton);
        yedibutton=findViewById(R.id.yedibutton);
        sekizbutton=findViewById(R.id.sekizbutton);
        dokuzbutton=findViewById(R.id.dokuzbutton);
        clearbutton=findViewById(R.id.cleanbutton);



        button_alan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new alanFragment());
            }
        });

        button_uzunluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new UzunlukFragment());
            }
        });

        button_sicaklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             loadFragment(new SicaklikFragment());
            }
        });
        button_hacim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              loadFragment(new HacimFragment());
            }
        });

        button_kutle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              loadFragment(new KutleFragment());
            }
        });

        button_veri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new VeriFragment());
            }
        });

        button_hiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               loadFragment(new HizFragment());
            }
        });

        button_sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              loadFragment(new SureFragment());
            }
        });






    }
    private void loadFragment(Fragment fragment){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }


    public interface OnButtonClickListener {
        void onButtonClicked(int buttonId, String fragmentTag);
    }

}