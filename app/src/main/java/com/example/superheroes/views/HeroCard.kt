package com.example.superheroes.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroes.model.Hero

@Composable
fun HeroCard(hero: Hero, modifier: Modifier = Modifier){
    Card(){
       Row{
           Column() {
               Text(text = stringResource(id = hero.nameRes))
               Text(text = stringResource(id = hero.descriptionRes))
           }
           Image(painter = painterResource(id = hero.imageRes), contentDescription = stringResource(
               id = hero.nameRes
           ))
       }
    }
}

