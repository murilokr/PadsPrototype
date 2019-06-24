package com.murilokr.pads

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.murilokr.pads.logic.*
import kotlinx.android.synthetic.main.activity_main.*
import android.animation.ValueAnimator
import android.graphics.drawable.ShapeDrawable
import android.support.v4.content.ContextCompat
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.GradientDrawable
import android.os.Handler
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var padsSequenceList: ArrayList<PadSequence> = createSequence()

    //Color looper
    private var colorList: ArrayList<String> = ArrayList()
    private var colorIndex: Int = -1


    //Main UI
    var mainHandler: Handler = Handler()

    override fun onClick(v: View) {
        val id = v.id


        if (id == R.id.btnIniciar) {
            mainLoop()
        } else {
            colorIndex++
            if (colorIndex >= colorList.size)
                colorIndex = 0

            pulsar(id, colorList[colorIndex])
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()

        setColorList()
    }

    fun mainLoop() {
        Toast.makeText(this, "Iniciando Sequência...", Toast.LENGTH_LONG).show()
        val runnable: Runnable = MainLoop()
        Thread(runnable).start()

    }

    fun setColorList() {
        colorList.add("green")
        colorList.add("pink")
        colorList.add("blue")
        colorList.add("orange")
    }

    fun setListeners() {

        for (i in 1..12){
            var id = resources.getIdentifier("com.murilokr.pads:id/button$i", "string", packageName)
            findViewById<Button>(id).setOnClickListener(this)
        }
        btnIniciar.setOnClickListener(this)
    }

    fun correctColorName(color: String) = "com.murilokr.pads:color/$color"
    fun correctIdName(id: String) = "com.murilokr.pads:id/$id"

    fun pulsar(id: Int, colorStr: String) {


        val v: View = findViewById(id)
        val color = correctColorName(colorStr)

        resetView(v)
        println("PAD $id [${resources.getResourceName(v.id)}] pulsando $color")

        bringViewToFront(v)

        val colorID = resources.getIdentifier(color, "string", packageName)


        val background = v.background
        if (background is ShapeDrawable) {
            background.paint.color = ContextCompat.getColor(this, colorID)
        } else if (background is GradientDrawable) {
            background.setColor(ContextCompat.getColor(this, colorID))
        } else if (background is ColorDrawable) {
            background.color = ContextCompat.getColor(this, colorID)
        }

        val min = 1f
        val max = 2f
        val animator = ValueAnimator.ofFloat(min, max)
        animator.addUpdateListener { animation ->
            v.scaleX = animation.animatedValue as Float
            v.scaleY = animation.animatedValue as Float
            v.alpha = max - (animation.animatedValue as Float)
        }

        animator.duration = 500
        animator.repeatMode = ValueAnimator.REVERSE
        animator.repeatCount = 0
        animator.start()
    }

    fun resetView(v: View) {
        with(v) {
            scaleX = 1f
            scaleY = 1f
            alpha = 1f
        }
    }

    fun bringViewToFront(v: View){
        val id = v.id
        v.bringToFront()
        for (i in 1..12){
            var otherId = resources.getIdentifier("com.murilokr.pads:id/button$i", "string", packageName)
            if (otherId != id)
                findViewById<Button>(id).invalidate()
        }
    }
   

    //Thread para processar a sequencia
    internal inner class MainLoop : Runnable{
        override fun run() {
            var page: String?


            val progStart = System.currentTimeMillis()
            var color: String
            var pad: Int
            var time: Double
            for (sequence in padsSequenceList) {
                color = sequence.color
                pad = sequence.pad
                time = sequence.time

                if (color == "page" && pad > 99) {
                    val pageId = pad - 100
                    if (pageId == 0)
                        page = "Side A"
                    else
                        page = "Side B"
                    
                    mainHandler.post {
                        hdrSide.text = page
                    }

                    continue
                }

                var padName = correctIdName("button${if (pad <= 12) pad else pad - 12}")
                var padId = resources.getIdentifier(padName, "string", packageName)

                while (elapsedTime(progStart) < time) {
                }

                mainHandler.post {
                    pulsar(padId, color)
                }
            }

            mainHandler.post {
                Toast.makeText(this@MainActivity, "Sequencia Finalizada", Toast.LENGTH_LONG).show()
            }
        }

    }
}

fun elapsedTime(progStart: Long) = (System.currentTimeMillis() - progStart) / 1000.0