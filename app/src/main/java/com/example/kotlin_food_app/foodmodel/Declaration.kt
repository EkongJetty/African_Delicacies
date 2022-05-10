package com.example.kotlin_food_app.foodmodel

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Declaration(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourcesId: Int)
