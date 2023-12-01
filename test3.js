function exampleCodeWithIssues(password, user) {
    // Security issue: Hardcoded password
    const hardcodedPassword = 'secretpassword';
  
    if (password === hardcodedPassword) {
      console.log('Authentication successful');
    }
  
    // Maintainability issue: Unused variable
    const unusedVariable = 42;
  
    // Potential bug: Incorrect condition (assignment instead of equality check)
    if (user.isAdministrator = true) {
      console.log('User is an administrator');
    }
  
    // Security issue: SQL injection vulnerability
    const userId = user.id;
    const query = `SELECT * FROM users WHERE id = ${userId}`;
  
    // Potential bug: Unreachable code
    return 'This code will never be reached';
  }
  
  // Example usage
  const userCredentials = {
    username: 'john.doe',
    password: 'secretpassword',
    isAdministrator: false,
    id: 123
  };
  
  exampleCodeWithIssues(userCredentials.password, userCredentials);
  