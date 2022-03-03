package com.syatria.loginlinear

import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()
//        val textView = findViewById<TextView>(android.R.id.textView)
//        textView.movementMethod = LinkMovementMethod.getInstance()
    }
}