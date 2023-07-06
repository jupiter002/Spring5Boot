// agree
let agree1 = document.querySelector("#agree1");
let agree2 = document.querySelector("#agree2");
let okagree = document.querySelector("#okagree");
let noagree = document.querySelector("#noagree");

okagree?.addEventListener('click',()=> {
    if(!agree1.checked){
        alert("이용약관에 동의해주세요.")
    }
    else if(!agree2.checked){
        alert("개인정보 수집과 이용에 동의해주세요.")
    }
    else if(agree1.checked && agree2.checked){
        location.href = "/join/checkme"
    }
});
noagree?.addEventListener('click',()=> {
    location.href = "/";
});

