package org.example

class Student(val name: String, var age: Int, var grade: String, var lastName: String) {

    val isAdult: Boolean
        get() = age >= 18

    fun updateGrade(newGrade: String) {
        grade = newGrade
        println("$name's is $grade")
    }

    fun incrementAge() {
        age++
    }

}

fun main() {
    val student = Student("p", 15, "3ro B", lastName = "Cerda")
    println("is ${student.name} - ${student.age} adult:${student.isAdult} ")

    student.incrementAge()
    student.incrementAge()
    student.incrementAge()


    saveStudent(student)

    println("is ${student.name} - ${student.age} adult:${student.isAdult} ")


}


//package testing
fun Student.validateStudent(value: String, fieldName: String) {

    fun validate(value: String, fieldName: String) {
        if (value.isEmpty() || value != fieldName ) {
            throw IllegalArgumentException("El estudiante es inválido -> ${fieldName}")
        }
    }

    validate(name, "name")
}

fun saveStudent(student: Student) {
    student.validateStudent(student.name, "name")
}

//fun saveStudent(student: Student) {
////    if (student.name != "" && student.age > 0 && student.grade != "") {
////        println("Guardando estudiante")
////    } else {
////        throw Exception("Estudiante inválido")
////    }
//
//    fun validateStudent(value: String, fieldName: String) {
//        if (value.isEmpty()) {
//            throw IllegalArgumentException("Can't save student: empty field $fieldName")
//        }
//
//    }
//
//    validateStudent(student.grade, fieldName = "grade")
//
//}