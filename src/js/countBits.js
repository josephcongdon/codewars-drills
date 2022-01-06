var countBits = function(num) {
    // Program Me
    let newTotal = 0;
    let newBinary = "";
    let binary = (num % 2).toString();
    for (; num > 1; ) {
        num = parseInt(num/2);
        binary =  (num % 2) + (binary);
        newBinary += binary.split(',');
        for(let i = 0; i <= newBinary.length; i++){
            if (i === 1){
                newTotal += i;
            }
        }
    }
return newTotal;
};