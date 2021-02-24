 //deklarasi prompt
 const prompt = require('prompt-sync')()

    function Kendaraan(noPlat, merk, pajakKendaraan){
        this.noPlat         = noPlat
        this.merk           = merk
        this.pajakKendaraan = pajakKendaraan
    }
    Kendaraan.prototype.inputAtribut = function(){
        this.noPlat         = prompt('Masukkan Nomor Kendaraan\t\t: ')
        this.merk           = prompt('Masukkan Merk           \t\t: ')
        this.pajakKendaraan = prompt('Masukkan Pajak Kendaraan\t\t: ')
    },

     Kendaraan.prototype.FasiTambahan = function(){},

     Kendaraan.prototype.printFasiTambahan = function(){},
      
     Kendaraan.prototype.hitungPajak = function(){},
     
     Kendaraan.prototype.print = function(){
         console.log('<===INFO KENDARAAN===>')
            console.log('Nomor Kendaraan          \t: ' , this.noPlat)
            console.log('Merk Kendaraan           \t: ' , this.merk)
            this.printFasiTambahan()
            console.log('Masukkan Pajak Kendaraan \t: ' , this.pajakKendaraan)
            console.log('Total Pembayaran Pajak   \t: ' , this.hitungPajak)
     }
    
    //Sedan
    function Sedan(fasKeamanan, kapasitasCC, fasKenyamanan){
    this.fasKeamanan   = fasKeamanan
    this.kapasitasCC   = kapasitasCC
    this.fasKenyamanan = fasKenyamanan
    }
    //consturctor
    Sedan.prototype = new Kendaraan()
    Sedan.prototype.constructor = Kendaraan

    Sedan.prototype.FasiTambahan = function(){
        this.fasKeamanan   = prompt('Masukkan Fasilitas Keamanan   \t: ')
        this.kapasitasCC   = prompt('Masukkan Kapasitas (dalam CC) \t: ')
        this.fasKenyamanan = prompt('Masukkan Fasilitas Kenyamanan \t: ')
    }

    Sedan.prototype.printFasiTambahan = function(){
        console.log('Fasilitas Keamanan   \t\t: ', this.fasKeamanan)
        console.log('Kapasitas CC         \t\t: ', this.kapasitasCC)
        console.log('Fasilitas Kenyamanan \t\t: ', this.fasKenyamanan)
    }

    Sedan.prototype.hitungPajak = function(){
        this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapasitasCC * 0.00005)))
    }
    //Bus
    function Bus(kapPenumpang, kapBagasi){
        this.kapPenumpang = kapPenumpang
        this.kapBagasi    = kapBagasi
    }

    Bus.prototype = new Kendaraan()
    Bus.prototype.constructor = Kendaraan

    Bus.prototype.FasiTambahan = function(){
        this.kapPenumpang = prompt('Masukan Kapasitas Penumpang \t: ')
        this.kapBagasi    = prompt('Masukkan Kapasitas Bagasi(kg)\t: ')
    }

    Bus.prototype.printFasiTambahan = function(){
        console.log('Kapasitas Penumpang \t\t: ', this.kapPenumpang)
        console.log('Kapasitas Bagasi    \t\t: ', this.kapBagasi)
    }

    Bus.prototype.hitungPajak = function(){
        this.hitungPajak = (Number(this.pajakKendaraan * 1 + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005)))
    }
    //menampilkan input data Sedan
    console.log('\n<== INPUT DATA ===>')
    console.log('\n1. Sedan')
    var obSedan = new Sedan()
    obSedan.inputAtribut()
    obSedan.FasiTambahan()
   
    //menampilkan input data bus
    console.log('\n2. Bus')
    var obBus = new Bus()
    obBus.inputAtribut()
    obBus.FasiTambahan()
    
    //menampilkan data keseluruhan
    console.log('\n<== DATA SELURUH KENDARAAN ==>')
    console.log('\n1. Sedan')

    obSedan.hitungPajak()
    obSedan.print()
    

    console.log('\n2. Bus')

    obBus.hitungPajak()
    obBus.print()