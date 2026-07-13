package com.example.aiassistant

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.graphics.Path
import android.view.accessibility.AccessibilityEvent

class AutoControlService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Ekran değişikliklerini izler
    }

    override fun onInterrupt() {}

    // Belirli bir X, Y koordinatına otomatik tıklama fonksiyonu
    fun clickAtLocation(x: Float, y: Float) {
        val builder = GestureDescription.Builder()
        val path = Path().apply {
            moveTo(x, y)
        }
        builder.addStroke(GestureDescription.StrokeDescription(path, 0, 100))
        dispatchGesture(builder.build(), null, null)
    }
}
