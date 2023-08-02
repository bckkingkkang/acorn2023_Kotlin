package com.example.hellokotlin

fun main() {
    // 수정 불가능한 Map
    // mapOf ( key to value, key to value, ...)
    val mem : Map<String, Any>
        = mapOf<String, Any>("num" to 1, "name" to "김구라", "isMan" to true)

    // Map 에 저장된 데이터 참조 get
    val num:Any?= mem.get("num")
    // java ) int num = (int)mem.get("num")
    val name:Any? = mem.get("name")
    val isMan:Any? = mem.get("isMan")

    // Map 에 저장된 데이터 참조 [ ]
    val num2:Int = mem["num"] as Int
    // Int type으로 casting
    val name2:String = mem["name"] as String
    val isMan2:Boolean = mem["isMan"] as Boolean

    // mem["num"] = 2 수정 불가
}
