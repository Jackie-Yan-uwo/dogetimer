package dogetimer

abstract class UserContent {
    Date dateCreated
    Date dateLastEdited

    UserContent() {
        dateCreated = new Date()
        dateLastEdited = new Date()
    }

    static belongsTo = [ownerProfile: UserProfile]

    static constraints = {
    }
}
