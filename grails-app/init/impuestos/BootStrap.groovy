package impuestos
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->

        if(Environment.current == Environment.DEVELOPMENT) {

        	//Conceptos
			def fConcepto = new Concepto(	
								descripcion: "Predial",
								afectacion: "S", 
        						estado: "A" 
        					)
        					.save()

				fConcepto = new Concepto(	
								descripcion: "Sobretasa ambiental",
								afectacion: "S", 
        						estado: "A" 
        					)
        					.save()

				fConcepto = new Concepto(	
								descripcion: "Nota Crédito Predial",
								afectacion: "R", 
        						estado: "I" 
        					)
        					.save()

        	// Propietario
			def fPropietario = new Propietario(	
												documento: "10130756",
												nombre: "Wilson",
												apellidos: "Cortés Álvarez",
												correoe: "wcortes@ccc.com",
												fechaNacimiento: Date.parse( 'yyyy/MM/dd', '1930/01/01')
				        					)
				        					.save()


        	// Predio
			def fPredio = new Predio(	
								ficha: "01010101",
								direccion: "Cra 18 20 20", 
        						propietario: fPropietario,
        						avaluo: 50000000,
        						tarifa: 7
        					)
        					.save()

			// Propietario
				fPropietario = new Propietario(	
												documento: "80850811",
												nombre: "Edison",
												apellidos: "Ordoñez Giraldo",
												correoe: "edison@ccc.com",
												fechaNacimiento: Date.parse( 'yyyy/MM/dd', '1984/07/30')
				        					)
				        					.save()

        	// Predio
				fPredio = new Predio(	
								ficha: "02020202",
								direccion: "Cra 78 300 300", 
        						propietario: fPropietario,
        						avaluo: 120000000,
        						tarifa: 12.5
        					)
        					.save()
        }
    }

    def destroy = {
    }
}
