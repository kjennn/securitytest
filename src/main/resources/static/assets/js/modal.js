 $("button[name=searchInput]").click(function(){
    var clickedId =  $(this).attr('id');
    var newModalTitle = $(this).attr('value');
    $('#searchModal .modal-header h5').text(newModalTitle + " "+ "조회");
    $('#searchModal').modal("show");

    // 통신
    $("#referenceList li").off().on("click",function(){
        var clickedElement =$(this).text();
        $("#"+clickedId+"form"+" input").attr("value", clickedElement);
        $('#searchModal').modal("hide");
    });
  });