package com.example.superheroes.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.superheroes.model.HeroesRepository

@Composable
fun HeroApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { TopBar(modifier = Modifier.fillMaxWidth())}
    ) {contentPadding ->
        LazyColumn(
            modifier
                .background(MaterialTheme.colors.background)
                .padding(contentPadding)
        ) {
            items(HeroesRepository.heroes) { hero ->
                HeroCard(hero, modifier = Modifier.fillMaxWidth())
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}