function PersegiPanjang(panjang,lebar){
  this.panjang = panjang 
  this.lebar = lebar
}

PersegiPanjang.prototype.getluas = function(){
  var luas = this.panjang * this.lebar
  console.log ('Luas: ', this.panjang,' x ',this.lebar,' : ', luas)
}

PersegiPanjang.prototype.print= function(){
  console.log('Panjang sisi: ',this.panjang)
  console.log('Lebar sisi: ', this.lebar)
}

//turunan fungsi
function Persegi(sisi){
  this.panjang = sisi
  this.lebar = sisi
}

//menginherit fungsi PersegiPanjang
Persegi.prototype = new PersegiPanjang()
Persegi.prototype.constructor = PersegiPanjang()

//redefinisi fungsi print()
Persegi.prototype.print = function(){
  console.log('Panjang sisi: ',this.panjang)
}

//const prompt = require('prompt-sync')

console.log('Input Persegi Panjang')
var obPersegiPanjang = new PersegiPanjang(
  prompt('Masukkan panjang: '),
  prompt('Masukkan lebar: ')
)

console.log('\nInput Persegi')
var obPersegi = new Persegi(
  prompt('Masukkan panjang sisi: ')
)

console.log('\nMenghitung Luas Persegi Panjang')
obPersegiPanjang.print()
obPersegiPanjang.getluas()

console.log('\nMenghitung Luas Persegi')
obPersegi.print()
obPersegi.getluas()