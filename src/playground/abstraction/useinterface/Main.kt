package playground.abstraction.useinterface

fun main() {
    // 선생님 생성
    val teacher = Teacher()

    // 학생 collection 생성
    val cleaningCrewCollection = mutableListOf<CleaningCrew>()

    for (number in 1..5) {
        // 바닥 쓸기 학생 생성
        cleaningCrewCollection.add(StudentForFloorCleaning("바닥 쓸기 학생 $number"))
        // 창문 닦이 학생 생성
        cleaningCrewCollection.add(StudentForWindowCleaning("창문 닦이 학생 $number"))
        // 칠판 닦이 학생 생성
        cleaningCrewCollection.add(StudentForBlackboardCleaning("칠판 닦이 학생 $number"))
    }

    // 학생 청소
    cleaningCrewCollection.forEach {
        teacher.makeStudentToClean(it)
    }
}