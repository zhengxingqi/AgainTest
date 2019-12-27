package com.zhengxingqi.againtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }

    fun test(){
        Log.i(TAG,"000000000000000000 ")
    }

    companion object{
        private const val TAG = "MainActivity"
    }
}
