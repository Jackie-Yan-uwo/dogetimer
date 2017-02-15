package dogetimer

class TaskList {

    // cardinality
    static hasMany = [tasks: Task]
    static hasOne = [timer: Timer]
    static belongsTo = [profile: UserProfile]

    static constraints = {
        // leave empty for now
    }

}
