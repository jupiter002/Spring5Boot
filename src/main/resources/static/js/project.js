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

// checkme
let frm = document.forms.agreefrm2;
let checkbtn2 = document.querySelector("#checkbtn2");
let cancelbtn2 = document.querySelector("#cancelbtn2");


checkbtn2?.addEventListener('click',()=> {

    if(frm.name2.value=== ''){
        alert("이름을 입력해주세요")
    }
    else if(frm.jumin1.value=== ''){
        alert("주민번호 앞자리를 입력해주세요")
    }
    else if(frm.jumin2.value=== ''){
        alert("주민번호 뒷자리를 입력해주세요")
    }
    else if(!frm.realagree.checked){
        alert("주민등록번호 처리에 동의해주세요 ")
    }
    else {
        let params = '?name=' + frm.name.value;
        params += '&jumin1=' + frm.jumin1.value;
        params += '&jumin2=' + frm.jumin2.value;
        location.href = "/join/joinme?" + params;
    }
});
cancelbtn2?.addEventListener('click',()=> {
    location.href = "/";
});