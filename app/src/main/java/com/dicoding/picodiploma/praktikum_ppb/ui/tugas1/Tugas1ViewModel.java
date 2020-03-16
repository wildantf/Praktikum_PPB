package com.dicoding.picodiploma.praktikum_ppb.ui.tugas1;

import android.widget.EditText;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Tugas1ViewModel extends ViewModel {



    private MutableLiveData<String> hasil;


//    public Tugas1ViewModel() {
//        hasil = new MutableLiveData<>();
//        hasil.setValue("This is home fragment");
//    }

    public LiveData<String> getText() {
        return hasil;
    }
}