package impuestos

import grails.transaction.Transactional

@Transactional
class ImpuestoCRUDService {

    def serviceMethod() {

    }

    // Métodos para CRUD de Conceptos
    def getListaConcepto(){
    	return Concepto.list()
    }

    def getConcepto(datos){
    	return Concepto.get(datos.id)
    }

    def guardarConcepto(datos){
    	def concepto
    	if (datos.id != null && datos.id != ""){
    		concepto = Concepto.get(datos.id )
    	}else{
	    	concepto = new Concepto()
	    }
		concepto.descripcion = datos.descripcion
		concepto.afectacion = datos.afectacion
		concepto.estado = datos.estado
    	concepto.save(flush: true, failOnError: true)
        return concepto
    }

    def borrarConcepto(datos){
        def concepto = Concepto.get(datos.id)
        concepto.delete(flush: true, failOnError: true)
    }


    // Métodos para CRUD de Propietarios
    def getListaPropietario(){
        return Propietario.list()
    }

    def getPropietario(datos){
        return Propietario.get(datos.id)
    }

    def guardarPropietario(datos){
        def propietario
        if (datos.id != null && datos.id != ""){
            propietario = Propietario.get(datos.id )
        }else{
            propietario = new Propietario()
        }
        propietario.documento = datos.documento
        propietario.nombre = datos.nombre
        propietario.apellidos = datos.apellidos
        propietario.correoe = datos.correoe
        propietario.fechaNacimiento = Date.parse( 'yyyy-MM-dd', datos.fechaNacimiento)
        propietario.save(flush: true, failOnError: true)
    }

    def borrarPropietario(datos){
        def propietario = Propietario.get(datos.id)
        propietario.delete(flush: true, failOnError: true)
    }
}
