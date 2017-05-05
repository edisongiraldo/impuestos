package impuestos

import grails.transaction.Transactional

import org.grails.cxf.utils.GrailsCxfEndpoint
import javax.jws.WebMethod
import javax.jws.WebResult
import javax.jws.WebParam

@Transactional
@GrailsCxfEndpoint
class WSImpuestosService {

    @WebMethod
    @WebResult(name = "listaConceptos", targetNamespace = "") 
    def listConcepto() {
    	return ImpuestoCRUDService.getListaConcepto()
    }

    @WebMethod
    @WebResult(name = "getConcepto", targetNamespace = "") 
    def Concepto getConcepto(
    	@WebParam(name = 'idConcepto') int idConcepto
    ){
    	def datos = [
    		id: idConcepto
    	]
    	return ImpuestoCRUDService.getConcepto(datos)
    }

    @WebMethod
    @WebResult(name = "nuevoConcepto", targetNamespace = "") 
    def Concepto nuevoConcepto(
    		@WebParam(name = 'descripcion') String descripcion,
    		@WebParam(name = 'afectacion') String afectacion,
    		@WebParam(name = 'estado') String estado
    ){
    	def datos = [
    		descripcion: descripcion,
    		afectacion: afectacion,
    		estado: estado
    	]
    	return ImpuestoCRUDService.guardarConcepto(datos)
    }

    @WebMethod
    @WebResult(name = "actualizaConcepto", targetNamespace = "") 
    def Concepto actualizaConcepto(
    		@WebParam(name = 'idConcepto') int idConcepto,
    		@WebParam(name = 'descripcion') String descripcion,
    		@WebParam(name = 'afectacion') String afectacion,
    		@WebParam(name = 'estado') String estado
    ){
    	def datos = [
    		id: idConcepto,
    		descripcion: descripcion,
    		afectacion: afectacion,
    		estado: estado
    	]
    	return ImpuestoCRUDService.guardarConcepto(datos)
    }

    @WebMethod
    @WebResult(name = "borrarConcepto", targetNamespace = "") 
    def borrarConcepto(
    		@WebParam(name = 'idConcepto') int idConcepto
    ){
    	def datos = [
    		id: idConcepto
    	]
    	
    	ImpuestoCRUDService.borrarConcepto(datos)

    	return true
    }

}
