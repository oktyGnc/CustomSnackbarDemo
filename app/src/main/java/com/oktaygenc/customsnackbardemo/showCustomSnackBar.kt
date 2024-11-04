package com.oktaygenc.customsnackbardemo


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

fun Context.showCustomSnackBar(message: String, container: View?) {
    container?.let {
        val snackView = LayoutInflater.from(this).inflate(R.layout.custom_snackbar, null)
        val snackbarText: TextView = snackView.findViewById(R.id.snackbar_text)
        snackbarText.text = message // Mesajı ayarlıyoruz

        val snackBar = Snackbar.make(container, "", Snackbar.LENGTH_LONG)
        snackBar.apply {
            (view as ViewGroup).addView(snackView)
            show()
        }
    }
}

