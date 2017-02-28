package dogetimer

import grails.rest.RestfulController

class SignUpController extends RestfulController {


    SignUpController(){
        super(UserAccount)
    }

    static allowedMethods = [createAccount: 'POST']
    static responseFormats = ['json', 'xml']

    // Navigating to signup is default behaviour
    def index() {

    }

    // Our first POST-enabled method
    // We just want to get the status text and save it to the profile.
    def newUser() {
        def uname = params.uname
        System.out.print(uname)
        def account = UserAccount.find{userName == uname}
        if(account == null){
            account = new UserAccount(userName: uname, password: "2212")
            new UserProfile(ownerAccount: account).save()
            System.out.print('created')
            response.status = 200
            respond account
        }
        else{
            // Find a better response code...
            System.out.print('already there')
            response.status = 404
        }
    }

}
