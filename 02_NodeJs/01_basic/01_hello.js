//터미널 열기 : ctrl + shift + `
//cmd로 변경
//node 파일명.js
//(주의!) 꼭 저장하고 실행하세요

function hello(x) {
  //함수 정의
  const colors = require('ansi-colors');

  console.log(colors.green(x) + ' 님, 안녕하세요?');
}

hello('홍길동'); //함수 호출
