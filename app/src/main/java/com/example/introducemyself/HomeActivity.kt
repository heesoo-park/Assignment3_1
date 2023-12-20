package com.example.introducemyself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt

class HomeActivity : AppCompatActivity() {
    val imgList = arrayListOf(
        R.drawable.ic_how_reg,
        R.drawable.ic_paragliding,
        R.drawable.ic_manage_accounts,
        R.drawable.ic_personal_injury,
        R.drawable.ic_record_voice
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 로그인 액티비티에서 넘겨준 값 받기
        val name = intent.getStringExtra("name")
        val id = intent.getStringExtra("id")

        // 변경이 필요한 뷰 객체 속성 변경
        val tvName: TextView = findViewById(R.id.tv_home_name)
        tvName.text = "이름 : $name"
        val tvId: TextView = findViewById(R.id.tv_home_id)
        tvId.text = "아이디 : $id"

        val ivProfile: ImageView = findViewById(R.id.iv_home_profile)
        ivProfile.setImageResource(imgList[Random.nextInt(0 until imgList.size)])

        val btnFinish: Button = findViewById(R.id.btn_home_finish)
        // 종료 버튼 클릭 이벤트
        btnFinish.setOnClickListener {
            finish()
        }
    }
}