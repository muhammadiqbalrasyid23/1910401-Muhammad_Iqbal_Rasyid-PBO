//membuat method person
var person = {
    fullName: function(){
        return this.firstName +" "+ this.lastName;
    }
}

var person1 = {
    firstName:"Joe",
    lastName: "Bidden"
}

var person2 = {
    firstName:"Narantyo",
    lastName:"Maulana"
}
console.log("Menggunakan method call untuk menampilkan objek person 2: ")
//memanggil method menggunakan method call()
console.log(person.fullName.call(person2));
