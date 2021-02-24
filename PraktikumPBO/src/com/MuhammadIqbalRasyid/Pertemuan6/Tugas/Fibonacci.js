var a,b,result;

console.log("Bilangan Fibonacci")
a=0;
b=1;
result=b;
for(var i=1; i<10; i++){
    console.log(result+ " ");
    result = a+b;
    a=b;
    b=result;
}