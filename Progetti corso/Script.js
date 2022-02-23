function cor(){
    var input=document.getElementsByTagName("input")
    var cognome=input[0];
    var nome=input[1];
    var sex={
        m:input[2],
        f:input[3]
    }
    var mat=input[4];
    var v= document.getElementsByTagName("option");
    if(cognome.value==""){
        alert("il campo cognome non puo essere vuoto");
            
    }
     if (nome.value==""){
        alert("noinonon");
        return;
    }

     function reg() {
        if(document.registr.regione.value=="nessuna") alert("selezionare una regione");
        return ;
    }
    function anno(){
        var anno =document.getElementsByTagName("anno").value;
        if(anno>=1 && anno<=5 || "FC" ) alert("rispettare range anno");
        return;
    }

}
