package impuestos

class Propietario {

	String	documento
	String	nombre
	String	apellidos
	String 	correoe
	Date    fechaNacimiento
    Date   	dateCreated
    Date   	lastUpdated	

    static transients = ['fechaNacFormat']

    def getFechaNacFormat() {
    	return fechaNacimiento.format("dd/MM/yyyy")
    }

    static constraints = {
    }
}
