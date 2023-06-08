function loginCheck(){
    if(document.frm.userid.value.length==0){
        alert("아이디를 써주세요");
        frm.userid.focus();
        return false;
    }
    if(document.frm.pwd.value==""){
        alert("비밀번호를 써주세요");
        frm.pwd.focus();
        return false;
    }
    return true;
}
function joinCheck(){
    if(document.frm.name.value.length==0){
        alert("이름 써주세요");
        frm.name.focus();
        return false;
    }
    if(document.frm.pwd.value.length==""){
        alert("비밀번호를 써주세요");
        frm.pwd.focus();
        return false;
    }

    if(document.frm.pwd.value != document.frm.pwd_check.value){
        alert("암호가 일치하지 않습니다.");
        frm.pwd.focus();
        return false;
    }
}
function idCheck(){
    if(document.frm.userid.value.length==""){
        alert("아이디를 입력해주세요");
        frm.userid.focus();
        return false;
    }
    var url ="idCheck.do?userid="+document.frm.userid.value;
    window.open(url, "_blank_1", "toolbar=no, member=no,scrollbars=yes, resizeble=no, width=450, height=200");

}
function idok(){
    opener.frm.userid.value = document.frm.userid.value;
    opener.frm.reid.value = document.frm.userid.value;
    self.close();
}