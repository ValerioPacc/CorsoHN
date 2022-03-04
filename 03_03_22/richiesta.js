let req ="http://192.168.2.32:4000/test"

/*function promiseGetData(method,url) {
    return new Promise((resolve, reject) => {
        let xhr = new XMLHttpRequest();
        xhr.open(method,url);
        xhr.send();
        xhr.onload = () => {
            resolve(console.log(xhr.response));

        }
    });
    
}

promiseGetData("GET","http://192.168.2.32:4000/test");
promiseGetData("POST","http://192.168.2.32:4000/test");
console.log("bella")*/

function invioData(method,url){

    var email=document.getElementById("email").value;
    var numero=document.getElementById("numero").value;
    var indirizzo=document.getElementById("indirizzo").value;
    var nome=document.getElementById("nome").value;
    var cognome=document.getElementById("cognome").value;

    var data ={
        email: email,
        numero: numero,
        nome: nome,
        cognome: cognome,
        indirizzo: indirizzo

    }
return new Promise ((resolve,reject) => {
let xhr = new XMLHttpRequest;

xhr.open(method,url);
xhr.setRequestHeader("Content-Type", "application/json");
xhr.responseType = "json";
xhr.send(JSON.stringify(data));
xhr.onload = () =>{
    if(xhr.status>=400){
        console.log("mannaggia la T");
         rejected(xhr.rejected);
    }   
        else {
            resolve(xhr.response);
        console.log("meglio mori");
    
    }

}
});
}
