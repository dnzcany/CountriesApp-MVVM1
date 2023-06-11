package com.denobaba.countriesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.denobaba.countriesapp.model.countries

class CountryViewModel: ViewModel() {
    val Contries = MutableLiveData<List<countries>>()
    fun getdatafromroom(){
        val country = countries("turkey","ankara",1000)
        Contries.value = listOf(country)


    }
}