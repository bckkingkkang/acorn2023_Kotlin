package com.example.hellokotlin

class Gun {
    fun fire() {
        println("Gun!")
    }
    fun prepare() {
        println("Gun prepare...")
    }
    fun end() {
        println("Gun end")
    }
}

// 가상의 다이얼로그 클래스
class Dialog {
    fun setTitle(title:String) {

    }
    fun setContent(content:String) {

    }
    fun create() {}
}

fun main() {
    val g1 = Gun()

    g1.fire()
    g1.fire()
    g1.fire()
    println("----------------");

    // with : 이미 만들어진 객체의 참조값을 여러 번 사용하고 싶은 경우
    with(g1) {
        prepare()
        fire()
        fire()
        fire()
        end()
    }

    val d1 = Dialog()

    with(d1) {
        setTitle("제목")
        setContent("내용")
        create()
    }

    // 객체 생성과 동시에 필요한 작업을 한 후에 참조값을 대입할 수 있다.
    val d2 = Dialog().apply {
        setTitle("제목")
        setContent("내용")
        create()
    }
}

