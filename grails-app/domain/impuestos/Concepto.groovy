package impuestos

class Concepto {

	String		descripcion
	String		afectacion
	String		estado   
    Date   		dateCreated
    Date   		lastUpdated	

    static hasMany = [impuestos: Impuesto]

    static transients = ['nombreEstado', 'nomAfectacion']

    def getNombreEstado() {
    	
    	def name = ""

    	switch(this.estado) {
    	 	case "A":
    	 		name = "Activo"
    	 		break
    	 	case "I":
    	 		name = "Inactivo"
    	 		break
    	 	default:
    	 		name = "Valor no permitido"
    	 } 

    	 return name

    }

    def getNomAfectacion() {
    	
    	def name = ""

    	switch(this.afectacion) {
    	 	case "R":
    	 		name = "Resta"
    	 		break
    	 	case "S":
    	 		name = "Suma"
    	 		break
    	 	default:
    	 		name = "Valor no permitido"
    	 } 

    	 return name

    }

    static constraints = {
    	estado inList: ["A", "I"]
        descripcion nullable:false, blank: false
    }
}
