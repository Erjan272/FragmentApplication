package com.example.fragmentapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    private TextView textView;
    private Button btn_plus_one, btn_minus_one;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = requireActivity().findViewById(R.id.tv_zero);
        btn_plus_one = requireActivity().findViewById(R.id.btn_plus_one);
        btn_minus_one = requireActivity().findViewById(R.id.btn_minus_one);

        btn_plus_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(textView.getText().toString());
                int res = num1 + 1;
                textView.setText(String.valueOf(res));

            }
        });

        btn_minus_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(textView.getText().toString());
                int res = num1 - 1;
                textView.setText(String.valueOf(res));

            }
        });

    }
}