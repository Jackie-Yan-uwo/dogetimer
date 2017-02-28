package dogetimer

import grails.rest.RestfulController

class TaskController extends RestfulController {

    static allowedMethods = [getTasks: 'GET', createTask: 'POST']
    static responseFormats = ['json', 'xml']

    TaskController() {
        super(UserAccount)
    }



    // @Secured['ROLE_USER']
    // Our first POST-enabled method
    // We just want to get the status text and save it to the profile.
    def getTasks(){

        // usename -> things we are getting from json they are sending us in a post method
        def uname = params.uname

        System.out.print(uname)

        // this searches the table for username == uname
        def account = UserAccount.find{userName == uname}

        if (account!=null) {
            response.status=200
            respond account.getProfile().tasks
        } else {
            response.status = 404
        }


    }

    def createTask() {
        //TODO create new Task for user here
    }

    def updateTask() {
        //TODO Update task here
    }

    def deleteTask() {
        //TODO delete task here
    }

    def index() {

    }

}
