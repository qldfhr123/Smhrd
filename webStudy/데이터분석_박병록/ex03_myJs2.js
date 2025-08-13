let mar = document.getElementById("mar");
let rad = document.getElementById("rad");



let box1 = document.getElementById("box1");
let box2 = document.getElementById("box2");
let box3 = document.getElementById("box3");
let box4 = document.getElementById("box4");



mar.addEventListener("click",function() {
    
    box2.style.marginLeft = "100px";
    box3.style.marginLeft =  "200px";
    box4.style.marginLeft =  "300px";
})

rad.addEventListener("click", function() {
    box1.style.borderTopRightRadius = "50%";
    box1.style.borderBottomLeftRadius= "50%";

    box2.style.marginLeft =  "100px";
    box2.style.borderTopRightRadius = "50%";
    box2.style.borderBottomLeftRadius= "50%";
    
    box3.style.marginLeft =  "200px";
    box3.style.borderTopRightRadius = "50%";
    box3.style.borderBottomLeftRadius= "50%";
    
    box4.style.marginLeft =  "300px";
    box4.style.borderTopRightRadius = "50%";
    box4.style.borderBottomLeftRadius= "50%";
    
})
