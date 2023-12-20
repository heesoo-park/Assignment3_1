package com.example.introducemyself

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.introducemyself.Info.setInfo

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val editName: EditText = findViewById(R.id.edit_signup_name)
        val editId: EditText = findViewById(R.id.edit_signup_id)
        val editPassword: EditText = findViewById(R.id.edit_signup_password)
        val btnSignup: Button = findViewById(R.id.btn_signup_check)

        // 회원가입 버튼 클릭 이벤트
        btnSignup.setOnClickListener {
            // 입력해야하는 정보 중 하나라도 입력되지 않은 경우
            if (editName.text.isEmpty() || editId.text.isEmpty() || editPassword.text.isEmpty()) {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val name = editName.text.toString()
            val id = editId.text.toString()
            val password = editPassword.text.toString()

            // 정보 저장
            setInfo(id, password)
            // 로그인 액티비티로 보낼 값 설정
            intent.putExtra("name", name)
            intent.putExtra("id", id)
            intent.putExtra("password", password)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}