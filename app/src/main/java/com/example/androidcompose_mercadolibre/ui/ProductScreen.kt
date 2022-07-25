import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.androidcompose_mercadolibre.model.Product

val listProducts: List<Product> =
    listOf(
        Product(
            id = "",
            name = "iPad",
            detail = "",
            imageURL = "https://http2.mlstatic.com/D_NQ_NP_2X_801112-MLA46516512347_062021-F.jpg"
        ),
        Product(
            id = "",
            name = "iPhone",
            detail = "",
            imageURL = "https://http2.mlstatic.com/D_NQ_NP_2X_801112-MLA46516512347_062021-F.jpg"
        ),
        Product(
            id = "",
            name = "Mac",
            detail = "",
            imageURL = "https://http2.mlstatic.com/D_NQ_NP_2X_801112-MLA46516512347_062021-F.jpg"
        ),
        Product(
            id = "",
            name = "MacBook Air Pro",
            detail = "",
            imageURL = "https://http2.mlstatic.com/D_NQ_NP_2X_801112-MLA46516512347_062021-F.jpg"
        )
    )

@Composable
fun ProductScreen(
    onProductClick: (String) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        items(listProducts) { item ->
            ProductItem(item = item, onProductClick = onProductClick)
        }
    }
}

@Composable
fun ProductItem(item: Product, onProductClick: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onProductClick(item.name) }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            modifier = Modifier
                .size(40.dp),
            model = item.imageURL,
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = item.name,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = item.price,
            color = MaterialTheme.colors.onBackground
        )
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = item.detail,
            color = MaterialTheme.colors.onBackground
        )
    }
}
