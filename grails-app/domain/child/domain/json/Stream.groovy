package child.domain.json

class Stream {

    String name
    String feedgroup
    static hasMany = [envs: Env]

    static constraints = {
        name blank:false, unique: true
    }
}
