package com.example.toastsnackbarapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout = findViewById<LinearLayout>(R.id.rootLayout)
        val btnToast = findViewById<Button>(R.id.btnToast)
        val btnSnackbar = findViewById<Button>(R.id.btnSnackbar)

        btnToast.setOnClickListener {
            Toast.makeText(this, "This is a Toast message", Toast.LENGTH_SHORT).show()
        }

        btnSnackbar.setOnClickListener {
            Snackbar.make(rootLayout, "This is a Snackbar message", Snackbar.LENGTH_LONG)
                .setAction("Undo") {
                    Toast.makeText(this, "Undo clicked", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}