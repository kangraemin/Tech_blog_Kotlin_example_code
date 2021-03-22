package playground.abstraction.onlyclass

class Teacher {
    fun makeStudentToClean(student: Student) {
        print("Hey ! ${student.name}! ")
        when (student) {
            is StudentForFloorCleaning -> {
                student.cleanUpFloor()
            }
            is StudentForWindowCleaning -> {
                student.cleanUpWindow()
            }
            is StudentForBlackboardCleaning -> {
                student.cleanUpBlackboard()
            }
        }
    }
}