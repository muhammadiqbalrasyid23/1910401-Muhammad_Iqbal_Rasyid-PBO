//deklarasi prompt
 const prompt = require('prompt-sync')()

var Kendaraan = {
    inputAtribut : function(noPlat, merk, pajakKendaraan){
        this.noPlat         = prompt('Masukkan Nomor Kendaraan\t\t: ')
        this.merk           = prompt('Masukkan Merk           \t\t: ')
        this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan\t\t: ')
    },

     FasiTambahan : function(){},

     printFasiTambahan : function(){},
     
     hitungPajak : function(){},
     
     print : function(){
         console.log('<===INFO KENDARAAN===>')
            console.log('Nomor Kendaraan          \t: ' , this.noPlat)
            console.log('Merk Kendaraan           \t: ' , this.merk)
            this.printFasiTambahan()
            console.log('Masukkan Pajak Kendaraan \t: ' , this.pajakKendaraan)
            console.log('Total Pembayaran Pajak   \t: ' , this.hitungPajak)
     }
    }
    //Sedan
    var Sedan = Object.create(Kendaraan)

    Sedan.FasiTambahan = function(fasKeamanan, kapasitasCC, fasKenyamanan){
        this.fasKeamanan   = prompt('Masukkan Fasilitas Keamanan   \t: ')
        this.kapasitasCC   = prompt('Masukkan Kapasitas (dalam CC) \t: ')
        this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan \t: ')
    }

    Sedan.printFasiTambahan = function(fasKeamanan, kapasitasCC, fasKenyamanan){
        console.log('Fasilitas Keamanan   \t\t: ', this.fasKeamanan)
        console.log('Kapasitas CC         \t\t: ', this.kapasitasCC)
        console.log('Fasilitas Kenyamanan \t\t: ', this.fasKenyamanan)
    }

    Sedan.hitungPajak = function(hitungPajak){
        this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapasitasCC * 0.00005)))
    }
    //Bus
    var Bus = Object.create(Kendaraan)

    Bus.FasiTambahan = function(kapPenumpang, kapBagasi){
        this.kapPenumpang = prompt('Masukan Kapasitas Penumpang \t: ')
        this.kapBagasi    = prompt('Masukkan Kapasitas Bagasi(kg)\t: ')
    }

    Bus.printFasiTambahan = function(kapPenumpang, kapBagasi){
        console.log('Kapasitas Penumpang \t\t: ', this.kapPenumpang)
        console.log('Kapasitas Bagasi    \t\t: ', this.kapBagasi)
    }

    Bus.hitungPajak = function(hitungPajak){
        this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)))
    }

    console.log('\n<=== INPUT DATA ===>')
    console.log('\n1. Sedan')
    Sedan.inputAtribut()

    Sedan.FasiTambahan()
    Sedan.hitungPajak()

    console.log('\n2. Bus')
    Bus.inputAtribut()
    Bus.FasiTambahan()
    Bus.hitungPajak()

    console.log('\n<== DATA SELURUH KENDARAAN ==>')
    console.log('\n1. Sedan')
    Sedan.print()
    console.log('\n2. Bus')
    Bus.print()