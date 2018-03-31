package com.example.physicspro;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main extends AppCompatActivity {
    EditText et;
    FileOutputStream fos;
    OutputStreamWriter osw;
    BufferedWriter bw;
    String st;
    int l = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) (findViewById(R.id.Et));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;


    }


    public void credits(MenuItem item) {
        Intent t = new Intent(this, Credits.class);
        if (l == 1) {

            startActivity(t);
        }
        else

    {
        Toast.makeText(this, "אנא הכנס את שמך", Toast.LENGTH_SHORT).show();
    }

}


    public void one(View view) {
        if (l == 1) {
            int i = 1;
            Intent t = new Intent(this, Info.class);
            t.putExtra("rule", i);
            startActivity(t);
        } else {
            Toast.makeText(this, "אנא הכנס את שמך", Toast.LENGTH_SHORT).show();
        }
    }

    public void two(View view) {
        if (l == 1) {
            int i = 2;
            Intent t = new Intent(this, Info.class);
            t.putExtra("rule", i);
            startActivity(t);
        } else {
            Toast.makeText(this, "אנא הכנס את שמך", Toast.LENGTH_SHORT).show();
        }
    }

    public void three(View view) {
        if ((l == 1)) {
            int i = 3;
            Intent t = new Intent(this, Info.class);
            t.putExtra("rule", i);
            startActivity(t);
        } else {

            Toast.makeText(this, "אנא הכנס את שמך", Toast.LENGTH_SHORT).show();
        }
    }

    public void set(View view) {
        l=1;
        st= et.getText().toString();
        try {
            fos= openFileOutput("name.txt",Context.MODE_PRIVATE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        osw= new OutputStreamWriter(fos);
        bw= new BufferedWriter(osw);

        try {
            bw.write(st);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        et.setText("תודה על שיתוף הפעולה");
    }
}
