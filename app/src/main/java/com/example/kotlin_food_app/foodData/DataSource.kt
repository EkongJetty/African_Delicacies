package com.example.kotlin_food_app.foodData

import com.example.kotlin_food_app.R
import com.example.kotlin_food_app.foodmodel.Declaration

class DataSource {

    fun loadDeclaration():List<Declaration>{
        return listOf(
            Declaration(R.string.Food1,R.drawable.afhag),
            Declaration(R.string.Food2,R.drawable.burger),
            Declaration(R.string.Food3,R.drawable.egusi),
            Declaration(R.string.Food4,R.drawable.moin),
            Declaration(R.string.Food5,R.drawable.ogbono),
            Declaration(R.string.Food6,R.drawable.porridge_beans),
            Declaration(R.string.Food7,R.drawable.pounded_yam),
            Declaration(R.string.Food8,R.drawable.rice),
            Declaration(R.string.Food9,R.drawable.shimp),
            Declaration(R.string.Food10,R.drawable.spagetti_soup)


        )
    }
}