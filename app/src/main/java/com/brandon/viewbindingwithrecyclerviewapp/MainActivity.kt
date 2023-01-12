package com.brandon.viewbindingwithrecyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.brandon.viewbindingwithrecyclerviewapp.databinding.ActivityMainBinding

// RV를 위해서
// 리사이클 뷰, 아이템 레이아웃, 뷰 홀더, 어댑터 가 필요하다

class MainActivity : AppCompatActivity() {

    var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        // binding.root 는 activity_main.xml 의 최상단에 있는 ConstraintLayout 이다
        setContentView(binding?.root)

        // 레이아웃 메니저를 레이아웃 어댑터에 적용하는 방법은 2가지가 있다.
        // 1. 코틀린 코드 2. xml 수정
        // 여기선 xml 을 수정한다
        val adapter = MainAdapter(TaskList.taskList)
        Log.e("song", "${TaskList.taskList}")
        // android:layout_height="wrap_content" 개별 아이템의 높이는 wrap 으로 감싼다
        // 1. 코틀린 코드 수정
        binding?.taskRv?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding?.taskRv?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}