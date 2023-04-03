package com.example.superheroes.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.superheroes.model.HeroesRepository

@Composable
fun HeroApp(){
    LazyColumn{
        items(HeroesRepository.heroes){hero ->
            HeroCard(hero)
        }
    }
}