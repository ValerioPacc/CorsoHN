/*function scalavettore(v,d) {
    for (i=0;i<v.length;i++){
    v[i]*=d;


    }
    return v;
}
let v=[1,2,3,4,5,6,7,8,9];
console.log(scalavettore(v,2));
*/
//iverti(s)
//che,data in input una stringa s
//restituisce in output la stringa s
//con i caratteri invertiti
 
function invertstr(s){
    var j="";

    for (var i=s.length-1;i>=0;i--){
    j+=s[i];  

      
    }
return j;
}
console.log(invertstr("roma"));

