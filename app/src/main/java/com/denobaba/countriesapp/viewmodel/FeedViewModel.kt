package com.denobaba.countriesapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.denobaba.countriesapp.model.countries

class FeedViewModel: ViewModel() {
    val countries1 = MutableLiveData<List<countries>>()
    val loading = MutableLiveData<Boolean>()
    val error = MutableLiveData<Boolean>()

    fun refreshdata(){

        val country1 = countries("Turkey","Istanbul",5000)
        val country2 = countries("France","Parıs",4000)

        val country3 = countries("Germany","Berlin",4000)

        val countryList = arrayListOf<countries>(country1,country2,country3)
        countries1.value = countryList
        error.value = false
        loading.value = false


    }





}