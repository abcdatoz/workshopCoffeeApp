package abcdatoz.code.workshopcoffee.ui.home.components

import abcdatoz.code.workshopcoffee.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeHeader (modifier : Modifier = Modifier){
    Row(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Hello Kurt",
            color = colorResource(id = R.color.brown),
            fontWeight = FontWeight.Bold
        )
        Text(text = "...", fontWeight = FontWeight.ExtraBold, fontSize = 30.sp)
    }
}

@Composable
@Preview(showBackground = true)
fun HomeHeaderPreview(){
    HomeHeader()
}