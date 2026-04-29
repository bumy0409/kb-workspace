<template>
  <div>
    <h3>Options API 적용</h3>

    <div>
      이름 :
      <input
        type="text"
        placeholder="입력 시 대문자로 변환"
        :value="name"
        @input="changeName($event.target.value)"
      />
      <!-- $event.target : 이벤트가 발생한 요소 -->
      <hr />

      <h5>계산하기</h5>
      <div>
        X : <input type="text" v-model.number="x" /><br />
        Y : <input type="text" v-model.number="y" /><br />
        <button @click="calculateSum(x, y, 1)">X + Y</button>
        <p>X + Y = {{ sum }}</p>
      </div>
      <div>
        A : <input type="text" v-model.number="a" /><br />
        B : <input type="text" v-model.number="b" /><br />
        <button @click="calculateSum(a, b, 2)">A + B</button>
        <p>A + B = {{ sum2 }}</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: '',
  data() {
    return {
      name: '',
      x: '',
      y: '',
      a: '',
      b: '',
      sum: '',
      sum2: '',
    };
  },
  methods: {
    changeName(inputName) {
      this.name = inputName.toUpperCase();
    },
    calculateSum(x, y, z) {
      if (z === 1) {
        this.sum = x + y;
      } else {
        this.sum2 = x + y;
      }
    },
  },
};
</script>

<style scoped></style>
