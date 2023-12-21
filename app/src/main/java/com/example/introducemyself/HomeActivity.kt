package com.example.introducemyself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random
import kotlin.random.nextInt

class HomeActivity : AppCompatActivity() {
    private val imgList = arrayListOf(
        R.drawable.ic_how_reg,
        R.drawable.ic_paragliding,
        R.drawable.ic_manage_accounts,
        R.drawable.ic_personal_injury,
        R.drawable.ic_record_voice
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvName: TextView = findViewById(R.id.tv_home_name)
        val tvId: TextView = findViewById(R.id.tv_home_id)
        // 로그인 액티비티에서 넘겨준 값 받기
        if (intent.hasExtra("id")) {
            tvName.text = "이름 : " + intent.getStringExtra("name")
            tvId.text = "아이디 : " + intent.getStringExtra("id")
        }

        val ivProfile: ImageView = findViewById(R.id.iv_home_profile)
        ivProfile.setImageResource(imgList[Random.nextInt(0 until imgList.size)])

        val btnFinish: ConstraintLayout = findViewById(R.id.btn_home_finish)
        // 종료 버튼 클릭 이벤트
        btnFinish.setOnClickListener {
            finish()
        }
    }
}