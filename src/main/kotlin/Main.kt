package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val manager = StudentManager()
   while(true){
      println("\n----------student Management System---------")
      println("1. Add Student")
      println("2. View Student")
      println("3. Update Student")
      println("4. Delete Students")
      println("5. Search Students")
      println("6. Exit")
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
           print("Enter Student Id to update:")
            val id = readLine()!!.toInt()
            print("Enter Student Name:")
            val name = readLine()!!
            print("Enter Student Age:")
            val age = readLine()!!.toInt()
            print("Enter Student Course:")
            val course = readLine()!!
            manager.updateStudent(id, name, age, course)
         }
         4 -> {
            print("Enter Id to Delete:")
            val id = readLine()!!.toInt()
            manager.deleteStudent(id)
         }
         5 -> {
            print("Enter Student Id to Find:")
            val id = readLine()!!.toInt()
            manager.searchStudent(id)
         }
         6 -> {
            println("Thank You")
            break
         }
         else -> {
            println("Invalid Choice")
         }

      }
   }

}