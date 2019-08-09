package com.manyhappyvery.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

var a = 1
var b = "aaa"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Header01.text = "Simple test in BT paring0"  + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  " + "\n" + "aaaaa" + "\n" + "bbbbb  "
        Header01.isVerticalScrollBarEnabled = true
        Header01.scrollBarSize = 5
        ;
        a = Header01.scrollY
        b = a.toString()
        body1.text = b

    }
}
