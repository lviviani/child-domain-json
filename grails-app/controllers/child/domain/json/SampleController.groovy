package child.domain.json

import grails.converters.JSON

class SampleController {

    def index() {
        render new JSON([request: Request.get(1)])
    }
}
