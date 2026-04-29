<!-- 
  사용자 정의 이벤트를 이용한 정보 전달

  - 이벤트(Events) : 자식 컴포넌트에서 부모 컴포넌트로 정보 전달

  - 이벤트 발신(emit, 방출하다) : 자식 컴포넌트에서 부모 컴포넌트로 이벤트 방출
    this.$emit('event-name', eventArgs1, eventArgs2, …)


  - 이벤트 수신(on) : 부모 컴포넌트에서 자식 컴포넌트로 이벤트 수신
  <child-component @event-name="handlerMethod" />
    methods: {
    handlerMethod(eventArgs1, eventArgs2, …) {
    // 전달받은 아규먼트로 처리할 코드 작성
    }
  }
-->
<template>
  <h1>사용자 정의 이벤트(자식 -> 부모 이벤트 발신)</h1>
  <InputName @nameChanged="nameChangeHandler" />
  <br />
  <h3>App 데이터 : {{ parentName }}</h3>
</template>

<script>
import InputName from './components/InputName.vue';
export default {
  name: 'App4',
  components: { InputName },
  data() {
    return {
      parentName: '',
    };
  },
  methods: {
    nameChangeHandler(e) {
      // e : 자식 컴포넌트에서 전달받은 이벤트 객체
      this.parentName = e.name;
    },
  },
};
</script>

<style scoped></style>
