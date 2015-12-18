// [v3.0.7]
// lp
                        /*
use lp
db
                        */

// [v3.0.7]
// lp 0.xxxGB
                        /*
show dbs
                        */

// [v3.0.7]
// people
// { "_id" : ObjectId("5673913c4096fdee489f380d"), "name" : "aaa", "age" : 23 }
//
// { "_id" : ObjectId("5673913c4096fdee489f380d"), "name" : "aaa", "age" : 23 }
// { "_id" : ObjectId("5673913c4096fdee489f380e"), "name" : "bbb", "age" : 13 }
// { "_id" : ObjectId("5673913c4096fdee489f380f"), "name" : "ccc", "age" : 11 }
// { "_id" : ObjectId("5673913c4096fdee489f3810"), "name" : "ddd", "age" : 32 }
db.people.insert([
  {name: "aaa", age: 23},
  {name: "bbb", age: 13},
])
db.people.insert({name: "ccc", age: 11})
db.people.insert({name: "ddd", age: 32})
                        /*
show collections
                        */
db.people.findOne()
db.people.find()

// [v3.0.7]
// { "_id" : ObjectId("5673918f4096fdee489f3813"), "name" : "ccc", "age" : 11 }
// { "_id" : ObjectId("567391904096fdee489f3814"), "name" : "ddd", "age" : 32 }
//
// _
db.people.remove({name: { $in: ["aaa", /^bbb/]}})
db.people.find()
db.people.remove({})
db.people.find()
