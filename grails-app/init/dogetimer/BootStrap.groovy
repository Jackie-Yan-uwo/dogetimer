package dogetimer

class BootStrap {

    def init = { servletContext ->
        if (UserAccount.count==0) {
            createSaveAccount("Robert", "a@g.com", "password", "Task1")
        }
    }
    def destroy = {
    }

    def createSaveAccount(name, inEmail, password, inTaskName){

        def account = new UserAccount(userName: name, password: password, email: inEmail)
        def profile = new UserProfile(ownerAccount: account).save(failOnError:true)
        new Task(taskName: "celebration", ownerProfile: profile).save(failOnError:true)

    }
}
