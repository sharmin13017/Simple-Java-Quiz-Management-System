# Java Quiz Management System

# Project Summary

- Here we have created a project using the Java programming language.
- In the Project System , we can login as an admin and create quiz questions . Or we can login as a student and perticipate in the quiz exam.
- Here No questions will be repeated in the same quiz, that is ensured Prerequisites.

# Prerequisites

- Java Development Kit (JDK) installed
- Java IDE installed

#  Project Description

In this software system, admin can save multiple MCQ with 4 options with their answer key in a quiz.json file. And, when any student logs in to the system, system will tell the student to give MCQ exam from the quiz bank.

If a user logs in by admin credential, system will say the admin user to add new questions to question bank and if any user logs in by student credential, system will say the user to give quiz.

To enable the login feature to your system, create a users.json file where admin user info and student user info will be contained.

<pre>  [ { "username": "admin", "password": "1234", "role": "admin" }, { "username": "salman", "password": "1234", "role": "student" } ]  </pre>


Output:[For admin user]

System:> Enter your username

User:> admin

System:> Enter password

User:> 1234

System:> Welcome admin! Please create new questions in the question bank.

Output:[For student user]

System:> Enter your username

User:> salman

System:> Enter password

User:> 1234

System:> Welcome salman to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' to start.

Your task:

As an admin logged in user, until you press 'q' from keyboard, you can add multiple MCQ. Add atleast 30 questions in quiz bank. The 30 questions must be SQA related questions. For an example:

System:> Input your question

Admin:> Which is not part of system testing?

System: Input option 1:

Admin: Regression Testing

System: Input option 2:

Admin: Sanity Testing

System: Input option 3:

Admin: Load Testing

System: Input option 4:

Admin: Unit Testing

System: What is the answer key?

Admin: 4

System:> Saved successfully! Do you want to add more questions? (press s for start and q for quit)

Here is the example of architecture of quiz.json file.

[

{

"question": "Which is not part of system testing?",
"option 1": "Regression Testing",
"option 2": "Sanity Testing",
"option 3": "Load Testing",
"option 4": "Unit Testing",
"answerkey": 4
},

{

"question": "Which is whitebox testing technique?",
"option 1": "Equivalent Partitioning",
"option 2": "Boundary value testing",
"option 3": "Decision table testing",
"option 4": "Adhoc Testing",
"answerkey": 3
}

]

Now its time to role play as a student. When you login as a student to the system, system will generate 10 random questions from the quiz bank.

Here No questions will be repeated in the same quiz, that is ensured.

Let show an example of output when student will login to the system.

System:> Welcome to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' for start.

Student:> s

_System:> _

[Question 1] Which is not part of system testing?

1. Regression Testing

2. Sanity Testing

3. Load Testing

4. Unit Testing

Student:> 4

[Question 2] Which is whitebox testing technique?

1.Equivalent Partitioning

2. Boundary value testing

3. Decision table testing

4. Adhoc Testing

Student:> 3

In this way, 10 questions will be shown and finally the system will show the result. You will not show the answer from the json. Just match the json file answer key with the user input key. If matches, score should be counted. Otherwise if user input wrong or invalid number from keyboard, it will be considered as 0 mark and generate the next question.

For an example output:

if mark is above 8>= message: Excellent! You have got [marks] out of 10

if mark is above 5>= but less than 8, message: Good. You have got [marks] out of 10

if mark is above 2>= but less than 5, message: Very poor! You have got [marks] out of 10

if mark is 0 or less than 2 message: Very sorry you are failed. You have got [marks] out of 10

Would you like to start again? press s for start or q for quit.

# Project Output Video.

- [Click Here To see the project output video.](https://github.com/user-attachments/assets/19dd1100-ca0f-4d97-9c83-4d3ab33cd7a7)





