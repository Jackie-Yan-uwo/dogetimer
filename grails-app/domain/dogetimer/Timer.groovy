package dogetimer

class Timer {

    int sessionDuration = 25 // duration of a work session in minutes
    int breakDuration = 5 // duration of a break in minutes
    String focus = "" // user entered focus for a session, initializes to empty string
    double remainingTime = sessionDuration as double // time remaining on clock (initialized to duration)

    // cardinality
    static belongsTo = [taskList: TaskList]

    static constraints = {
        // range constraints
        sessionDuration min: 5 // min is 5 mins
        sessionDuration max: 60 // max is 60 mins
        breakDuration min: 0 // min is no break
        breakDuration max: 0 // max is session duration
    }

}
