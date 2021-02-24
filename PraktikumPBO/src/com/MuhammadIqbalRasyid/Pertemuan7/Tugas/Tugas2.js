//This code was written by narantyo maulana

//atribut
var nums = [70,80,85,89,99]
var sum = 0
for(var i in nums){
    sum += nums[i]
}

var numsbagi = nums.length

var average = sum/numsbagi

//function2
function myFunction2(arg1,arg2){
    this.Name  = arg1
    this.nilai = arg2
}

//membuat objek dari fungsi myfunction
var x = new myFunction2('Indah Pertiwi',average )
console.log("Nama : " + x.Name )
console.log("Rata - rata nilai kamu : " + average)