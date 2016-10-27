package defaultxss

class SimpleController {

    def index() {
        throw new Exception('hi')
    }
}
