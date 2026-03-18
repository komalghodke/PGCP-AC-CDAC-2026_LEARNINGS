export default function IsPalindrome(prop) {
    let p = ""+ prop.num;
    var len = p.length;
    for(var i=0; i<len; i++) {
        if(p[i]!=p[len-i-1]){
            return prop.num + " is Not a Palidrome Number!";
        }
        else
           return  prop.num + " is a Palidrome";
    }
}