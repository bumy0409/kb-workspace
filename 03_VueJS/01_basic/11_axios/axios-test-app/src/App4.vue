<template>
  <div>
    <h2>콘솔 확인하기</h2>
  </div>
</template>

<script setup>
import axios from 'axios';
// axios : 서버랑 데이터를 주고 받는 도구

// 전체 목록 조회 URL
const BASEURL = '/api/todos';

// Promise 체인 방식
// -> 결과를 다음으로 넘기면서 순서대로 실행하는 구조

// 4건의 목록을 조회한 후 첫 번째, 두 번째 할 일을 순차적으로 조회

// 전체 목록을 조회한 후 한 건씩 순차적으로 순회하면서 조회하기
const requestAPI = async () => {
  let data = { todo: '복습하기', desc: '이해가 될 때 까지' };

  // POST 요청 : 데이터 추가
  const resp = await axios.post(BASEURL, data);
  console.log(resp.data);
};

requestAPI(); // 함수 호출
</script>
