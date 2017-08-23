package child.domain.json

class Request {

        Date date_created = new Date()
        Date date_completed
        String status = "init"
        String release_label
        Stream stream
        static hasMany = [envs: Env]

        static constraints = {
            date_completed nullable: true
        }
        static searchable = {
            only = [ 'stream', 'status' ]
        }
    }
