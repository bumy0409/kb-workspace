<!-- props 속성 사용(객체 전달)
 - props 목적 : 자식 컴포넌트가 필요한 데이터를 전달 받아 UI 렌더링 하는 것 -->

<template lang="">
  <li><input type="checkbox" :checked="checked" />{{ id }} - {{ name }}</li>
</template>
<script>
export default {
  name: 'CheckboxItem', //컴포넌트 이름
  // props: ['name', 'checked', 'id'],
  //props로 전달 받은 idol

  // 부모 -> 자식으로 넘어오는 데이터 타입 정의
  props: {
    id: [Number, String],
    name: String,
    checked: {
      type: Boolean,
      default: false,
      required: false,
    },
  },
};
</script>
