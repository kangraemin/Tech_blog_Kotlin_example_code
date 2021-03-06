package playground.abstraction.onlyclass

open class Student(val name: String)

class StudentForFloorCleaning(name: String) : Student(name) {
    fun cleanUpFloor() {
        println("$name : 바닥 쓸기 시작하겠습니다 !")
    }
}
class StudentForWindowCleaning(name: String) : Student(name) {
    fun cleanUpWindow() {
        println("$name : 창문 닦기 시작하겠습니다 !")
    }
}
class StudentForBlackboardCleaning(name: String) : Student(name) {
    fun cleanUpBlackboard() {
        println("$name : 칠판 닦기 시작하겠습니다 !")
    }
}
