<tr>
    <td>${it.descripcion}</td>
    <td>${it.nomAfectacion}</td>
    <td>${it.nombreEstado}</td>
    <td><button type="button" onclick="abrirForma('editarConcepto', ${it.id}); return false;">Editar</button></td>
    <td><button type="button" onclick="borrarRegistro('borrarConcepto', ${it.id}, '${it.descripcion}'); return false;">Borrar</button></td>
</tr>
