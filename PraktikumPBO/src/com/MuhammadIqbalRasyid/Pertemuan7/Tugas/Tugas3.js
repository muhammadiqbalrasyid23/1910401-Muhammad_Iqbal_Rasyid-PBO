var numbers = [10, 3, 1, 4, 5];
//menggunakan apply
var maximal = Math.max.apply(Math,numbers);
var minimal = Math.min.apply(Math,numbers);

//memanggil fungsi apply
console.log("Nilai: " + numbers);
console.log("Nilai maksikum : "+ maximal );
console.log("Nilai Minimal: "+ minimal );