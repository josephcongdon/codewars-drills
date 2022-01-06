var countBits = function(num) {
    // Program Me
    let array;
    let binary = (num % 2).toString();
    let backToNumbers;
    let sum = 0;
    for (; num > 1; ) {
        num = parseInt(num/2);
        binary = (num % 2) + (binary);
        }
        array = binary.split("");
        backToNumbers = array.map(x => parseInt(x));
        backToNumbers.forEach(function (digit){
            sum += digit;
     });
    return sum;
    }

