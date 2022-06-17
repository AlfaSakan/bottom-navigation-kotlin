package com.example.bottomnavigationtest.navigations.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavigationtest.navigations.BottomBarScreen
import com.example.bottomnavigationtest.screens.HomeScreen
import com.example.bottomnavigationtest.screens.ProfileScreen
import com.example.bottomnavigationtest.screens.SettingScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Setting.route) {
            SettingScreen()
        }
    }
}