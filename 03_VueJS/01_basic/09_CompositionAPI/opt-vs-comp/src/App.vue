<template>
  <div>
    <Calc />
  </div>
  <div>
    <Composition />
  </div>
  <div>
    <Options />
  </div>
</template>

<script>
import Options from './components/Options.vue';
import Composition from './components/Composition.vue';
import Calc from './components/Calc.vue';
export default {
  name: '',
  components: { Options, Composition, Calc },
};
</script>

<style scoped></style>
