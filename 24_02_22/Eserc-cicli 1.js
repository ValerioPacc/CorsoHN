/*
 function cont(x,n){
    if(n>x.lenght){
    alert("il numero  troppo lungo") 
    return x;
    }
     var j=""
     for(var i=0;i<n.length;i++);{
        j+=x[i];
    
    }
    return j;
}

console.log(cont("valerio",4));
*/
// sostituisci_carattere(s, c1, c2);
//dati in input una stringa s ,
//crei e restituisca in out una stringa
//contente tutti i caratteri
//di s1 nella quale il carattere
//c1 deve essere sostiuito dal carattere c2.



function sostituisci_carattere(s,c1,c2){
    var k ="";
    for(var i=0 ; i<s.length ;i++){
    
        if (s[i]!= c1){
     
         k+=s[i];
                   
        }
        else{k+=c2;}
        
    }
            
     
     return k;
}

sostituisci_carattere("ciao","a","m");
var h=sostituisci_carattere("ciao","a","m");
console.log(h)





