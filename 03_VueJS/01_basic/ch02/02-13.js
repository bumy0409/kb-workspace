let obj = { result: 0 };

obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  inner();
  /* JavaScript에서 일반함수의 this는 호출방식에 따라 결정됨
  inner함수는 단독으로 호출됐기 때문에, 그 안의 this는 전역객체를 가리킴*/
};
obj.add(3, 4);
console.log(obj);
console.log(result);
