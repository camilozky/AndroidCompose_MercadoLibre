import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

val listProducts: List<String> =
    listOf(
        "iPad",
        "iPhone",
        "Mac",
        "MacBook Air Pro"
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
fun ProductItem(item: String, onProductClick: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onProductClick(item) }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
//        AsyncImage(
//            modifier = Modifier
//                .size(40.dp),
//            model = item.avatar,
//            contentDescription = null
//        )
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = item,
            color = MaterialTheme.colors.onBackground
        )
    }
}
