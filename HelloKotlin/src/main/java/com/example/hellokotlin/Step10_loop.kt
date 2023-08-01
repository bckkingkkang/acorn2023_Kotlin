package com.example.hellokotlin

fun main() {
    // 수정 불가능한 String 목록
    val names = listOf<String>("김구라", "해골", "원숭이", "햄스터", "덩어리");

    // 모든 아이템을 순서대로 참조
    for (item in names) {
        println(item)
    }
}
