package com.brandon.viewbindingwithrecyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// RV를 위해서
// 리사이클 뷰, 아이템 레이아웃, 뷰 홀더, 어댑터 가 필요하다

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}