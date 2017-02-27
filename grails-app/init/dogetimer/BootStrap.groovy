package dogetimer

class BootStrap {

    def init = { servletContext ->
        def account = new UserAccount(username: "alex", password: "hi", email: "a@g.com", task: new Task(taskName: "first task")).save()
    }
    def destroy = {
    }
}
