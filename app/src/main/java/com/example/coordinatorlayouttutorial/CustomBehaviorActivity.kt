package com.example.coordinatorlayouttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_custom_behaviour.*

class CustomBehaviorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_behaviour)

        fab.setOnClickListener {
            Snackbar.make(
                civ, "This is a simple Snackbar", Snackbar.LENGTH_LONG
            ).setAction("CLOSE") {
                // Custom action
            }.show()
        }
    }
}
