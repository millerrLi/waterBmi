package gov.water.lib

fun main(){
    var p = Person()
    p.height = 1.71f
    p.weight = 65f
    println("你的BMI是： ${p.getBmi()}")
}

class Person {
    var weight: Float = 0f
    var height: Float = 0f

    fun sayHello(){
        println("哈囉，你好！")
    }

    fun getBmi(): Float{
        val bmi = weight / (height * height)
        return bmi
    }

}