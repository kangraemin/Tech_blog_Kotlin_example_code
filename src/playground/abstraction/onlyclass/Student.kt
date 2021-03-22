package playground.abstraction.onlyclass

open class Student(val name: String)

class StudentForFloorCleaning(name: String) : Student(name)
class StudentForWindowCleaning(name: String) : Student(name)
class StudentForBlackboardCleaning(name: String) : Student(name)
