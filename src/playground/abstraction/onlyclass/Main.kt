package playground.abstraction.onlyclass

fun main() {
    // 선생님 생성
    val teacher = Teacher()

    // 학생 collection 생성
    val floorStudents = mutableListOf<StudentForFloorCleaning>()
    val windowStudents = mutableListOf<StudentForWindowCleaning>()
    val blackboardStudents = mutableListOf<StudentForBlackboardCleaning>()

    for (number in 1..5) {
        // 바닥 쓸기 학생 생성
        floorStudents.add(StudentForFloorCleaning("바닥 쓸기 학생 $number"))
        // 창문 닦이 학생 생성
        windowStudents.add(StudentForWindowCleaning("창문 닦이 학생 $number"))
        // 칠판 닦이 학생 생성
        blackboardStudents.add(StudentForBlackboardCleaning("칠판 닦이 학생 $number"))
    }

    // 바닥 쓸기 학생 청소
    floorStudents.forEach {
        teacher.sayStudentName(it)
        teacher.makeStudentToClean(it)
    }

    // 창문 닦이 학생 청소
    windowStudents.forEach {
        teacher.sayStudentName(it)
        teacher.makeStudentToClean(it)
    }

    // 칠판 닦이 학생 청소
    blackboardStudents.forEach {
        teacher.sayStudentName(it)
        teacher.makeStudentToClean(it)
    }
}