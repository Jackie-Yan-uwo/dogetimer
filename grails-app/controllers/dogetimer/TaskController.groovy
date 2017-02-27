package dogetimer

import grails.converters.JSON
import grails.rest.RestfulController

class TaskController extends RestfulController {

    static allowedMethods = [getTask: 'GET']
    static responseFormats = ['json', 'xml']

    TaskController() {
        super(UserAccount)
    }

    def index() {

    }

    // @Secured['ROLE_USER']
    // Our first POST-enabled method
    // We just want to get the status text and save it to the profile.
    def getTask(){

        // usename -> things we are getting from json they are sending us in a post method
        def uname = params.uname

        System.out.print(uname)

        // this searches the table for username == uname
        def account = UserAccount.find{username == uname}

//        def task = account.getTask()

        respond account

//
//        def response = [:]
//        resp['userName'] = uname
//        resp['taskName'] = task
//        render response as JSON

    }

}
