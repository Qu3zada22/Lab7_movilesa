package com.example.lab7_moviles.ui.meals.viewmodel



import androidx.lifecycle.ViewModel
import com.example.lab7_moviles.networking.response.MealResponseFilter
import com.example.lab7_moviles.ui.meals.repository.MealFilterRepository

class MealFilterViewModel(private val repository: MealFilterRepository= MealFilterRepository()) : ViewModel() {
    fun getMealsByCategory(
        category: String,
        successCallback: (response: MealResponseFilter?) -> Unit
    ) {
        repository.getMealsByCategory(category) { response ->
            successCallback(response)
        }
    }
}
