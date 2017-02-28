package dogetimer

class UrlMappings {

    static mappings = {
        // task controller test

        // Handles routes according to the structure. $action = method
        // Controller Name Corresponds to whatever comes before Controller (ie. TasksController = /api/tasks

        "/api/$controller/$action"{

            constraints {
                // apply constraints here
            }
        }


//        "/api/tasks/getTask" (controller: "Task", action: "getTasks", method: "GET")
//        "/api/signup" (controller: "AccountCreation", action: "createAccount", method: "POST")
//        "/api/accounts/getUser" (controller: "Accounts", action: "getUser", method: "GET")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
