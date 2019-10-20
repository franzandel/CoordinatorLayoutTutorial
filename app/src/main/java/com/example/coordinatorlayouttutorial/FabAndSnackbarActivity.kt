package com.example.coordinatorlayouttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_fab_and_snackbar.*


class FabAndSnackbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fab_and_snackbar)

        showSnackbarButton.setOnClickListener {
            Snackbar.make(
                coordinatorLayout, "This is a simple Snackbar", Snackbar.LENGTH_LONG
            ).setAction("CLOSE") {
                    // Custom action
            }.show()
        }
    }
}
