package dev.lchang.appue.presentation.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.core.app.NotificationCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pc02moviles22200220_22200136.data.repository.RegisterScreen


@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "register"){

        composable("register") { RegisterScreen(navController) }
        //composable ("lista") { LoginScreen(navController) }


    }
}