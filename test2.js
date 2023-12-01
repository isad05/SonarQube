function unsafeEvalExample(userInput) {
    let result;
  
    // Potential security risk: Using eval with user input
    eval('result = ' + userInput);
  
    return result;
  }
  
  const userInput = prompt('Enter a value:'); // Simulating user input
  
  console.log('Result:', unsafeEvalExample(userInput));
  