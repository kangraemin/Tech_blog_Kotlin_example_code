package playground.abstraction.useinterface

class Teacher {
    fun makeStudentToClean(student: CleaningCrew) {
        println("Hey ! ${student.name}!")
        student.startCleanUp()
    }
}