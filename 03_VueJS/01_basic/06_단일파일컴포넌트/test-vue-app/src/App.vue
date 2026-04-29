<!--   .vue 파일 : 단일 파일 컴포넌트(Single File Component)

  .vue 파일 구조
  - template : 화면 구조
    - 화면 구조를 작성하는 영역
    - HTML 문법, 보간법 {{}} 을 사용하여 화면을 구성
    - 컴포넌트 템플릿 영역

  - script : 로직
    - 컴포넌트의 로직을 작성하는 영역
    - 컴포넌트의 데이터, 이벤트 핸들러, 메서드 등을 정의
    -  Composition API 를 사용하여 로직을 작성 -> <script setup> 태그 내에 작성
  - style : 스타일
    - 컴포넌트의 스타일을 작성하는 영역
    - CSS 문법을 사용하여 스타일을 작성
    - <style scoped> 태그 내에 작성 
     -> 현재 컴포넌트에서만 적용되는 스타일
     -> 컴포넌트 끼리 스타일 충돌 해결
 
-->

<template lang="">
  <div>
    <h2>App 컴포넌트</h2>
    <ul>
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
      <CheckboxItem />
    </ul>
  </div>
</template>
<script>
import CheckboxItem from './components/CheckboxItem.vue';

export default {
  name: 'App',
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        { id: 2, name: 'Black Pink', checked: false },
        { id: 3, name: 'EXO', checked: false },
        { id: 4, name: 'ITZY', checked: false },
      ],
    };
  },
};
</script>
<style lang=""></style>
