package com.example.lab7_moviles.ui.categories.viewmodel

import androidx.lifecycle.ViewModel
import com.example.lab7_moviles.networking.response.MealResponseCategories
import com.example.lab7_moviles.ui.categories.repository.MealsCategoriesRepository

class MealCategoriesViewModel(
    private val repository: MealsCategoriesRepository = MealsCategoriesRepository()
) : ViewModel() {

    fun getMealCategories(successCallback: (response: MealResponseCategories?) -> Unit) {
        repository.getMealCategories { response ->
            successCallback(response)
        }
    }
}
