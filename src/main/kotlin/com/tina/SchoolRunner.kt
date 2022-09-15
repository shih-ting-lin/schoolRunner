package com.tina


import java.util.Scanner

fun main(args: Array<String>) {
    Student.pass = 50
    val stu = Student("Hank",77,73)
    stu.print()
    /*println(stu.highest())
    println(stu.getAverage())
    print(stu.grading())*/
    val gstu = GraduateStudent("tommy",60,60,70)
    gstu.print()

}
class GraduateStudent(name: String?, english: Int, math: Int, var thesis: Int ):Student(name, english, math) {
    companion object {
        var pass = 60 //設定GraduateStudent的及格成績為60
    }

    override fun print() {
        print("$name\t$english\t$math\t$thesis\t${passOrFailed()}")
    }

    override fun passOrFailed() = if (getAverage()>= pass) "pass" else "failed"

}

open class Student (var name:String?, var english: Int, var math: Int) {
    companion object{
        @JvmStatic
        var pass = 70
        fun test(){
            print("testing")
        }

    }
    open fun print() {
        println("$name\t$english\t$math\t${passOrFailed()}\t${highest()}\t${getAverage()}\t${grading()}\t")
    }

    open fun passOrFailed() = if (getAverage()>= pass) "pass" else "failed"

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
    }

    /* 完整版:
    fun highest(): Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        return max
    }*/
    fun getAverage()=(english+math)/2
    //完整版
    // fun getAverage(): Int{
    //    return (english+math)/2
    //}
    fun grading()=when(getAverage()) {
        in 90..100->'A'
        in 80..89->'B'
        in 70..79->'C'
        in 60..69->'D'
        else ->'F'
    }

    // 完整版
    // fun grading(): Char{
    //        var garding= when(getAverage()){
    //            in 90..100->'A'
    //            in 80..89->'B'
    //            in 70..79->'C'
    //            in 60..69->'D'
    //            else ->'F'
    //        }
    //        return garding

}
