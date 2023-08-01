package com.example.hellokotlin

import java.util.Scanner

fun main() {
    val scan = Scanner(System.`in`)

    println("Gun : 1, Sword : 2")
    print("무기 선택 (1 or 2) : ")
    val weapon = scan.nextInt()

    // weapon 안에 들어있는 숫자를 이용해서 분기
    when(weapon) {
        1 -> println("gun gun gun")
        2 -> println("sword sword sword")
    }

    // when 구문도 리턴 값을 가질 수 있음
    val selectedWeapon = when(weapon) {
        1 -> {
            // 실행할 구문이 많은 경우 블럭으로 구성 가능
            println("gun...")
            "ggun"
        }
        2 -> "ssword"
        else -> "nnn"
    }

    println("selected weapon : $selectedWeapon")
}