<template>
  <li class="list-group-item">
    <input type="checkbox" class="pointer me-3" />
    <!-- <input type="checkbox" class="pointer me-3"  v-model="todoitem.completed"/> -->
    <!-- 객체 props에 v-model을 쓰면 부모 데이터도 같이 바뀐다.
         -> 하지만 props는 읽기전용이 원칙이라서 권장x
         -> 해결: 자식 컴포넌트에서 $emit으로 부모에게 알려서 바꾸자!
     -->
    <span class="pointer" :class="{'todo-done':todoitem.completed}">
        {{ todoitem.todo }}
        {{ todoitem.completed ? '(완료)' : '' }}   
    </span>
    <span class="float-end badge bg-secondary pointer">
      class="float-end badge bg-secondary pointer"
      @click=""
    </span>
  </li>
</template>
<script>
export default {
  name: 'TodoListItem',
};
</script>
