package com.murilokr.pads.logic


import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

data class Pads(val id: String) : AppCompatActivity() {

    var padIdentifier: Int? = null

    init {
        padIdentifier = resources.getIdentifier(id, "string", packageName)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun pulsar(color: String) {
        println("PAD $id ($padIdentifier) pulsando $color")

        val colorID = resources.getIdentifier(color, "string", packageName)

        getView().background.setTint(colorID)
    }

    fun getView(): View = findViewById<Button>(padIdentifier!!)
}