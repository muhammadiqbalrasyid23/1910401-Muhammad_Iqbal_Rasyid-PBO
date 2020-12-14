const prompt = require('prompt-sync')()

let object = { }
object.name = prompt('Input name\t: ')
object.age =prompt('Input Age\t\t: ')
object.nim =prompt('Input Nim\t: ')
object.prodi=prompt('Input Prodi\t: ')

console.log()

for(property in object) {
  
  console.log(property + `\t: ${ object[property] }`)
}
