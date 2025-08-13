
function clear_view() {
    guguda_show.innerText = "";
}





let dan = document.getElementById("dan");
let guguda_show = document.getElementById("guguda_show");
let title = document.getElementById("title");



let for_e = document.getElementById("for");
for_e.addEventListener("click", function for_d() {
    clear_view()
    title.innerHTML ="for을 이용한구구단 만들기"
    for (let i = 1; i <= 9; i++) {
        var show = dan.value + "X" + i + "=" + (dan.value * i)+"<br>";
        guguda_show.innerHTML += show;
    }

})

let while_e = document.getElementById("while");
while_e.addEventListener("click", function whlie_d(data) {
    clear_view()
    let cnt = 1;
    title.innerHTML ="while을 이용한구구단 만들기"
    while (cnt <=9) {
        var show = dan.value + "X" + cnt + "=" + (dan.value * cnt)+"<br>";
        cnt += 1;
        guguda_show.innerHTML += show;
    }
})