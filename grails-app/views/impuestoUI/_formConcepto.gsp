<g:form name="myForm" on404="alert('no encontrado!')"
              url="[action:'guardarConcepto']">

    <g:if test="${unConcepto!= null}">
      <g:field type="hidden" name="id" value="${unConcepto.id}"/>
	</g:if>
	
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3 id="myModalLabel">Concepto</h3>
	</div>

	<div class="modal-body">

			<div id="ajaxMessage">Por favor diligenciar el formulario:</div>

			<div class="form-group">
				<label for="orderCons">Descripción</label>
				<g:field type="text" name="descripcion" id="descripcion" value="${unConcepto?.descripcion}" required="" size="60"/>
			</div>
			<div class="form-group">
				<label for="status">Afectación</label>
				<select name="afectacion" id="afectacion">
					<option value="S" selected="">Suma</option>
					<option value="R" ${unConcepto != null && unConcepto.afectacion == "R" ? "selected=''" : "" }>Resta</option>
				</select>
			</div>			
			<div class="form-group">
				<label for="status">Estado</label>
				<select name="estado" id="estado">
					<option value="A" selected="">Activo</option>
					<option value="I" ${unConcepto != null && unConcepto.estado == "I" ? "selected=''" : "" }>Inactivo</option>
				</select>
			</div>
	</div>
	<div class="modal-footer"> 
		  <button type="button" class="btn btn-primary" onclick="guardarForma(this); return false;">Guardar</button>
		  <button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
	</div>

</g:form>
