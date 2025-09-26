package com.example.skysense

import android.util.Log
import androidx.lifecycle.ViewModel


class WeatherViewModel : ViewModel() {

    fun getData(city : String){
        Log.d("City name : ",city)
    }
}