package defaultxss

class SimpleController {

    def index() {
        throw Exception('hi')
    }
}
