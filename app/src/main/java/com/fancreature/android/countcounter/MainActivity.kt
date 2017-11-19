package com.fancreature.android.countcounter

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by admin on 18/11/2017.
 */
class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_ganti_teks.setOnClickListener ({
            txt_test.text = "Hei juga hahaha"
        })
    }
}
