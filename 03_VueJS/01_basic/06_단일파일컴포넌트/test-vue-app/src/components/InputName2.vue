<!-- 이벤트 발신 시 유효성 검증 처리
  - emits 옵션 : 발신하는 이벤트에 대한 유효성 검사를 수행

  - 작성법 1) 배열 형태로 이벤트명 나열 : 등록된 이벤트가 발생하는지 이벤트명 확인
  const component = {
    emits : ["이벤트명1", "이벤트명2", ...]
    }
  }


  - 작성법 2) 객체 형태로 이벤트명 나열 : 이벤트명 + eventArgs 유효성 여부도 확인
  const component = {
    emits : {
      이벤트명1 : (eventArgs) => {
        // true 반환 : 이벤트 발신 허용
        // false 반환 : 이벤트 발신 거부
      },
      이벤트명2 : null, // 유효성 검사 없음
    }
  }
-->
<!-- 자식에서 부모로 이벤트 발신 -->
<template>
  <div>
    <!-- v-model을 사용해서 입력값을 name변수에 양방향 바인딩 -->
    이름 : <input type="text" v-model="name" />

    <!-- $emit 메소드를 사용하여 부모 컴포넌트로 이벤트 발신
        $emit은 직계 부모 컴포넌트에게만 이벤트 발신 가능! 
    -->

    <!-- 버튼 클릭시 nameChanged 이벤트를 발신(방출)하고 name 데이터가 담긴 객체를 같이 전달 -->
    <button @click="$emit('nameChanged', { name })">이벤트 발신</button>
  </div>
</template>

<script>
export default {
  name: 'InputName',

  emits: {
    nameChanged: (e) => {
      return e.name && typeof e.name === 'string' && e.name.length >= 3;
    },
  },
  data() {
    return {
      name: '', //사용자가 입력한 이름을 저장할 변수
    };
  },
};
</script>

<style scoped></style>
