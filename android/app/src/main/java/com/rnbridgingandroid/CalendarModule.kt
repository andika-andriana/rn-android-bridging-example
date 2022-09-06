package com.rnbridgingandroid

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.widget.Toast

class CalendarModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    // add to CalendarModule.kt
    override fun getName() = "CalendarModule"

    @ReactMethod
    fun createCalendarEvent(message: String){
        Toast.makeText(getReactApplicationContext(), message,  Toast.LENGTH_SHORT).show()
    }
}