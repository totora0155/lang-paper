// [v4.2.3]
//
// listner1 executed
// listner2 executed
//
// 2
const EventEmitter = require('events'),
      ee = new EventEmitter();

function listner1 () { 'listner1 executed'; }
function listner2 () { 'listner2 executed'; }
ee.on('execute', listner1);
ee.on('execute', listner2);
ee.emit('execute');

EventEmitter.listenerCount(ee, 'execute');
