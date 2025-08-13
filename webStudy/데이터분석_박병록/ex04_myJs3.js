let count_area = document.getElementById("count_area");

let like = document.getElementById("like");
let dislike = document.getElementById("dislike");
let reset = document.getElementById("reset");

let count = 0;

like.addEventListener("click", function () {
    count += 1;
    count_area.innerHTML = "Like! ♥️" +count; 
})

dislike.addEventListener("click", function () {
    if (count > 0) {
        count -= 1;
        count_area.innerHTML = "Like! ♥️" +count;
    }
})

reset.addEventListener("click", function () {
    count = 0;
    count_area.innerHTML = "Like! ♥️" +count;
})
