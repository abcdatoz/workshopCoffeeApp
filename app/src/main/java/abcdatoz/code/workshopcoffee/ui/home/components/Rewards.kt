package abcdatoz.code.workshopcoffee.ui.home.components

import abcdatoz.code.workshopcoffee.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Rewards(modifier: Modifier = Modifier) {
    Row(
        modifier
            .fillMaxWidth()
            .height(160.dp)
            .background(colorResource(id = R.color.brown))


    ) {

        val gold = Color(0xFFFFD700)
        var sliderPositions by remember {  mutableStateOf(0f) }


        Column(
            Modifier
                .fillMaxSize()
                .padding(horizontal = 10.dp, vertical = 12.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Workshop Rewards", color = Color.White)

            Row(
                Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
                , horizontalArrangement = Arrangement.SpaceBetween
            ) {


                Row (verticalAlignment = Alignment.CenterVertically){
                    Text("0 /", color = Color.White, fontSize = 40.sp)
                    Text("15 points", color = Color.White)
                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(Icons.Default.Star, "", tint = gold, modifier = Modifier.size(25.dp))
                    Text("1 Reward", color = Color.White)
                }

            }

            Slider(
                value = 0f,
                onValueChange = { sliderPositions = it},
                colors = SliderDefaults.colors(
                    thumbColor = MaterialTheme.colorScheme.secondary,
                    activeTrackColor = MaterialTheme.colorScheme.secondary,
                    inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer
                )
            )

            Text("how to get points?", color = Color.White)

        }
    }
}


@Composable
@Preview(showBackground = true)
fun RewardsPreview() {
    Rewards()
}