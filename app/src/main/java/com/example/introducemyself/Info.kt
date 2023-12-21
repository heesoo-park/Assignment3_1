package com.example.introducemyself

// 아이디/비밀번호 저장공간
object Info {
    private val info_list = mutableListOf<Input>()

    fun setInfo(id: String, password: String) {
        info_list += Input(id, password)
    }

    fun findInfo(id: String, password: String): Boolean = info_list.contains(Input(id, password))

    data class Input (
        val id: String,
        val password: String,
    )
}