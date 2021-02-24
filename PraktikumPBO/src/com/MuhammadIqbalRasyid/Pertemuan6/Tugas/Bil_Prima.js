var prima = false;
 
    console.log ("Bilangan Prima:");
 
    for (index=2; index<=100; index++){
        if (index >= 2){
            prima = true;
 
            for (angka = 2; angka < index; angka++){
                if (index%angka == 0){
                    prima = false;
                }
            }
        }
 
        if (prima == true){
            console.log(" " + index + " ");
        }
    }