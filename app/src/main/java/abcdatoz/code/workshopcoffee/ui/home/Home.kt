package abcdatoz.code.workshopcoffee.ui.home

import abcdatoz.code.workshopcoffee.R
import abcdatoz.code.workshopcoffee.ui.home.components.HomeHeader
import abcdatoz.code.workshopcoffee.ui.home.components.ListaPromociones
import abcdatoz.code.workshopcoffee.ui.home.components.PromoCard
import abcdatoz.code.workshopcoffee.ui.home.components.Rewards
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home(modifier: Modifier = Modifier) {


    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        HomeHeader()

        Rewards(modifier.padding(horizontal = 5.dp))

        Spacer(modifier = Modifier.size(30.dp))
        Row (Modifier.fillMaxWidth().padding(start = 20.dp)){
            Text("Workshops Promos...", fontWeight = FontWeight.Bold)
        }


        ListaPromociones(modifier.padding(20.dp))


    }
}

@Composable
@Preview(showBackground = true)
fun HomePreview() {
    Home()
}







