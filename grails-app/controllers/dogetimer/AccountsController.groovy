package dogetimer

import grails.rest.RestfulController

class AccountsController extends RestfulController {

    static allowedMethods = [getTasks: 'GET', createTask: 'POST']
    static responseFormats = ['json', 'xml']

    AccountsController() {
        super(UserAccount)
    }

    def index() { }

    def getUser() {
        // usename -> things we are getting from json they are sending us in a post method
        def uname = params.uname;

        System.out.print(uname)

        // this searches the table for username == uname
        def account = UserAccount.find{userName == uname}

        if (account!=null) {
            response.status=200
            respond account
        } else {
            response.status = 404
        }

    }

    // http://docs.grails.org/latest/guide/GORM.html
}
