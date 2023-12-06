function complexErrorExample() {
    let sum = 0;
    let numbers = [1, 2, 3, 4, 5];

    for (let i = 0; i <= numbers.length; i++) {  // Error at this line (off-by-one error)
        sum += numbers[i];  // Error at this line (undefined variable if i equals numbers.length)
    }

    // Additional code that may not be executed due to the error
    console.log("The sum is: " + sum);
}

complexErrorExample();
