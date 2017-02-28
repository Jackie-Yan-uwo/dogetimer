package dogetimer

class UserProfile {

    // Grails can correctly 'guess' the association between 'this' and
    // the Profile called userProfile in the UserAccount class
    // i.e. it is correctly inferring the 1-to-1 relationship
    UserAccount ownerAccount

    static hasMany = [tasks : Task]


    static constraints = {
        tasks nullable: true

    }
}
