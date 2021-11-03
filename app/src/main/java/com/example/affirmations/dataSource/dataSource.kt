package com.example.affirmations.dataSource

import com.example.affirmations.R
import com.example.affirmations.model.Afilliation

class Datasource {

    fun loadAffirmations(): List<Afilliation>{
//var list = mutableListOf<Afilliation>()

        return listOf<Afilliation>(
                 Afilliation(R.string.affirmation0),
                 Afilliation(R.string.affirmation1),
                 Afilliation (R.string.affirmation2),
                 Afilliation (R.string.affirmation3),
                 Afilliation (R.string.affirmation4),
                 Afilliation (R.string.affirmation5),
                 Afilliation (R.string.affirmation6),
                 Afilliation (R.string.affirmation7),
                 Afilliation (R.string.affirmation8),
                 Afilliation (R.string.affirmation9),
                 Afilliation (R.string.affirmation10),
                 Afilliation (R.string.affirmation11)

        )
    }
}