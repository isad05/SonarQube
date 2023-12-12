function unsafeEvalExample(userInput) {
    let result;
  
    // Potential security risk: Using eval with user input
    eval('result = ' + userInput);

      totalPrice = price * quantity;
  
    return totalPrice;
  }
  
  const userInput = prompt('Enter a value:'); // Simulating user input
  
  console.log('Result:', unsafeEvalExample(userInput));


