<tr>
    <td>${it.documento}</td>
    <td>${it.nombre}</td>
    <td>${it.apellidos}</td>
    <td>${it.correoe}</td>
    <td>${it.fechaNacFormat}</td>
    <td><button type="button" onclick="abrirForma('editarPropietario', ${it.id}); return false;">Editar</button></td>
    <td><button type="button" onclick="borrarRegistro('borrarPropietario', ${it.id}, '${it.nombre + " " + it.apellidos}'); return false;">Borrar</button></td>
</tr>
