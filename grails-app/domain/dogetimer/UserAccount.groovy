package dogetimer

class UserAccount {

    // instance variables
    String email
    String userName
    String password

    // hasOne property should be on the owning object
    // e.g. UserAccount owns the Profile
    static hasOne = [userProfile : UserProfile]

    def getProfile(){
        return userProfile
    }

    static constraints = {
        userProfile nullable: true // Allows a UserAccount to be created without a Profile
        userProfile unique: true // Ensures that UserAccounts must be associated with unique Profiles
    }
}
