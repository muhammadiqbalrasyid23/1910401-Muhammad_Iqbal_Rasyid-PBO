const prompt = require('prompt-sync')()
let total = prompt('Berapa mahasiswa?\t: ')

var array = []
var mahasiswa = {}

for(let i = 0; i < total; i++){
    console.log(`\nMahasiswa ${i}`)
    mahasiswa = new Object(
        {
            name : prompt('Masukan nama\t\t\t: '),
            birth : prompt('Masukan tanggal lahir\t: '),
            nim : prompt('Masukan NIM\t\t\t: '),
            age : function(){
                let year = this.birth.slice(this.birth.length - 4)
                return 2020 - year
            }
        }
    )
    array.push(mahasiswa)
}
let index = 0
for (let x in array){
    console.log(`\nMahasiswa\t: ${index}`)
    index ++
    console.log(`Nama\t\t\t: ${array [x].name}`)
    console.log(`Tanggal lahir\t: ${array[x].birth}`)
    console.log(`NIM\t\t\t: ${array[x].nim}`)
    console.log(`Umur\t\t\t: ${array[x].age()}`)
}