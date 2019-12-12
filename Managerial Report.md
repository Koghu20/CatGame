###

###

###

### FUNDAMENTALS OF PROGRAMMING

### (WIX1002)

### ASSIGNMENT MANAGERIAL REPORT

###

###

###

###

PROJECT TITLE           : CATS-ARE-AWESOME

LECTURER NAME         : PROFESOR MADYA DR. NOR BADRUL ANUAR BIN JUMA&#39;AT

###

| NAME                  | MATRIC NUMBER |
| --------------------- | ------------- |
| KAMAL KUMAR           |               |
| KOGHULAN RAJAMANICKAM | WIC190018     |
| MEHDI PIROUZIAN       | WIC190707     |
| JASSPER LAWRENCE      | WIC 190015    |
| GORI SAMEER           | WIC190704     |

#
## Formation of the Team

We were asked to form our own team and the team was formed within the students of the tutorial class. We then elected the leader for our team , which was Kamal Kumar named our team Nova Gang.  We were then asked to register our team in the github and asked to fill in the google form. We then get to pick our own assignment project. After much consideration , we choose project 3, which is Cats-Are-Awesome.

#
## Role and assigned work for each of the member

There were 6 main requirement of the program.  These 6 requirements were split equally among 5 members of the team while taking the weightage of the each task into consideration. All members gave their 100 %

6 Main Requirements

-  authentication
-  adding the cat
-  playing with the cat
-  feed the cat
-  chatting with the cat
-  levelling up the cat .

**Assigning work**

| Kamal ( Leader) | Designing and programming of class shop and eat.Main Compiler |
| --------------- | ------------------------------------------------------------ |
| Mehdi           | Designing  and programming the class game.                   |
| Jasper          | Designing and programming of class talk                      |
| Koghulan        | Designing the calculation of levelling up and aging          |
| Sameer          | Designing and programming the authentication                 |

All members gave their 100% to make this project a success.





#
## Project timeline

Week 1

Assigning work to group member

- group discussion was held between the group members to assign the work to each member.
- The main objective of the project was identified and discussed among the members .
-  The main requirements of the project was then discussed and work was assigned to each members.

Week 2

Researching about the project

- Share the outcome of the individual research on given tasks.
- Give opinions on how to improve the presentation of each task

Week 3

Planning phase and making the individual part

- More detailed planning was done in this week such as the connection between each tasks, how to connect with each others individual tasks .
- Started coding the given tasks

Week 4

Compiling the authentication panel with the home panel

- Started compiling our project. T
- Compiled authentication with the main home screen of the game.

Week 5

Compiling the main home with the talk function , and the food function

- Added the earlier compiled part with the talk with the cat function and feed the cat function. It was rather a smooth compiling process than the earlier week as the functions were more properly coded and we learned more about the JFrame along the process.





Week 6

Compiling the main home with the game and the levelling up feature. Adding the extra feature (unique cat attribute

- Added the play with cat feature and the levelling up the cat feature to the main program.
- We then added the aging the cat feature

Week 7

- We tried to fix the bugs and improve the quality of our GUI.
- Improved our game from console to GUI.
- We compiled the last program.









#
## Problem faced in accomplising this assingment and solution

We encountered so many problems while compiling the program altogether as all of were new to JFrame. But through teamwork, we managed to overcome all the problems as all of our suggestion were taken into consideration and we all present at the meetings although our was already done or not needed that day.

1. The first problem we faced was when we try to compile the authentication panel with the home panel. When we compiled it, the program ran without any error but we found out that the program unable to identify each user and its saved cat attributes when the user log in into the game. In the acc\_creation.java class we had the cat name but not the username or password of the user. In order to solve this problem ,we passed the username and password as arguments in the acc\_creation class constructor.

1. Secondly, The next problem was when we tried to randomize the cat for each player. There were 4 cats and we wanted to give each player a different cat randomly. When we tried to implement it in our game, there was initially an error on writing the randomized cat information to the user saved file. It took some time, but we finally managed to solve the problem

1. Our team faced difficulties such as calling the JApplet. When the player click the &quot;Play&quot; button , it should be prompted to open the game but due to the difference in class([java-Jframe, Game.java-JApplet](http://Home.java-Jframe,Game.java-JApplet)) calling the JApplet class from a JFrame class posed a problem. Hence , the approach we took to curb this problem is to create a JApplet object in the JFrame form and adding all its components in the JFrame class .

4. Another problem we faced is multiple JOptionPane statements appearing when only one should appear at a time. The hunger and happiness does in fact decrement after a given time interval but for an unknown reason it does not show in that given time but instead multiple statements get called at one given instant or so we thought. The approach we took was to reorder the JOptionPane statements and setting a random counter so that only one JOptionPane statement is executed at a given time and it managed to help solve this problem.
5. Lastly, , one of the most frequent errors or exception we encountered during the progress of our assignment is the NullPointerException . In context to the project ,we had to save multiple cat class objects for multiple accounts and we tried using binary files which had the same name as the user&#39;s cat name . Doing so gave a NullPointerException when we attempted to open the file in Netbeans because the file can only be accessed if we have the Cat name of the user saved.Furthermore, we were not able to track which user was active or playing the game. Due to that , we came up with the solution of creating another text file called &quot;active.txt&quot; which stores and saves the user&#39;s cat name . By doing this , it not only reads the users cat class object but is also capable of discerning whether the cat has met its demise due to hunger or aging and also allow the user not to log in into the game once he has done it already.