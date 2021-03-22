package playground.abstraction.onlyclass

class Teacher {
    fun sayStudentName(student: Student) {
        print("Hey ! ${student.name}! ")
    }

    fun makeStudentToClean(student: Student) {
        when (student) {
            is StudentForFloorCleaning -> {
                println("바닥을 쓸거라")
            }
            is StudentForWindowCleaning -> {
                println("창문을 닦거라")
            }
            is StudentForBlackboardCleaning -> {
                println("칠판을 닦거라")
            }
        }
    }
}