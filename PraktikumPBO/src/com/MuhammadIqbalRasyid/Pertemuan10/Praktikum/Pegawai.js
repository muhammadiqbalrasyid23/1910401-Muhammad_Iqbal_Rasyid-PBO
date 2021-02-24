var Pegawai = {
    inputdata : function (nip, nama, alamat, gajiPokok){
        this.nip = prompt('Masukan NIP\t: ')
        this.nama = prompt('Masukan Nama\t: ')
        this.alamat = prompt('Masukan Alamat\t: ')
        this.gajiPokok = prompt('Masukan Gaji Pokok\t: ')
    },

    inputTunjangan : function(tunjangan){
        this.tunjangan = prompt('Masukan Tunjangan\t: ')
    },

    print : function(){
        console.log('NIP\t: ', this.nip)
        console.log('Nama\t: ', this.nama)
        console.log('Alamat\t: ', this.alamat)
        console.log('Gaji Pokok\t: ', this.gajiPokok)
        console.log('Tunjangan\t: ', this.tunjangan)
        console.log('Total Gaji\t: ', (this.gajiPokok * 1) + (this.tunjangan))
    }
}

var Sales = Object.create(Pegawai)
Sales.inputTunjangan = function(tunjangan){
    jmlPelanggan = prompt('Masukan jumlah pelanggan yang direkrut\t: ')
    this.tunjangan = jmlPelanggan * 50000
}

var Satpam = Object.create(Pegawai)
Satpam.inputTunjangan = function (tunjangan) {
    jam = prompt('Masukan Jumlah Lembur (dalam jam)\t: ')
    this.tunjangan = jam * 10000
}

var Manager = Object.create(Pegawai)
Manager.inputTunjangan = function (tunjangan) {
    thMasuk = prompt('Masukan tahun masuk\t: ')
    lamaKerja = 2020 - thMasuk
    if (lamaKerja <= 3){
        this.tunjangan = 5 / 100 * this.gajiPokok
    }else{
        this.tunjangan = 10 / 100 * this.gajiPokok
    }
}

//deklarasi prompt
const prompt = require('prompt-sync')()

console.log('Data Pegawai PT ABC')
console.log('\n1. Satpam')
Satpam.inputdata()
Satpam.inputTunjangan()

console.log('\n2. Sales')
Sales.inputdata()
Sales.inputTunjangan()

console.log('\n3. Manager')
Manager.inputdata()
Manager.inputTunjangan()

console.log('\n<===== Hasil Input Data Pegawai =====>')
console.log('\n1. Data Satpam')
Satpam.print()
console.log('\n2. Data Sales')
Sales.print()
console.log('\n3. Data Manager')
Manager.print()