package com.oktaygenc.customsnackbardemo


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

// Extension function to show a custom Snackbar
fun Context.showCustomSnackBar(message: String, container: View?) {
    container?.let { // Check if the container view is not null
        // Inflate the custom Snackbar layout
        val snackView = LayoutInflater.from(this).inflate(R.layout.custom_snackbar, null)

        // Find the TextView in the custom Snackbar layout and set the message
        val snackbarText: TextView = snackView.findViewById(R.id.snackbar_text)
        snackbarText.text = message // Set the message text for the Snackbar

        // Create a Snackbar with an empty text for the main message
        val snackBar = Snackbar.make(container, "", Snackbar.LENGTH_LONG)
        snackBar.apply {
            // Add the custom Snackbar view to the Snackbar
            (view as ViewGroup).addView(snackView)
            show() // Display the Snackbar
        }
    }
}

