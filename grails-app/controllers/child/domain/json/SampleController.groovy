package child.domain.json

import grails.converters.JSON

class SampleController {

    def index() {

        println "got some"

        println new JSON([request: Request.get(1)])

        render new JSON([request: Request.get(1)])

    }
}
