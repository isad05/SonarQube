// File: example.js

function exampleCodeWithIssues() {
    // Major Issue: Unused variable
    let unusedVariable = "This variable is declared but not used.";

    // Critical Issue: Unhandled promise rejection
    async function criticalIssueExample() {
        let promise = Promise.reject("Critical issue: Unhandled promise rejection");
        await promise;
    }

    // Minor Issue: Use of deprecated method
    let deprecatedMethodExample = () => {
        console.warn("Minor issue: Deprecated method used.");
    };

    // Blocker Issue: Infinite loop
    function blockerIssueExample() {
        while (true) {
            console.log("Blocker issue: Infinite loop");
        }
    }

    // Info Issue: Informative message
    console.log("Info issue: This is an informative message.");
}

exampleCodeWithIssues();
