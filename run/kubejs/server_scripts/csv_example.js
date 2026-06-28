// Visit the docs for more info - https://github.com/ChloePrime/KubeJS-CSV/tree/master/src/main/resources/docs/
console.info('Hello, testing KubeJS CSV functionality!')

console.info(CsvIO.read("kubejs/test.csv"))
CsvIO.write("kubejs/test_write.csv", [
  {Name: "Alice", Phone: 10000, Bool: true},
  {Name: "Bob", Phone: 10001, Bool: false},
  {Name: "Charlie", Phone: 10086},
  {Name: "Bad Ass", Phone: "", Bool: undefined, Blue: {A: 1, C: false}},
])