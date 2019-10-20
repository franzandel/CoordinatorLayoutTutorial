package com.example.coordinatorlayouttutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupClickListener()
    }

    private fun setupClickListener() {
        btnFabAndSnackbar.setOnClickListener {
            val intent = Intent(this, FabAndSnackbarActivity::class.java)
            startActivity(intent)
        }
        btnFabFollowsWidget.setOnClickListener {
            val intent = Intent(this, FabFollowsWidgetActivity::class.java)
            startActivity(intent)
        }
        btnCollapsingToolbar.setOnClickListener {
            val intent = Intent(this, CollapsingToolbarActivity::class.java)
            startActivity(intent)
        }
        btnCustomBehavior.setOnClickListener {
            val intent = Intent(this, CustomBehaviorActivity::class.java)
            startActivity(intent)
        }
    }
}
