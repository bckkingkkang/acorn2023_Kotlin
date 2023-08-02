package com.example.hellokotlin

import com.example.hellokotlin.java.MemberDto
import com.example.hellokotlin.java.Sender
import java.util.Scanner

fun main() {
    // java 패키지의 Sender 클래스를 이용해서 객체를 생성
    val s = Sender()
    s.send("hello")

    // Scanner 입력 받는 객체 생성
    val scan = Scanner(System.`in`)
    print("입력 : ")
    val msg = scan.nextLine()
    println("입력받은 내용 : + $msg")

    // MemberDto 객체 생성
    val mem1 = MemberDto()
    // setter 메소드 호출
    mem1.num = 1
    mem1.name = "lee"
    mem1.addr = "경기"

    val a = mem1.num
    val b = mem1.name
    val c = mem1.addr
}