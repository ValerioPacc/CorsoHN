var req = "192.168.2.32:4000/setUserData";
function Testpass() {
    if (modulo.password.value == "") {
      alert("inserire password")
      modulo.password.focus()
      return false;  
    }
    if(modulo.password.value != modulo.Cpassword.value){
    alert("la password non concide")
    modulo.password.select()
    return false;
    }
    return true;
} 




function PromiseConfermaPsw(method,url){
    var password=document.getElementById("password").value;
    var Cpassword=document.getElementById("conferma password").value;
    var modulo=document.getElementsByTagName("modulo");
    var data ={
        password: password,
        confermapassword: confermapassword,
        modulo:modulo,

    }
    console.log(email, password, nome, cognome, eta, sesso, regione);
    
return new Promise ((resolve,reject) => {
let xhr = new XMLHttpRequest;

xhr.open(method,url);
xhr.setRequestHeader("Content-Type", "application/json");
xhr.responseType = "json";
xhr.send(JSON.stringify(data));
xhr.onload = () =>{
    if (xhr.status>=201){
        document.getElementById("demo").innerHTML = "Ricerca Avvenuta";
        console.log("");
         resolve(xhr.response);
    }   
        if (xhr.status>=200){
            document.getElementById("demo").innerHTML = "password errata";
            rejected(xhr.response);
        console.log(" valore non esattamente corretto");
    
    }

}
});
}
PromiseConfermaPsw("POST","http://192.168.2.32:4000/setUserData");

var req1 = "192.168.2.32:4000/getUserData";
function ConfermaEmailPsw(method,url){
    var email=document.getElementById("email").value;
    var password=document.getElementById("password").value;
    

    var data ={
        email: email,
        password:password
       

    }
return new Promise ((resolve,reject) => {
let xhr = new XMLHttpRequest;

xhr.open(method,url);
xhr.setRequestHeader("Content-Type", "application/json");
xhr.responseType ="json";
xhr.send(JSON.stringify(data));
xhr.onload = () =>{
    if(xhr.status>=200){
        console.log("");
         resolve(xhr.response);
    }   
        if (xhr.status>=403){
            rejected(xhr.response);
        console.log(" Accesso non consentito ");
        }
        else {(xhr.status>=404)
            rejected(xhr.response);
            console.log(" Not Found ");
            
        }
    
    }


});
}
ConfermaEmailPsw("POST","http://192.168.2.32:4000/getUserData");


var req2 = "192.168.2.32:4000/updateUserData";
function PromiseUpdate(method,url){
    var email=document.getElementById("email").value;
    var password=document.getElementById("password").value;
    var Cpassword=document.getElementById("conferma password").value;
    var nome=document.getElementById("nome").value;
    var cognome=document.getElementById("cognome").value;
    var eta=document.getElementById("eta").value;
    var sesso=document.getElementById("sesso").value;
    var regione=document.getElementById("regione").value;

    var data ={
        email:email,
        password: password,
        confermapassword: confermapassword,
        nome:nome,
        cognome:cognome,
        eta:eta,
        sesso:sesso,
        regione:regione,
       

    }

return new Promise ((resolve,reject) => {
let xhr = new XMLHttpRequest;

xhr.open(method,url);
xhr.setRequestHeader("Content-Type", "application/json");
xhr.responseType = "json";
xhr.send(JSON.stringify(data));
xhr.onload = () =>{
    if(xhr.status>=200){
        console.log("");
         resolve(xhr.response);
    }   
        if (xhr.status>=403){
            rejected(xhr.response);
        console.log(" Accesso non consentito ");
        }
        else {(xhr.status>=404)
            rejected(xhr.response);
            console.log(" Not Found ");
            
        }
    
    
}
});
}
PromiseConfermaPsw("POST","http://192.168.2.32:4000/updateUserData");


   