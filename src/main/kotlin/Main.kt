package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val manager = StudentManager()
   while(true){
      println("\n----------student Management System---------")
      println("1. Add Student")
      println("2. View Students")
      println("3. Exit")
      println("Enter your choice: ")
      val choice = readLine()!!.toInt()
      when(choice){
         1 -> {
            print("Enter Student Id:")
            val id = readLine()!!.toInt()
            print("Enter Student Name:")
            val name = readLine()!!
            print("Enter Student Age:")
            val age = readLine()!!.toInt()
            print("Enter Student Course:")
            val course = readLine()!!
            val student = Student(id, name, age, course)
            manager.addStudent(student)
         }
         2 -> {
            manager.viewStudents()
         }
         3 -> {
            println("Thank you")
            break
         }
         else -> {
            println("Invalid Choice")
         }

      }
   }

}