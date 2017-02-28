package dogetimer

class UrlMappings {

    static mappings = {
        // task controller test

        "/api/tasks"(controller: "task", action: "getTasks", method: "GET")
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
