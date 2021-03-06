package com.kay.roomdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This methods finds the navHost which hold the floating button, making navigating between fragments work
        setupActionBarWithNavController(findNavController(R.id.fragment))
    }

    // navigate back to the first fragment
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragment)
        return navController.navigateUp() || onSupportNavigateUp()
    }
}
