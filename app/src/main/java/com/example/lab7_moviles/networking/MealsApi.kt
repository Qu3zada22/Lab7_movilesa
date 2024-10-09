package com.example.lab7_moviles.networking

import com.example.lab7_moviles.networking.response.MealResponseCategories
import com.example.lab7_moviles.networking.response.MealResponseFilter
import com.example.lab7_moviles.networking.response.MealResponseLookup
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealsApi {

    // Método GET para obtener categorías
    @GET("categories.php")
    fun getMealCategories(): Call<MealResponseCategories>

    // Método GET para obtener recetas filtradas por categoría
    @GET("filter.php")
    fun getMealsByCategory(@Query("c") category: String): Call<MealResponseFilter>

    // Método GET para obtener detalles de una receta por ID
    @GET("lookup.php")
    fun getMealById(@Query("i") mealId: String): Call<MealResponseLookup>
}
