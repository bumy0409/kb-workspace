<template>
  <div class="card card-body mb-3">
    <div class="row g-2">
      <div class="col-md-2">
        <input
          type="text"
          class="form-control"
          placeholder="이름"
          v-model="name"
        />
      </div>

      <div class="col-md-2">
        <select class="form-select" v-model="gender">
          <option value="">성별</option>
          <option value="남">남</option>
          <option value="여">여</option>
        </select>
      </div>

      <div class="col-md-2">
        <input
          type="number"
          class="form-control"
          placeholder="나이"
          v-model="age"
        />
      </div>

      <div class="col-md-3">
        <input
          type="email"
          class="form-control"
          placeholder="이메일"
          v-model="email"
        />
      </div>

      <div class="col-md-2">
        <input
          type="text"
          class="form-control"
          placeholder="github ID"
          v-model="github"
        />
      </div>

      <div class="col-md-1 d-grid">
        <button class="btn btn-primary" @click="addContact">추가</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ContactForm',
  emits: ['add-contact'],
  data() {
    return {
      name: '',
      gender: '',
      age: '',
      email: '',
      github: '',
    };
  },
  methods: {
    addContact() {
      if (!this.name) {
        alert('이름을 입력하세요');
        return;
      }

      if (!this.email) {
        alert('이메일을 입력하세요');
        return;
      }

      this.$emit('add-contact', {
        name: this.name,
        gender: this.gender,
        age: this.age,
        email: this.email,
        github: this.github,
      });

      this.name = '';
      this.gender = '';
      this.age = '';
      this.email = '';
      this.github = '';
    },
  },
};
</script>
