package com.dicoding.picodiploma.praktikum_ppb.ui.tugas1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.dicoding.picodiploma.praktikum_ppb.R;

public class Tugas1Fragment extends Fragment {
    private EditText etNama;
    private EditText etBB;
    private EditText etTB;
    private Button btnHitung;
    private TextView tvHasil;
//    private Tugas1ViewModel tugas1ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

//        tugas1ViewModel =
//                ViewModelProviders.of(this).get(Tugas1ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tugas1, container, false);
        etNama= root.findViewById(R.id.field_Nama);
        etTB=root.findViewById(R.id.field_TB);
        etBB=root.findViewById(R.id.field_BB);
        tvHasil=root.findViewById(R.id.hasil);
        btnHitung=root.findViewById(R.id.button_hasil);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HitungBmi();
            }
        });


//        final TextView textView = root.findViewById(R.id.field_Nama);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

    private void HitungBmi() {
        String Nama=etNama.getText().toString();
        Double TB= (Double.parseDouble(etTB.getText().toString()))/100;
        Double BB = Double.parseDouble(etBB.getText().toString());
        Double BMI = (BB)/(TB*TB);
        String arti="";
        if (BMI<18.4){
           arti="Under Weight";
        }else if(BMI<25 ) {
            arti = "Normal Weight";
        }else if(BMI<30){
            arti="Over Weight";
        }else if(BMI<35){
            arti="Obesity 1";
        }else if(BMI<40){
            arti="Obesity 2";
        }else if(BMI>=40){
            arti="Obesity 3";
        }
        tvHasil.setText(Nama+" Memiliki Nilai BMI = "+BMI+" Yang Berarti "+ arti );
    }

}
