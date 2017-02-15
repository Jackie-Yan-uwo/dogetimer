package dogetimer

class UserAccount {

    // instance variables
    String password
    String username
    String email
    URL avatar

    // cardinalities
    static hasOne = [profile: UserProfile]

    // constraints
    static constraints = {
        // uniqueness constraints
        username unique: true
        email unique: true
        profile unique: true

        // null constraints
        password nullable: false
        username nullable: false
        avatar nullable: true
        profile nullable: false
        email nullable: false
    }

}
