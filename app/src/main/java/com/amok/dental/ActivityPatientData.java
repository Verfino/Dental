package com.amok.dental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class ActivityPatientData extends AppCompatActivity {
    private static final String[] TREATMENTS = new String[] {
            "Leczenie kanalowe", "Mostek", "Korona", "Wyrywanie zeba","Leczenie zabkow"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_data);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, TREATMENTS);
        AutoCompleteTextView textViewTreatment1 = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextViewTreatment1);
        AutoCompleteTextView textViewTreatment2 = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextViewTreatment2);
        AutoCompleteTextView textViewTreatment3 = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextViewTreatment3);
        AutoCompleteTextView textViewTreatment4 = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextViewTreatment4);
        textViewTreatment1.setAdapter(adapter);
        textViewTreatment2.setAdapter(adapter);
        textViewTreatment3.setAdapter(adapter);
        textViewTreatment4.setAdapter(adapter);

    }
}
