package playground.abstraction.onlyclass

class Teacher {
    fun sayStudentName(student: Student) {
        println("Hey ! ${student.name}!")
    }

    fun makeStudentToClean(student: Student) {
        when (student) {
            is StudentForFloorCleaning -> {
                println("바닥 쓸기")
            }
            is StudentForWindowCleaning -> {
                println("창문 닦기")
            }
            is StudentForBlackboardCleaning -> {
                println("칠판 닦기")
            }
        }
    }
}