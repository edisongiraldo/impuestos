 <g:form name="myForm" on404="alert('no encontrado!')"
              url="[action:'guardarPropietario']">

    <g:if test="${unRegistro!= null}">
      <g:field type="hidden" name="id" value="${unRegistro.id}"/>
	</g:if>
	
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
		<h3 id="myModalLabel">Propietario</h3>
	</div>

	<div class="modal-body">

			<div id="ajaxMessage">Por favor diligenciar el formulario:</div>

			<div class="form-group">
				<label for="orderCons">Documento</label>
				<g:field type="number" name="documento" id="documento" value="${unRegistro?.documento}" required="" size="60"/>
			</div>
			<div class="form-group">
				<label for="orderCons">Nombre(s) / Razón Social</label>
				<g:field type="text" name="nombre" id="nombre" value="${unRegistro?.nombre}" required="" size="60"/>
			</div>
			<div class="form-group">
				<label for="orderCons">Apellidos</label>
				<g:field type="text" name="apellidos" id="apellidos" value="${unRegistro?.apellidos}" size="60"/>
			</div>
			<div class="form-group">
				<label for="status">Correo electrónico</label>
				<g:field type="email" name="correoe" id="correoe" value="${unRegistro?.correoe}" size="60"/>
			</div>			
			<div class="form-group">
				<label for="status">Fecha de nacimiento</label>
				<g:field type="date" name="fechaNacimiento" id="fechaNacimiento" value="${unRegistro?.fechaNacimiento?.format("yyyy-MM-dd")}" size="60"/>
			</div>			
	</div>
	<div class="modal-footer"> 
		  <button type="button" class="btn btn-primary" onclick="guardarForma(this); return false;">Guardar</button>
		  <button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
	</div>

</g:form>
