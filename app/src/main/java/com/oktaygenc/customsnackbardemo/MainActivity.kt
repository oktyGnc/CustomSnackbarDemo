package com.oktaygenc.customsnackbardemo

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.oktaygenc.customsnackbardemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Set a click listener on the button to show the custom Snackbar
        binding.showSnackbarButton.setOnClickListener {
            showCustomSnackbar() // Call the function to show the custom Snackbar
        }
    }

    // Function to display the custom Snackbar
    private fun showCustomSnackbar() {
        showCustomSnackBar("Custom Snackbar Message", binding.main) // Call the extension function to show the Snackbar
    }
}