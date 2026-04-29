<template>
  <div><Calc5 /></div>
  <div><Calc4 /></div>
  <div><Calc3 /></div>
  <div><Calc2 /></div>
  <div><Calc /></div>
</template>

<script>
import Calc from './components/Calc.vue';
import Calc2 from './components/Calc2.vue';
import Calc3 from './components/Calc3.vue';
import Calc4 from './components/Calc4.vue';
import Calc5 from './components/Calc5.vue';
export default {
  name: 'App',
  components: { Calc, Calc2, Calc3, Calc4, Calc5 },
};
</script>

<style scoped></style>
