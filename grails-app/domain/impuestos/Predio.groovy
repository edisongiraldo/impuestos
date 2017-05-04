package impuestos

class Predio {

	String 		ficha
	String		direccion
	Propietario	propietario
	int 		avaluo
	float 		tarifa
    Date   		dateCreated
    Date   		lastUpdated	

    static hasMany = [impuestos: Impuesto]

    static constraints = {
    	ficha unique: true
    }
}
