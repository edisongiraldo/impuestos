package impuestos

import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType

@XmlAccessorType(XmlAccessType.NONE)
class Concepto {

    @XmlElement
	String		descripcion
    @XmlElement
	String		afectacion
    @XmlElement
	String		estado   
    Date   		dateCreated
    Date   		lastUpdated	

    static hasMany = [impuestos: Impuesto]

    static transients = ['nombreEstado', 'nomAfectacion']

    @XmlElement
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
