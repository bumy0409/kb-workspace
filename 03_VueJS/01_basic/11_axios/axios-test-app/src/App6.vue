<template>
  <div>
    <h2>콘솔 확인하기</h2>
  </div>
</template>

<script setup>
// try - catch
// try : 예외가 발생할 가능성이 있는 코드
// catch : 예외 발생 시 수행할 코드
// finally : 마지막에 반드시 실행되는 코드

import axios from 'axios';

const BASEURL = '/api/todos';

//에러처리 예제
const requestAPI = async () => {
  try {
    // 에러 발생 시 즉시 종료 후 catch문으로 이동
    const url = '/api/todos2';
    let response = await axios.get(BASEURL);
    console.log(response);
  } catch (e) {
    // 에러 발생 시에만 수행
    console.log('에러 catch');
    if (e instanceof Error) console.log(e.message);
    else console.log(e);
  } finally {
    console.log('finally');
  }
};

requestAPI(); // 함수 호출
</script>
