package com.example.physicspro;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Practice extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    TextView ans;
    ImageView Iv;
    Spinner spinner;
    String[] arry = new String[7];
    AlertDialog.Builder adb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        arry[0] = "בגרות 2017";
        arry[1] = "בגרות 2016";
        arry[2] = "בגרות 2015";
        arry[3] = "בגרות 2014";
        arry[4] = "בגרות 2013";
        arry[5] = "בגרות 2012";
        arry[6] = "בגרות 2011";

        adb= new AlertDialog.Builder(this);
        adb.setTitle("הודעה");
        adb.setMessage("לחץ על מקור התרגיל בכדי לבחור תרגילים נוספים לצפייה");
        adb.setIcon(R.drawable.alert_icon2);
        adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();

            }

        });
        AlertDialog ad=adb.create();
        ad.show();


        spinner = (Spinner) (findViewById(R.id.spinner));
        Iv= (ImageView)(findViewById(R.id.imagev)) ;
        ans = (TextView) (findViewById(R.id.ans));


        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arry);
        adp.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adp);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public void credits(MenuItem item) {
        Intent t=new Intent(this,Credits.class);
        startActivity(t); }


        @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            switch (position) {
                case 0:Iv.setImageResource(R.drawable.ex1);
                    ans.setText("תשובה סופית: א) 0.351  ב)78.09");
                    break;

                case 1:
                    Iv.setImageResource(R.drawable.ex2);
                    ans.setText("תשובה סופית: 0  ");
                    break;

                case 2:
                    Iv.setImageResource(R.drawable.ex3);
                    ans.setText("");
                    break;

                case 3:
                    Iv.setImageResource(R.drawable.ex4);
                    ans.setText("");
                    break;

                case 4:
                    Iv.setImageResource(R.drawable.ex5);
                    ans.setText("");
                    break;

                case 5:
                    Iv.setImageResource(R.drawable.ex6);
                    ans.setText("תשובה סופית: א)4  ב)0.05 ");
                    break;


                case 6:
                    Iv.setImageResource(R.drawable.ex8);
                    ans.setText("תשובה סופית:  א) גוף B צריך להיות המושך משום שמקדם החיכוך שלו קטן יותר.  ב)2.46  ג)9.14");
                    break;

            }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void back2(View view) {
        finish();
    }

    public void start(View view) {
        Intent t = new Intent(this, Main.class);
        startActivity(t);
    }

}
