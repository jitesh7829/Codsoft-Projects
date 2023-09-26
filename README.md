---------------------------------------------------------------------Task 1-Number Game--------------------------------------------------------------------------- 
In this GitHub-hosted random number guessing game, players are challenged to guess a random number within a specified range.
The game incorporates additional features such as a limited number of attempts, multiple rounds, and a scoring system.
How the Game Works:
The game generates a random number within a specified range, for example, between 1 and 100. The player is prompted to enter their guess for the generated number.
The game compares the player's guess with the generated number and provides feedback on whether the guess is correct, too high, or too low. 
If the guess is correct, the player wins the round. Otherwise, they can continue guessing until they either guess the correct number or exhaust the limited attempts. 
The player's score is calculated based on the number of attempts taken to guess the correct number or the number of rounds won if the player chooses to play multiple rounds. 
After each round, the player has the option to play again

 ---------------------------------------------------------------------Task 2-Word Counter-------------------------------------------------------------------------- 
 The Java Word Counting Tool is a command-line application hosted on GitHub that allows users to input text or provide a file and obtain the word count. 
 This project utilizes the Java programming language to efficiently process the user's input and deliver accurate word count results.

How the Tool Works:

User Input: The Java Word Counting Tool prompts the user to enter text or specify a file path for word counting. The user can choose to directly input the text or provide a text file for analysis.

Reading Input: The application reads the user's input text or file using Java's I/O functionalities. It ensures seamless handling of different file formats and gracefully handles any exceptions that may arise.

Word Counting: After reading the input, the Java Word Counting Tool splits the text into an array of words using space and punctuation marks as delimiters.
It then initializes a counter variable to keep track of the number of words encountered.

Iterating and Counting: The tool iterates through the array of words and increments the counter for each word encountered. By counting the occurrences of each word, the application determines the total word count.

---------------------------------------------------------------------Task 2-ATM Interface-------------------------------------------------------------------------- The ATM class is the core of the project, representing the ATM machine. It offers a user interface for customers to interact with their bank accounts. The class implements methods for the primary operations:

Withdraw(amount): Allows users to withdraw funds from their bank account. The method validates the user's input to ensure the amount is within acceptable limits and that the account has sufficient balance for the withdrawal. If successful, the method updates the account balance and provides a transaction confirmation message to the user. If the withdrawal is not possible, an appropriate error message is displayed.

Deposit(amount): Enables users to deposit funds into their bank account. The method validates the input to ensure that the deposited amount is valid and adds it to the account balance. It then provides a transaction confirmation message to the user.

Check balance (): Allows users to view their current account balance. The method displays the balance on the screen, providing users with their up-to-date financial status.

Class Description: BankAccount

The BankAccount class represents the user's bank account. It stores the account balance and is responsible for maintaining the funds. The class is linked with the ATM class to facilitate balance updates during withdrawals and deposits.

User Interface:

The user interface provides a straightforward menu-based system, where customers can choose from the following options:

Withdraw funds: Users can input the amount they wish to withdraw, and the ATM validates the transaction's feasibility before processing it.

Deposit funds: Users can input the amount they want to deposit, and the ATM adds the amount to their account balance.

Check account balance: Users can view their current account balance with this option.

Exit: Users can choose to exit the ATM interface and end their session.

Displaying Results: Once the word counting process is complete, the Java Word Counting Tool displays the total word count to the user through the command-line interface.

---------------------------------------------------------------------Task 3---------------------------------------------------------------------------
