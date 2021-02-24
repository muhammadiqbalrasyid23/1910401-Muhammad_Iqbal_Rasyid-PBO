var person = {
    fullName: function(birth, city){
        return this.firstName +" " + this.lastName +
        "," + birth + "," + city;
    }
};
var person1 ={
    firstName: "Narantyo",
    lastName: "Maulana"
};
//menggunakan apply
console.log(person.fullName.apply(person1,["Desember","Purwokerto"]));
//Jika menggunakan call