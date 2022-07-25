package com.example.androidcompose_mercadolibre

import ProductScreen
import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.androidcompose_mercadolibre.ui.DetailsScreen

@Composable
fun ComposeApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.PRODUCT
    ) {
        composable(Route.PRODUCT) { backStackEntry ->
            ProductScreen(
                onProductClick = { product_name ->
                    // In order to discard duplicated navigation events, we check the Lifecycle
                    if (backStackEntry.lifecycle.currentState == Lifecycle.State.RESUMED) {
                        navController.navigate("${Route.DETAIL}/$product_name")
                    }
                }
            )
        }
        composable(
            route = "${Route.DETAIL}/{${Argument.PRODUCT_NAME}}",
            arguments = listOf(
                navArgument(Argument.PRODUCT_NAME) {
                    type = NavType.StringType
                }
            ),
        ) {
            val product =
                (it.arguments?.get(Argument.PRODUCT_NAME) as String?).orEmpty()
            DetailsScreen(product)
        }
    }
}

object Route {
    const val PRODUCT = "product"
    const val DETAIL = "detail"
}

object Argument {
    const val PRODUCT_NAME = "product_name"
}
