package com.example.coordinatorlayouttutorial

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat.setScaleY
import androidx.core.view.ViewCompat.setScaleX
import de.hdodenhof.circleimageview.CircleImageView
import androidx.coordinatorlayout.widget.CoordinatorLayout

/**
 * Created by Franz Andel on 2019-08-08.
 * Android Engineer
 */

class CustomBehavior(context: Context, attrs: AttributeSet) :
    CoordinatorLayout.Behavior<CircleImageView>(context, attrs) {

    override fun layoutDependsOn(parent: CoordinatorLayout, child: CircleImageView, dependency: View): Boolean {
        return dependency is Toolbar
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout, child: CircleImageView, dependency: View): Boolean {
        val dependencyLocation = IntArray(2)
        val childLocation = IntArray(2)

        dependency.getLocationInWindow(dependencyLocation)
        child.getLocationInWindow(childLocation)

        val diff = (childLocation[1] - dependencyLocation[1]).toFloat()
        if (diff > 0) {
            val scale = diff / childLocation[1].toFloat()
            Log.d(TAG, "scale == $scale")
            child.scaleX = 1 + scale
            child.scaleY = 1 + scale
        }
        return false
    }

    companion object {

        private val TAG = "CustomBehavior"
    }
}