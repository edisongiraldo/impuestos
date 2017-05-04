// Librería encargada del CRUD de la aplicación
function abrirForma(pURL, pID){
    $.ajax({
            type: "GET",
            url: pURL,
            datatype: "html",
            data: {
                id:pID
            }
    }).success(function(data) {
        $('.modal-content').html(data);
        $('#myModal').modal('show');
    });
}

function guardarForma(pButton){
    var miForm = $(pButton).parents("form");
    var oData = new FormData(miForm);
    var url=miForm.attr("action");
    console.log("action "+url);
    console.log("parametros "+$(miForm).serialize());
    $.ajax({
         url:url,
         type:'GET',
         data:$(miForm).serialize(),
         processData: false,  // tell jQuery not to process the data
         contentType: false ,
         success:function (req) {
               alert(req);
               location.href = location.href.replace("#", "");
         },
         error:function (err){
            alert("Error: "+err);
         }
     });
}

function borrarRegistro(pURL, pID, pMsg){
    var ok = confirm("Desea borrar el registro: '"+pMsg+"'? ");
    if (ok){
        $.ajax({
             url:pURL,
             type:'GET',
             data: {
                id: pID
             },
             success:function (req) {
                   alert(req);
                   location.href = location.href.replace("#", "");
             },
             error:function (err){
                alert("Error: "+err);
             }
         });
    }
}
