package dogetimer

class Task extends UserContent {

    String taskName // name of task

    Task(){
       super()
    }

    // cardinality
//    static hasOne = [taskList: TaskList]
    static belongsTo = [ownerProfile: UserProfile]

    static constraints = {
        taskName(maxSize: 30)
    }

}
