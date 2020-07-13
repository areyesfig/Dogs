package com.devtides.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.devtides.dogs.model.DogBreed

class DetailViewModel:ViewModel(){

    val dogLiveData = MutableLiveData<DogBreed>()

    fun fetch(){

        val dog = DogBreed("1","Corgi","15 years","breedGroup","breFor","tempreament","")
        dogLiveData.value = dog

    }
}