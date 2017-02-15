package dogetimer

class UserProfile {

    String displayName = "" // display name defaults to username
    String rank // will have ranks that one progresses through (ex. unrepentant slacker)
    int userExp = 0 // exp total
    int gold = 0 // gold total

    // cardinality
    static belongsTo = [account: UserAccount]

    static constraints = {
        // uniqueness constraints
        rank unique: true
        account unique: true

        // null constraints
        displayName nullable: false // can't have empty display name

        // mins
        userExp min: 0 as int
        gold min: 0 as int
    }

}
