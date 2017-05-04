package impuestos

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PredioController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Predio.list(params), model:[predioCount: Predio.count()]
    }

    def show(Predio predio) {
        respond predio
    }

    def create() {
        respond new Predio(params)
    }

    @Transactional
    def save(Predio predio) {
        if (predio == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (predio.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond predio.errors, view:'create'
            return
        }

        predio.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'predio.label', default: 'Predio'), predio.id])
                redirect predio
            }
            '*' { respond predio, [status: CREATED] }
        }
    }

    def edit(Predio predio) {
        respond predio
    }

    @Transactional
    def update(Predio predio) {
        if (predio == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (predio.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond predio.errors, view:'edit'
            return
        }

        predio.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'predio.label', default: 'Predio'), predio.id])
                redirect predio
            }
            '*'{ respond predio, [status: OK] }
        }
    }

    @Transactional
    def delete(Predio predio) {

        if (predio == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        predio.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'predio.label', default: 'Predio'), predio.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'predio.label', default: 'Predio'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
