package org.example

class StudentManager{
    private val students = mutableListOf<Student>()
    fun addStudent(student: Student){
        students.add(student)
        println("Student added successfully!")
    }
    fun viewStudents(){
        if(students.isEmpty()){
            println("student not found")
            return
        }
        println("\n--------Student List---------")
        for(student in students){
            println(student)
        }
    }
    fun searchStudents(id: Int){
        val student = students.find { it.id == id }
        if(student != null){
            println("Student found")
            println(student)
        }
        else{
            println("Student not found")
        }
    }
}