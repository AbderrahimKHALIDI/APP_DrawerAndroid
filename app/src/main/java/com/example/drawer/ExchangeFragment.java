package com.example.drawer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ExchangeFragment extends Fragment {

    private EditText input;
    private Button btnConv;
    private TextView result;
    public ExchangeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vue= inflater.inflate(R.layout.fragment_exchange, container, false);
        input = vue.findViewById(R.id.txt_inp);
        btnConv = vue.findViewById(R.id.btn);
        result = vue.findViewById(R.id.txt_res);
        btnConv.setOnClickListener(v -> {
            float dollar = Float.parseFloat(input.getText().toString());
            float dirham = dollar * 10.26f;
            result.setText(String.valueOf(dirham) + " DH");
        });
        return  vue;
    }
}