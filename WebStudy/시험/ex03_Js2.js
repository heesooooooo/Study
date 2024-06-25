


document.getElementById("plus").addEventListener("click", function(){
    let num = Number(document.getElementById("text").innerHTML.split("♥ ")[1])
    document.getElementById("text").innerHTML = "Like! ♥ "+ (num+1)

})


document.getElementById("minus").addEventListener("click", function(){
    let num = Number(document.getElementById("text").innerHTML.split("♥ ")[1])
    if(num>0){
        document.getElementById("text").innerHTML = "Like! ♥ "+ (num-1)
    }


})