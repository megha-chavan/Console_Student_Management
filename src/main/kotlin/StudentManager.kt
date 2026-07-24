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
    fun updateStudent(id: Int, name: String, age: Int, course: String){
        val student = students.find { it.id == id }
        if(student != null){
            student.name = name
            student.age = age
            student.course = course
            println("Student updated successfully!")
        }
        else{
            println("Student not found")
        }
    }
    fun deleteStudent(id: Int){
        val student = students.find { it.id == id }
        if(student != null){
            students.remove(student)
            println("Student deleted successfully!")
        }
        else{
            println("Student not found")
        }
    }
    fun searchStudent(id: Int){
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