package com.devtides.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.devtides.dogs.model.DogBreed

class ListViewModel:ViewModel() {

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){

        val dog1 = DogBreed("1","Corgi","15 years","breedGroup","breFor","tempreament","")
        val dog2 = DogBreed("2","Labrador","10 years","breedGroup","breFor","tempreament","")
        val dog3 = DogBreed("3","Rotwailer","20 years","breedGroup","breFor","tempreament","")
        val dogList = arrayListOf<DogBreed>(dog1,dog2,dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false


    }
}