package com.example.superheroes.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.superheroes.model.Hero

@Composable
fun HeroCard(hero: Hero, modifier: Modifier = Modifier){
    Card(
        modifier = modifier,
        elevation = 2.dp
    ){
       Row(modifier = Modifier.fillMaxWidth().padding(16.dp).height(72.dp)){
           Column(modifier = Modifier.weight(1f)) {
               Text(
                   text = stringResource(id = hero.nameRes),
                   style = MaterialTheme.typography.h3
               )
               Text(
                   text = stringResource(id = hero.descriptionRes),
                   style = MaterialTheme.typography.body1,
               )
           }
           Spacer(modifier = Modifier.width(16.dp))
           Image(
               painter = painterResource(id = hero.imageRes),
               contentDescription = stringResource(id = hero.nameRes),
               modifier = Modifier.size(72.dp).clip(RoundedCornerShape(15))
           )
       }
    }
}

