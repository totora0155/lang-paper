// [v4.2.3]
// npm install benchmark
const Benchmark = require('benchmark').Benchmark,
      suite = new Benchmark.Suite;

suite
  .add('RegExp#test', () => { /o/.test('Hello World!'); })
  .add('String#indexOf', () => { 'Hello World!'.indexOf('o') > -1; })
  .on('cycle', (e) => { console.log(e.target.toString()); })
  .on('complete', (e) => {
    const target = e.currentTarget
    console.log('Fastest is ' + target.filter('fastest').pluck('name'));
  })
  .run({ 'async': true });
