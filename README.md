# CS-320-Software-Testing-Automation-and-Quality-Assurance
Project Overview

This repository contains selected work from my CS 320 course at Southern New Hampshire University. The projects focused on developing Java services, creating automated unit tests with JUnit, and evaluating software quality through requirements-based testing.

For Project One, I developed and tested contact management functionality, including adding, updating, and deleting contact records. For Project Two, I completed a summary and reflections report examining my testing approach, its effectiveness, and areas for improvement.

Reflection

How can I ensure that my code, program, or software is functional and secure?

I can ensure software is functional and secure by following requirements, writing thorough unit tests, and checking how the program handles both valid and invalid inputs. During this course, I used JUnit to test field restrictions, duplicate IDs, and service operations. These tests helped me identify potential errors and confirm that the program behaved as expected. I also learned that testing should continue as code changes because new updates can introduce unexpected problems. In future projects, I would combine unit testing with code reviews, dependency scanning, and additional security testing to improve reliability and protect user information.

How do I interpret user needs and incorporate them into a program?

I interpret user needs by reviewing the project requirements and identifying the functions and restrictions the software must support. In the contact service project, users needed a way to create, update, and delete contact information while maintaining accurate records. I translated these needs into validation rules, such as limiting field lengths and preventing duplicate contact IDs. I then developed tests to confirm that each requirement was met. This experience taught me that understanding user expectations before coding helps prevent errors and reduces unnecessary changes later.

How do I approach designing software?

My approach to software design begins with understanding the problem, identifying requirements, and organizing the program into manageable components. I prefer keeping responsibilities separate so the code is easier to understand, test, and maintain. In Project One, I used separate classes for contact information and contact management, along with dedicated JUnit test classes. This structure allowed me to test individual functions and identify issues without affecting unrelated parts of the application. Moving forward, I plan to continue using modular design, clear naming conventions, and automated testing throughout development.
