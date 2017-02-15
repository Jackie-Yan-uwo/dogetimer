package dogetimer

class AchievementList {

    static hasMany = [achievements: Achievement]
    static belongsTo = [profile: UserProfile]

    static constraints = {
    }

}
