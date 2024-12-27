# Simple Chat Bot

Digital personal assistants 
help people to drive cars, plan their
day, and buy things online. In a sense, they are simplified 
versions of artificial intelligence with whom you can talk.

In this project, a simple chatbot who can teach some programming, is created. 


## Stage 1/5: Chatty Bot welcomes you

For the first stage, our bot displays a greeting, its name, and the year it was created.
First impressions count!

Stage implementation: [Stage_1.kt](src/bot/Stage_1.kt)
    
**Example:**

    Hello! My name is Love.
    I was created in 2023

## Stage 2/5: Print your name

The greeting part is great, but chatbots are also supposed to
interact with a user. This functionality is implemented in this stage.

Stage implementation: [Stage_2.kt](src/bot/Stage_2.kt)

**Example:**

    Hello! My name is Love.
    I was created in 2023.
    Please, remind me your name.
    > Max
    What a great name you have, Max!

## Stage 3/5: Guess the age

It's time to make our bot smarter. In this stage, the functionality of guessing a user's
age is implemented.

It works as follows:

- The bot asks the user for the remainder of their age by the numbers 3, 5, and 7
- It calculates the age using the following formula:
`age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105`
- Eventually, it prints out the calculated age, as well as an inspiring message.

Stage implementation: [Stage_3.kt](src/bot/Stage_3.kt)

**Example:**

    Hello! My name is Love.
    I was created in 2023.
    Please, remind me your name.
    > Max
    What a great name you have, Max!
    Let me guess your age.
    Enter remainders of dividing your age by 3, 5 and 7.
    > 1
    > 2
    > 1
    Your age is 22; that's a good time to start programming!

## Stage 4/5: Learning numbers
 Everything starts with counting. Shouldn't our bot know that? 😉

In this stage, the bot can count to any positive number the user provides.

Stage implementation: [Stage_4.kt](src/bot/Stage_4.kt)

**Example:**

Hello! My name is Love.
I was created in 2023.
Please, remind me your name.
> Max
What a great name you have, Max!
Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.
> 1
> 2
> 1
Your age is 22; that's a good time to start programming!
Now I will prove to you that I can count to any number you want.
> 5
0!
1!
2!
3!
4!
5!
Completed, have a nice day!

## Stage 5/5: Multiple choice

At the final stage, our bot is improved so that it can give the user a test and check 
their answers. The test should be a multiple-choice
quiz about programming with any number of options.

The bot has will repeat the test until they answer 
correctly and congratulate them upon completion.

Stage implementation: [Stage_5.kt](src/bot/Stage_5.kt)

**Example:**

    Hello! My name is Love.
    I was created in 2023.
    Please, remind me your name.
    > Max
    What a great name you have, Max!
    Let me guess your age.
    Enter remainders of dividing your age by 3, 5 and 7.
    > 1
    > 2
    > 1
    Your age is 22: that's a good time to start programming!
    Now I will prove to you that I can count to any number you want.
    > 3
    0!
    1!
    2!
    3!
    Let's test your programming knowledge.
    Why do we use methods?
    1. To repeat a statement multiple times.
    2. To decompose a program into several small subroutines.
    3. To determine the execution time of a program.
    4. To interrupt the execution of a program.
    > 4
    Please, try again.
    > 2
    Congratulations, have a nice day!




