package dogetimer

class Task {

    String taskName // name of task
//    String description = "" // description of task
//    int totalTimeWorked = 0 // total time worked on task
//    int taskExp = 0 // task experience earned

    // cardinality
//    static hasOne = [taskList: TaskList]
    static belongsTo = [useraccount: UserAccount]

//    static constraints = {
//        // null constraints
//        taskName nullable: false
//
//        // range constraints
////        totalTimeWorked min: 0
////        taskExp min: 0
//    }

}
