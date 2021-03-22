package playground.abstraction.useinterface

class StudentForFloorCleaning(studentName: String) : CleaningCrew {
    override val name: String = studentName
    override fun startCleanUp() {
        println("$name : 바닥 쓸기 시작하겠습니다 !")
    }
}

class StudentForWindowCleaning(studentName: String) : CleaningCrew {
    override val name: String = studentName
    override fun startCleanUp() {
        println("$name : 창문 닦기 시작하겠습니다 !")
    }
}

class StudentForBlackboardCleaning(studentName: String) : CleaningCrew {
    override val name: String = studentName
    override fun startCleanUp() {
        println("$name : 칠판 닦기 시작하겠습니다 !")
    }
}

