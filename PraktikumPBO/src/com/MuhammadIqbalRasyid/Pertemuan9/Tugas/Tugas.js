const prompt = require('prompt-sync')()
//Constructor Hewan
function Hewan(nama, jenis, umur, makanan, riwayat_penyakit){
  this.nama = nama
  this.jenis = jenis
  this.umur = umur
  this.makanan = makanan
  this.riwayat_penyakit = riwayat_penyakit
  
  // Fungsi untuk menampilkan
  this.tampil = function(){
    console.log('Nama Hewan\t\t\t: ', this.nama)
    console.log('Jenis Hewan\t\t\t: ', this.jenis)
    console.log('Umur Hewan\t\t\t: ', this.umur)
    console.log('Makanan\t\t\t\t: ', this.makanan)
    console.log('Riwayat Penyakit\t: ', this.riwayat_penyakit)
  } 
}
  
// Array
var array = [] // Deklarasi array tanpa value
// Object 
var hewan = {} // Deklarasi object tanpa value

var cek = false
//Menampilkan Menu pilihan
do{
  console.log('Selamat Datang di King Pet Shop ')
  console.log()
  
  console.log('Menu :')
  console.log('1. Tambah Hewan')
  console.log('2. Edit Hewan')
  console.log('3. Tampilkan Hewan')
  console.log('4. Exit')
  console.log()
  let pil = prompt('Masukkan Pilihan Menu\t: ')

  console.log()
//Menampilkan menu Pilihan 1
  if(pil == 1){
    let jmlHewan = prompt('Masukkan Jumlah Hewan\t: ')

    for (let i = 0; i < jmlHewan; i++) {
      console.log(`\nHewan ke-${i}`);  
      hewan = new Hewan(
        prompt(`Nama Hewan\t\t\t: `), 
        prompt(`Jenis Hewan\t\t\t: `), 
        prompt(`Umur Hewan\t\t\t: `),
        prompt(`Makanan\t\t\t\t: `),
        prompt(`Riwayat Penyakit\t: `)
      )
      array.push(hewan)
    }
    console.log()

  }else if(pil == 2){
    var noHewan = prompt('Masukkan Nomer Urut Hewan\t: ')
     
    // Tambah fungsi baru ke constructor
    Hewan.prototype.edit = function(){
      nama = prompt(`Nama Hewan\t\t\t: `), 
      jenis = prompt(`Jenis Hewan\t\t\t: `), 
      umur = prompt(`Umur Hewan\t\t\t: `),
      makanan = prompt(`Makanan\t\t\t\t: `),
      riwayat_penyakit = prompt(`Riwayat Penyakit\t: `),
      tampil = this.tampil
      return {nama, jenis, umur, makanan, riwayat_penyakit, tampil}
    } 
    
    let index = noHewan-1
    array[index] = array[index].edit()
    
    console.log('\nData Berhasil Dirubah')
    console.log()
   
  }else if(pil == 3){
    index = 1
  
    // Mencetak output program
    for (let x in array){
      console.log(`\nHewan ke-${index}`);
      index++;
      array[x].tampil()
    }
  console.log()

  }else if(pil == 4){
    cek = true
    console.log('Terima Kasih !!!')
  //Jika Pilihan input tidak sesuai 
  }else{
    console.log('Maaf inputan Anda Tidak Sesuai')
    console.log()
  }
}while(!cek)