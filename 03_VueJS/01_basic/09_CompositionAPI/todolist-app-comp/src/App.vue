<template>
  <div class="container">
    <div class="card card-body bg-light">
      <div class="title">:: Todolist App</div>
    </div>

    <div class="card card-default card-borderless mt-3">
      <div class="card-body">
        <InputTodo @add-todo="addTodo" />

        <div class="mb-3">
          <button class="btn btn-danger" @click="clearAllTodos">
            전체삭제
          </button>
        </div>

        <TodoList
          :todoList="todoList"
          @delete-todo="deleteTodo"
          @toggle-completed="toggleCompleted"
          @update-todo="updateTodo"
        />
      </div>
    </div>
  </div>
</template>

<script setup>
import { reactive } from 'vue';
import TodoList from './components/TodoList.vue';
import InputTodo from './components/InputTodo.vue';

let ts = new Date().getTime();

const todoList = reactive([
  { id: ts, todo: '자전거 타기', completed: false, isEditing: false },
  { id: ts + 1, todo: '딸과 공원 산책', completed: true, isEditing: false },
  { id: ts + 2, todo: '일요일 애견 카페', completed: false, isEditing: false },
  { id: ts + 3, todo: 'Vue 원고 집필', completed: false, isEditing: false },
]);

const addTodo = (todo) => {
  if (todo.length >= 2) {
    todoList.push({
      id: new Date().getTime(),
      todo,
      completed: false,
      isEditing: false,
    });
  }
};

const deleteTodo = (id) => {
  const index = todoList.findIndex((item) => id === item.id);
  if (index !== -1) {
    todoList.splice(index, 1);
  }
};

const toggleCompleted = (id) => {
  const index = todoList.findIndex((item) => id === item.id);
  if (index !== -1) {
    todoList[index].completed = !todoList[index].completed;
  }
};

const updateTodo = ({ id, todo }) => {
  const index = todoList.findIndex((item) => id === item.id);
  if (index !== -1 && todo.trim().length >= 2) {
    todoList[index].todo = todo;
    todoList[index].isEditing = false;
  }
};

const clearAllTodos = () => {
  todoList.splice(0, todoList.length);
};
</script>
