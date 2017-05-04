<html>
<head>
    <meta name="layout" content="main">
    <asset:javascript src="application.js"/>    
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="appCRUD.js"/>    
</head>

<body >
    <h1 class="title">Lista de propietarios</h1>
    <table border="1">
        <tr>
            <th>Documento</th>
            <th>Nombre(s)</th>
            <th>Apellidos</th>
            <th>Correo electrónico</th>
            <th>Fecha de nacimiento</th>
            <th colspan="2" align="center"><button type="button" onclick="abrirForma('nuevoPropietario', null); return false;">Crear</button></th>
        </tr>
        <tbody>
            <g:render template="rowPropietario" collection="${list}" />
        </tbody>
    </table>

    <!-- Modal -->
    <div id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content"></div>
        </div>
    </div>

</body>
</html>