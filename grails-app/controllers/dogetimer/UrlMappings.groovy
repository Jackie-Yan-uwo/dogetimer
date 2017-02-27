package dogetimer

class UrlMappings {

    static mappings = {
        // task controller test
        "/api/task"(controller: "task", action: "getTask", method: "GET")
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
