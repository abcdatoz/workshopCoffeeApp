package abcdatoz.code.workshopcoffee.ui.home.components

import abcdatoz.code.workshopcoffee.R
import abcdatoz.code.workshopcoffee.ui.home.components.Promociones
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun ListaPromociones(modifier: Modifier = Modifier) {
    val listaPromociones = listOf(
        Promociones.Lunes,
        Promociones.Martes,
        Promociones.Miercoles,
        Promociones.Jueves,
        Promociones.Viernes,
        Promociones.Sabado,
        Promociones.Domingo

    )

    LazyColumn(modifier.fillMaxWidth()) {
        items(listaPromociones) { promo ->

            PromoCard(title = promo.title, subtitle = promo.subtitle , imageResId = promo.source )

        }
    }

}

sealed class Promociones(
    val title: String,
    val subtitle: String,
    val source: Int
) {
    object Lunes : Promociones("Lunes", "Alitas o Bonless $180", R.drawable.promoa)
    object Martes : Promociones("Martes", "Happy Hour: 12-3 pm", R.drawable.promob)
    object Miercoles : Promociones("Miercoles", "Alitas 3x2", R.drawable.promoc)
    object Jueves : Promociones("Jueves", "Botana Gratis", R.drawable.promod)
    object Viernes : Promociones("Viernes", "Destilados 2x1", R.drawable.promoe)
    object Sabado : Promociones("Sabado", "Happy Hour & Tequilas2x1", R.drawable.promof)
    object Domingo : Promociones("Domingo", "Cumplea;ero no paga", R.drawable.promog)
}