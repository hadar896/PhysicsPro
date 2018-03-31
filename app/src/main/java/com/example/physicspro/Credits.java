package com.example.physicspro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Credits extends AppCompatActivity {
    TextView Tv;
    InputStream is;
    InputStreamReader tmp;
    BufferedReader reader;
    StringBuffer buffer;
    String st;
    String s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_credits);

        Tv = (TextView) (findViewById(R.id.textView));

        try {
            is = openFileInput("name.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        tmp = new InputStreamReader(is);
        reader = new BufferedReader(tmp);
        buffer = new StringBuffer();

        try {
            while ((s = reader.readLine()) != null) {
                buffer.append(s);
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Tv.setText("שלום "+buffer+"תודה שבחרת להשתמש באפליקציה שלי, כל הזכויות שמורות להדר אלימלך :)");
    }




    public void baaack(View view) {
        finish();
    }


}
