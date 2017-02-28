package dogetimer

import grails.rest.RestfulController

class TaskController extends RestfulController {

    static allowedMethods = [getTasks: 'GET']
    static responseFormats = ['json', 'xml']

    TaskController() {
        super(UserAccount)
    }

    def index() {

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

//        def task = account.getTasks()

        respond account.getProfile().tasks

//
//        def response = [:]
//        resp['userName'] = uname
//        resp['taskName'] = task
//        render response as JSON

    }

    def debug() {

    }

}
