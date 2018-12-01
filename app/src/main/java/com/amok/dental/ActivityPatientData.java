package com.amok.dental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class ActivityPatientData extends AppCompatActivity {
    //todo Check differences between multiAutoCompleteTextView and AutoCompleteTextView
    private static final String[] TREATMENTS = new String[] {
            "Leczenie kanalowe", "Mostek", "Korona", "Wyrywanie zeba","Leczenie zabkow"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_data);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, TREATMENTS);
        MultiAutoCompleteTextView textView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
        textView.setAdapter(adapter);
    }
}
