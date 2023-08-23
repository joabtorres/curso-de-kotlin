fun main() {
    val teacher = Teacher("Ricardo Lopes", "Rua b, nº 222", 40)
    val student = Student("Joab Torres", "Rua C, nº 222", 22)

    println(teacher.description())
    println(student.description())
}

open class Person(var name: String, var address: String, var age: Int) {
    fun description(): String {
        return "Olá, meu nome é $name, resido no endereço $address, tenho $age anos"
    }
}

class Teacher(name:String, address: String, age: Int): Person(name, address, age)

class Student (name: String, address: String, age:Int):Person(name, address, age)