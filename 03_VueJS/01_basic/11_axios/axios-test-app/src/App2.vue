<template>
  <div>
    <h2>콘솔 확인하기</h2>
  </div>
</template>

<script setup>
import axios from 'axios';
// axios : 서버랑 데이터를 주고 받는 도구

// 전체 목록 조회 URL
const listUrl = '/api/todos';
const todoUrlPrefix = '/api/todos/';

// Promise 체인 방식
// -> 결과를 다음으로 넘기면서 순서대로 실행하는 구조

// 4건의 목록을 조회한 후 첫 번째, 두 번째 할 일을 순차적으로 조회
const requestAPI = async () => {
  let todoList;

  // 1. 전체 목록 조회
  //await : Promise가 끝날 때 까지 기다림
  let response = await axios.get(listUrl);
  todoList = response.data;
  console.log('## TodoList : ', todoList);

  // 2. 첫 번째 Todo 조회
  response = await axios.get(todoUrlPrefix + todoList[0].id);
  console.log(response);
  // Promise(pending) : 아직 결과가 안 나온 상태
  console.log('## 첫 번째 Todo : ' + response.data);

  // 3. 두 번째 Todo 조회
  response = await axios.get(todoUrlPrefix + todoList[1].id);
  console.log('## 두 번째 Todo : ', response.data);
};

// requestAPI(); // 함수 호출
</script>
