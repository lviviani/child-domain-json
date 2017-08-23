package child.domain.json

class Stream {

    String name
    String feedgroup
//    String description
//    String swid
//    boolean powercentre = false
//    String latest_release
    static hasMany = [envs: Env]

    static constraints = {
        name blank:false, unique: true
    }
}
