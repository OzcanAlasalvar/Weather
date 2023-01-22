package com.ozcan.alasalvar.search.navigation


import androidx.navigation.*
import androidx.navigation.compose.composable
import com.ozcan.alasalvar.model.data.City
import com.ozcan.alasalvar.search.SearchScreen


const val searchNavigationRoute = "search_route"

fun NavController.navigateToSearch(navOptions: NavOptions? = null) {
    this.navigate(searchNavigationRoute, navOptions)
}

fun NavGraphBuilder.searchScreen(
    onCancelClick: () -> Unit,
    onCityClicked: (City) -> Unit,
) {
    composable(
        route = searchNavigationRoute,
    ) {
        SearchScreen(
            onCancelClick = onCancelClick,
            onCityClicked = onCityClicked
        )
    }
}