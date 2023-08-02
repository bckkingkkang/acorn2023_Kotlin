package com.example.hellokotlin

fun main() {
    // 수정 가능한 Map
    val mem:MutableMap<String, Any> = mutableMapOf<String, Any>()

    mem.put("num", 1)
    mem.put("name", "고가현")
    mem.put("inMan", false)

    val mem2 = mutableMapOf<String, Any>()

    // Map 에 데이터를 넣는 방법
    mem2["num"] = 2
    mem2["name"] = "돌콩"
    mem2["isMan"] = false

    mem["num"] = 3
}