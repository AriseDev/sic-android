package com.crafts.crisp.sic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private var events: LinearLayout? = null
    private var team: LinearLayout? = null
    private var pictures: LinearLayout? = null
    private var contact: LinearLayout? = null
    private var sermons: LinearLayout? = null
    private var donate: LinearLayout? = null
    private var bulletin: LinearLayout? = null
    private var prayer: LinearLayout? = null
    private var more: LinearLayout? = null

    private val onClickListener = View.OnClickListener {
        when (it.id) {
            R.id.events -> {
                Log.w("MAIN", "EVENTS")
            }
            R.id.team -> {
                Log.w("MAIN", "TEAM")
            }
            R.id.pictures -> {
                Log.w("MAIN", "PICTURES")
            }
            R.id.contact -> {
                Log.w("MAIN", "CONTACT")
            }
            R.id.sermons -> {
                Log.w("MAIN", "SERMONS")
            }
            R.id.donate -> {
                Log.w("MAIN", "DONATE")
            }
            R.id.bulletin -> {
                Log.w("MAIN", "BULLETIN")
            }
            R.id.prayer -> {
                Log.w("MAIN", "PRAYER")
            }
            R.id.more -> {
                Log.w("MAIN", "MORE")
            }
            else -> throw UnsupportedOperationException(
                    "OnClick has not been implemented for " + resources.getResourceName(it.id))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        events = findViewById<LinearLayout>(R.id.events).apply { setOnClickListener(onClickListener) }
        team = findViewById<LinearLayout>(R.id.team).apply { setOnClickListener(onClickListener) }
        pictures = findViewById<LinearLayout>(R.id.pictures).apply { setOnClickListener(onClickListener) }
        contact = findViewById<LinearLayout>(R.id.contact).apply { setOnClickListener(onClickListener) }
        sermons = findViewById<LinearLayout>(R.id.sermons).apply { setOnClickListener(onClickListener) }
        donate = findViewById<LinearLayout>(R.id.donate).apply { setOnClickListener(onClickListener) }
        bulletin = findViewById<LinearLayout>(R.id.bulletin).apply { setOnClickListener(onClickListener) }
        prayer = findViewById<LinearLayout>(R.id.prayer).apply { setOnClickListener(onClickListener) }
        more = findViewById<LinearLayout>(R.id.more).apply { setOnClickListener(onClickListener) }
    }
}
