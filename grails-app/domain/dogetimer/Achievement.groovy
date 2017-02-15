package dogetimer

class Achievement {

    // instance variables
    String achievementName // name
    int type // class of achievement
    String description = "" // description of requirements
    URL icon // url for achievement icon

    // cardinality
    static hasOne = [achievementList: AchievementList]

    // constraints
    static constraints = {
        // null constraints
        achievementName nullable: false
        icon nullable: false
        type nullable: false

        // range constraints
        type min: 1 // type values will start at 1
    }
}
