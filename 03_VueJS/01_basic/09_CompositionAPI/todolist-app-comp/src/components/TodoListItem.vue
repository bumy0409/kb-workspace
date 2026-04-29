<template>
  <li
    class="list-group-item d-flex justify-content-between align-items-center"
    :class="{ 'list-group-item-success': todoItem.completed }"
  >
    <div class="d-flex align-items-center gap-2">
      <input
        type="checkbox"
        :checked="todoItem.completed"
        @change="emit('toggle-completed', todoItem.id)"
      />

      <template v-if="!todoItem.isEditing">
        <span :class="{ 'todo-done': todoItem.completed }">
          {{ todoItem.todo }} {{ todoItem.completed ? '(완료)' : '(미완료)' }}
        </span>
      </template>

      <template v-else>
        <input
          type="text"
          class="form-control"
          v-model="editedTodo"
          @keyup.enter="saveEdit"
          style="width: 250px"
        />
      </template>
    </div>

    <div class="d-flex gap-2">
      <template v-if="!todoItem.isEditing">
        <button class="btn btn-warning btn-sm" @click="startEdit">수정</button>
      </template>
      <template v-else>
        <button class="btn btn-success btn-sm" @click="saveEdit">저장</button>
      </template>

      <button
        class="btn btn-danger btn-sm"
        @click="emit('delete-todo', todoItem.id)"
      >
        삭제
      </button>
    </div>
  </li>
</template>

<script setup>
import { ref } from 'vue';

const props = defineProps({
  todoItem: { type: Object, required: true },
});

const emit = defineEmits(['delete-todo', 'toggle-completed', 'update-todo']);

const editedTodo = ref('');

const startEdit = () => {
  editedTodo.value = props.todoItem.todo;
  props.todoItem.isEditing = true;
};

const saveEdit = () => {
  if (editedTodo.value.trim().length < 2) return;

  emit('update-todo', {
    id: props.todoItem.id,
    todo: editedTodo.value,
  });
};
</script>

<style scoped>
.todo-done {
  text-decoration: line-through;
}
</style>
