package child.domain.json

class BootStrap {

    def init = { servletContext ->
        Env env = new Env([name: "env1", title: "title1"]).save(failOnError:true)
        Env env2 = new Env([name: "env2", title: "title2"]).save(failOnError:true)
        Stream s1 = new Stream(name: "s1", feedgroup: "s2", envs: [env]).save(failOnError:true)
        Request r = new Request(release_label: "label1", stream: s1, envs: [env, env2]).save(failOnError:true)
    }
    def destroy = {
    }
}
