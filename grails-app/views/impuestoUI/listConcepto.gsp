<html>
<head>
    <meta name="layout" content="main">
    <asset:javascript src="application.js"/>    
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="appCRUD.js"/>    
</head>

<body >
    <h1 class="title">Lista de conceptos</h1>
    <table border="1">
        <tr>
            <th>Descripción</th>
            <th>Afectación</th>
            <th>Estado</th>
            <th colspan="2" align="center"><button type="button" onclick="abrirForma('nuevoConcepto', null); return false;">Crear</button></th>
        </tr>
        <tbody>
            <g:render template="rowConcepto" collection="${list}" />
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