//che dato in ingresso un vettore v
//di dimensioni dim, modifichi v scalando le sue componenti
//di un fattore d
//si ricorda che scalare un vettore di un fattore d significa
//tutte le sue componenti per il valore d
// scalavettore(v,d) let v = [1,2,3,4,5,6,7,8,9]

function scalavettore(v,d){
    for (var i=0;i<v.length;i++){
      v[i] = v[i]*d; 
        
    }
    return v;
}
    let v =[1,2,3,4,5,6,7,8,9];
    console.log(scalavettore(v,2));