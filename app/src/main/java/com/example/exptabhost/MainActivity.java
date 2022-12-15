package com.example.exptabhost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

TabHost TH;
TabHost.TabSpec spec;
TextView txt3,txt2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt3=(TextView) findViewById(R.id.txt3);
        txt2=(TextView) findViewById(R.id.txt2);
        TH=(TabHost) findViewById(R.id.TH);
        TH.setup();
        spec= TH.newTabSpec("t1");
        View V = LayoutInflater.from(this).inflate(R.layout.aa,null);
        spec.setIndicator(V);
        spec.setContent(R.id.tab1);
        TH.addTab(spec);

        spec= TH.newTabSpec("t2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab 2");
        TH.addTab(spec);

        spec= TH.newTabSpec("t3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab 3");
        TH.addTab(spec);

        spec= TH.newTabSpec("t4");
        spec.setContent(R.id.tab4);
        spec.setIndicator("Tab 4");
        TH.addTab(spec);
        TH.setCurrentTab(2); //Indice de l’onglet à sélectionner

TH.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
    @Override

    public void onTabChanged(String s) {

        switch (s) {
            case "t1":
                txt2.setText("bonjour tab1");
            //    Toast.makeText(getApplicationContext(),
              //          "bonjour tab1", Toast.LENGTH_SHORT).show();
                break;
            case "t2":
                Toast.makeText(getApplicationContext(),
                        "bonjour tab2" , Toast.LENGTH_SHORT).show();
                break;
            case "t3":
                Toast.makeText(getApplicationContext(),
                        "bonjour tab3" , Toast.LENGTH_SHORT).show();
                break;
            case "t4":
                Toast.makeText(getApplicationContext(),
                        "bonjour tab4" , Toast.LENGTH_SHORT).show();
                break;
        }

    }
});

    }
}