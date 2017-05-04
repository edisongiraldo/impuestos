package impuestos

class ImpuestoUIController {

	def ImpuestoCRUDService

    def index() { }

    /* Controladores de CRUD para Conceptos */
    def listConcepto(){
    	def listConcepto = ImpuestoCRUDService.listaConcepto
    	return [list: listConcepto]
    }

    def nuevoConcepto(){
    	render (template: "formConcepto")
    }

    def editarConcepto(){
        def concepto = ImpuestoCRUDService.getConcepto(params)
        render (template: "formConcepto", model: [unConcepto: concepto])
    }

    def guardarConcepto(){
    	ImpuestoCRUDService.guardarConcepto(params)
       	render "Concepto Guardado"
    }

    def borrarConcepto(){
        ImpuestoCRUDService.borrarConcepto(params)
        render "Concepto borrado"
    }


    /* Controladores de CRUD para Propietarios */
    def listPropietario(){
        def list = ImpuestoCRUDService.listaPropietario
        return [list: list]
    }

    def nuevoPropietario(){
        render (template: "formPropietario")
    }

    def editarPropietario(){
        def registro = ImpuestoCRUDService.getPropietario(params)
        render (template: "formPropietario", model: [unRegistro: registro])
    }

    def guardarPropietario(){
        ImpuestoCRUDService.guardarPropietario(params)
        render "Propietario Guardado"
    }

    def borrarPropietario(){
        ImpuestoCRUDService.borrarPropietario(params)
        render "Propietario borrado"
    }
}
