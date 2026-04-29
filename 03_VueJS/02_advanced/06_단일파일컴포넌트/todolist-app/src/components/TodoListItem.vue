<template>
  <li
    class="list-group-item"
    :class="{ 'list-group-item-success': todoItem.completed }"
    @click="$emit('toggle-completed', todoItem.id)"
  >
    <input
      type="checkbox"
      class="pointer me-3"
      :checked="todoItem.completed"
      @click.stop="$emit('toggle-completed', todoItem.id)"
    />

    <!-- <input type="checkbox" class="pointer me-3" v-model="todoitem.completed" />
    // 객체 props에 v-model을 쓰면 부모 데이터도 같이 바뀐다. // -> 하지만
    props는 읽기전용이 원칙이라서 권장x // -> 해결: 자식 컴포넌트에서 $emit으로
    부모에게 알려서 바꾸자! -->

    <span class="pointer" :class="{ 'todo-done': todoItem.completed }">
      {{ todoItem.todo }} {{ todoItem.completed ? '(완료)' : '' }}
    </span>
    <span
      class="float-end badge bg-secondary pointer"
      @click.stop="$emit('delete-todo', todoItem.id)"
      >삭제</span
    >
  </li>
</template>
<script>
export default {
  name: 'TodoListItem',
  props: {
    todoItem: { type: Object, required: true },
  },
  emits: ['delete-todo', 'toggle-completed'],
};
</script>
