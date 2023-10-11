# <p style="text-align: center;">Requirements</p>

## Team Info & Policies
<strong>Team Members:</strong>
1. Ryan Doyle
1. Josh Delva
1. David Weisman
1. Jahidul Robin
1. Mit Patel

<strong>GitHub:</strong>
Repo [link](https://github.com/ryandoyle5401/Budgetr.git)

<strong>Roles:</strong>
- UI Designer/Frontend - Ryan
- Backend - Josh, Mit
- Database - David, Robin

<strong>Communication:</strong>
We will implement multiple resources for communication, including a group chat, Discord calls,
and in-person meetings. The group chat is the quickest and most convenient way for members to
instantly communicate with everyone in the group. With Discord, we can benefit from remote
communication, including both voice calls and screen sharing. In-person meetings will be used
whenever possible to discuss any updates, issues, or ideas regarding the project. As a team,
we aim to stay in frequent contact, ideally every day or every other day.  
<br>
## Product Description
Budgetr is a financial management application that will allow users to create and customize
their own budget, monitor their expenses among user-created categories such as “Entertainment” 
or “Food,” and organize their overall financial portfolio. The application will have an intuitive 
graphical user interface to allow for easy navigation throughout the app. Additionally, the app
will allow users to easily create and customize a budget to their liking by creating or deleting
categories for expenses and setting limits on said categories. Moreover, users can get a much better
understanding of their spending habits by viewing the built-in Pie Chart that shows all expense 
categories together broken down into fractional pie slices.

<strong>4 Major Features:</strong>
1. Customizable Budget Plan
1. GUI
1. Personal Account Creation
1. Spending Recommendations

<strong>2 Stretch Features:</strong>
1. A 'Recent Activity' pane that automatically updates when expenses are added
1. Notifications of too much spending

## Use Cases
<strong>Creating an expense category to track</strong>  
<strong>Actor:</strong> A user wanting to add something to their budget.  
<strong>Trigger:</strong> A user wants to expand their expense portfolio for more accurate financial
tracking.  
<strong>Precondition:</strong> The user spends money on something and needs to categorize it in their
budget.  
<strong>Postcondition:</strong> Adding the expense to the budget/expense portfolio for tracking.  
<strong>List of steps:</strong> 
1. Press a button to create a new expense,
1. give the category a name e.g., “Food,”
1. user enters how much they have spent so far,
1. enter the maximum amount they want to spend for this category,
1. press a button to add the category to the budget. 
 
<strong>Extension:</strong>
1. If the user decides not to add the category, they can delete it before
adding the category to their budget.  
 
<strong>Exceptions:</strong> 
1. When entering the amount of money they have spent, the user may enter 
something non-numeric.  

<strong>Account creation</strong>  
<strong>Actor:</strong> New user to the app.  
<strong>Triggers:</strong> A user wishes to start using Budgetr to manage their finances.  
<strong>Preconditions:</strong> The user has downloaded the Budgetr app and has a valid email address
or phone number they wish to use for registration.  
<strong>Postconditions:</strong> The user has successfully created an account with Budgetr, and the user
is automatically logged into their new account and is directed to an introductory or dashboard page.  
<strong>List of steps:</strong> 
1. User clicks on the “Register” or “Sign Up” button.
1. User is then prompted to provide essential details such as name, email or phone number, password.
1. Afterwards, the user sets up security questions or provides additional details if needed.
1. Then the user agrees to the terms of service and privacy policy.
1. Finally, user clicks the final “Create Account” button and a welcome message or introductory guide
appears to help them navigate the initial setup.  

<strong>Extensions:</strong> 
1. User can choose to link a social media or Google account for quicker sign-up.  
1. Then the user can choose to implement two-factor authentication.  
1. Lastly, they can choose a quick tour of the app is made after account creation.  

<strong>Exceptions:</strong> 
1. The provided email address or phone number is already in use.  
1. Password does not meet the specified criteria.  
1. An interruption occurs during account creation due to server or computer issues.
1. User does not agree to the terms of service or privacy policy.

<strong>Viewing Chart/Diagram:</strong>  
<strong>Actor:</strong> User  
<strong>Triggers:</strong> The user wants to see a visualization of all their expenses.    
<strong>Preconditions:</strong> The user has accurately entered all expenses but hasn’t seen how 
all the expenses combine together.  
<strong>Postconditions:</strong> The user gets a visualization of what percentage of their money went
toward each and every category they created.   
<strong>List of steps:</strong>
1. User clicks on the button to view a chart/diagram.
1. Then the user selects which type of diagram they want to use.

<strong>Extensions:</strong> 
1. If the user wants to switch to another diagram, they can select another diagram to view.

<strong>Exceptions:</strong> 
1. The user may not have entered any expenses, so the diagrams won't be able to display what the user
has spent on.


<strong>Querying the Database:</strong>  
<strong>Actor:</strong> Budgetr application  
<strong>Triggers:</strong> When the user creates an account or logs in, that information will be stored and
retrieved from a database.  
<strong>Preconditions:</strong> User is in the process of setting up their account or they are typing in their
credentials to their account.  
<strong>Postconditions:</strong> The database either stores the information the user entered during the account
creation process, or the information is retrieved from the database.  
<strong>List of steps:</strong> 
1. The user either enters information to create an account, or they enter their login info.  
1. When the user presses the "Finish Creating Account" or "Login" button, this will query the database.  
1. The database will either store the new information, or it will retrieve all information from the user who just
logged in. 
 
<strong>Extensions:</strong> 
1. When creating an account, the database will check if an account with that information already exists.

<strong>Exceptions:</strong>
1. The connection between the application and the database can be interrupted, causing data storage or retrieval
to fail.


<strong>Spending Notifications:</strong>
<strong>Actor:</strong> Budgetr application  
<strong>Triggers:</strong>   When the app detects the user entering an amount of money spent on an expense category
is at or above the threshold set by the user.  
<strong>Preconditions:</strong> A user has not spent all or more money from the allotted amount they set aside for
a specific category of expenses.   
<strong>Postconditions:</strong> A user reaches or exceeds their limit set aside for a specific category of expenses.  
<strong>List of steps:</strong> 
1. User enters a value of money spent that reaches or exceeds their limit in their budget.
1. Code triggers application to send a notification to the user.  
<strong>Extensions:</strong>
1. Every time a user updates how much money they have spent on something, the program will check the total value
   against their set limit.  
<strong>Exceptions:</strong>
1. User may enter an erroneous amount leading to a false notification.  


## Non-functional Requirements
<strong>Security & Privacy:</strong> User data, especially financial, should be encrypted and securely
stored. Ensure GDPR or other relevant privacy regulations are adhered to.

## External Requirements
<strong>Cloud Hosting:</strong> Cloud hosting can be used for storing all relevant data.
<strong>Payment Gateway:</strong> Payment gateway can be introduced if premium features or in-app purchases
are added to the application.


## Team Process Description:
<strong>Software toolset:</strong> Kotlin, Android Studio IDE, Git/GitHub. We picked to use Kotlin as the
programming language because we want to make a mobile application, and Kotlin is primarily used with Android
Studio to develop mobile apps for Android devices. For the IDE, we chose Android Studio because it supports
Kotlin and has many built-in features to assist in making an Android application. To assist with code
development, we will be using functions of Git to make development with team members more organized, and
we will use GitHub to remotely store our code, making access to source code easier.

<strong>Define and justify each team member’s role:</strong>
- UI Designer/Frontend: This role is important because the application will be a mobile app with a graphical
user interface, so, the user interface should be designed to be intuitive and effective. Ryan is suited for 
the role because he has worked on projects with GUIs in the past.
- Backend: Backend is vital for this project because the frontend is only one-half of the whole application. 
The backend will make sure all the processes the buttons on the frontend work as intended. Josh and Mit are good 
for this role because they are interested in researching and creating a functional backend.
- Database: With users being able to create their own accounts, it is critical to store the associated information
with the account in a database. David and Robin are best suited for this role because they have had the most experience
with working with a database.  

<strong>Provide a schedule for each member/subgroup:</strong>
- UI Designer/Frontend:
1. Design frontend with all buttons, labels, textboxes, etc. by Sept. 18th
1. Implement all buttons, labels, textboxes, etc. as code by early to mid-October
1. Test the design/functionality and readjust as necessary by beginning of November
1. Work on graphics/charts for users to view toward the end of November

- Backend:
1.	Design and implement functions to create the functionality of the buttons by end of September
1.	Test/debug the functions by mid-October
1.	Successfully send data to database for storage by early to mid-November
1.	Successfully retrieve and display information from the database by end of November

- Database:
1. Work on user account creation until end of September
1. Work on storing the information sent from the application by mid-October
1. Work on successfully retrieving the information and sending it to the application by early November
1. Work on allowing multiple accounts to be created by end of November

<strong>Major Risks:</strong>
The three major risks would be graph implementation, user friendly interface, and using a new programing language. 
Implementing a graph can be difficult, especially to get it accurately lined up with the expense tracking database. 
Additionally, creating a user-friendly app for mobile devices could be tricky with getting all the proper components into
place. Lastly, using a new programming language might cause some confusion in the process, as no one is familiar with this
programming language.

<strong>Describe at what point external feedback would be most useful and how to get that feedback:</strong>
Once we have our UI design up and running, we can then ask fellow classmates, friends, or family to test out our design
implementation and give feedback on their preference and criticism. Doing so can give us a better idea of how to properly
proceed with our application.

## Software Architecture
<strong>Major Software Components:</strong>  
- Kotlin Programming Language
- Firebase Database

<strong>Interface Between Components:</strong>  
The interface between Kotlin and the Firebase database will be a Kotlin class. Within this class we plan on having code that allows our program to both write data to the database and have data sent from the database to the program. With this in place, we should be able to store any new data the user enters and retrieve any data they have previously entered.

<strong>Data the System Stores:</strong>  
This system should store information from the user's profile like their first name, last name, email address, phone number password, and any answers they provide to security questions. Additionally, the system will store their settings like their expense categories, their expenses (in dollar amounts), their set limits (in dollar amounts). Both this data and the user's profile information will all be stored in a database.  

<strong>Alternatives:</strong>  
An alternative to using Kotlin as our primary programming language, we could use Java as an alternative to develop an Android app.  
Java Pros:  
- More documentation
- More examples/programs created that use Java
- We as a team have more experience using Java

Java Cons:  
- More cumbersome compared to Kotlin
- Becoming more of an outdated language
- Less features compared to Kotlin e.g. type inference

One alternative to the Firebase database would be Microsoft Azure  
Azure Pros:  
- More features, like ease in scaling for larger projects
- More free storage
- Good analytical tools

Azure Cons:  
- Unlike Firebase, Azure was not created by Google, so, Azure doesn't integrate with android apps in Android Studio as easily.
- Access is through a Microsoft account, whereas Firebase uses Google/Gmail account
- Setup with Azure isn't as simple and easy as it is with Firebase

## Software Design
<strong>Kotlin:</strong>  
Kotlin is a cross-platform, high-level programming language that is interoperable with Java. Kotlin compiles to Java bytecode and uses the Java Virtual Machine to run its code.

<strong>Firebase:</strong>
## Coding Guidelines
<strong>Kotlin Style Guide:</strong>  
Link to the official [Kotlin Style Guide](https://developer.android.com/kotlin/style-guide)  
Link to the official [KDoc documentation](https://kotlinlang.org/docs/kotlin-doc.html)  
Link to the official [KDoc Dokka tool documentation](https://kotlinlang.org/docs/dokka-introduction.html)  
<strong>Why we chose this style and documentation:</strong>  
We chose this style and documentation because it's the style and documentation on the Android Developer and Kotlin website, so we figured it would be best to use what is recommeneded by those who develop Android apps and those who wrote the programming language.  
<strong>How we plan to enforce this:</strong>  
We plan on enforcing this by having the guides linked within the GitHub repo, and all members will need to look over the guides. This way, if any member ever has a question about how to format something, they can easily refer to the guides to try and find an answer.  

### Risk Assessment  
Risks:
1. Communication with database
2. Communication between frontend and backend
3. Saving/Accessing different user's settings and info
4. Displaying data graphically and accurately
5. ???

#### Communication with Database:
<strong>Likelihood of occurring:</strong>  
medium  
<strong>Impact if it occurs:</strong>  
high  
<strong>Evidence:</strong>  
We believe the likelihood of this occurring is medium because we’ve never used Firebase with Android Studio, and the impact would be high because if we can’t store/retrieve data, we can’t have a functioning app.  
<strong>Steps to reduce likelihood/impact and improve estimates:</strong>  
We plan on reducing the likelihood of something like this from happening by utilizing resources on the Firebase website, Android Studio website, and any other sites that have information on getting Firebase and an Android Studio project to communicate with each other. To improve our estimates of the likelihood and the impact, we believe reviewing the resources to get the program and the database to communicate will increase our knowledge and experience with Firebase and Android Studio.  
<strong>Plan for detecting problem:</strong>  
To detect the problem, we can create simple tests. For example, we can create test data in the program, send it to the database, and then check the database to see if the data was successfully sent. Then we can add test data to the database and pull that from the database into the project and see if we get the test data.  
<strong>Mitigation Plan:</strong>  
If this issue arises and can’t be resolved in a timely manner, we may have to store data within the app itself.  

#### Communication between Frontend/Backend:
<strong>Likelihood of occurring:</strong>  
low  
<strong>Impact if it occurs:</strong>  
high  
<strong>Evidence:</strong>  
In terms of the likelihood of this occurring, we believe this would be ranked as low. We say this because, for example, if there is a button on the screen (frontend), within the code there should also be an action listener, so when the user presses the button, code within the action listener should execute (backend). Regarding the impact on the app if this issue were to occur, it would be detrimental because any interactions the user has with the frontend wouldn’t be communicated to the backend. This means any input the user enters doesn’t produce any output, which defeats the purpose of the app.  
<strong>Steps to reduce likelihood/impact and improve estimates:</strong>  
To reduce the likelihood of this issue occurring, we will make sure that every frontend component the user interacts with, like textboxes and buttons, will have action listeners attached to them that run the appropriate code when it detects an action. In order to improve our estimates, we will test out all frontend components with some dummy backend code to make sure the frontend component calls the dummy backend code when activated.    
<strong>Plan for detecting problem:</strong>  
Simply running the app, interacting with the app, and analyzing the output should be sufficient enough to determine if the frontend is successfully communicating with the backend of the app.  
<strong>Mitigation Plan:</strong>  
To help mitigate this, we plan on making sure every part of the frontend of the app that the user can interact with has corresponding code to execute when the user does interact with that component. We will test this out to make sure that the code that’s supposed to run runs, even if it may produce an error, as long as it runs, everything should be fine.  

#### Saving/Accessing different user's settings and info:
<strong>Likelihood of occurring:</strong>  
low  
<strong>Impact if it occurs:</strong>  
high  
<strong>Evidence:</strong>  
In terms of the likelihood of this occurring, we believe this would be ranked as low. We say this because, for example, if there is a button on the screen (frontend), within the code there should also be an action listener, so when the user presses the button, code within the action listener should execute (backend). Regarding the impact on the app if this issue were to occur, it would be detrimental because any interactions the user has with the frontend wouldn’t be communicated to the backend. This means any input the user enters doesn’t produce any output, which defeats the purpose of the app. 
<strong>Steps to reduce likelihood/impact and improve estimates:</strong>  
To reduce the likelihood of this issue occurring, we will make sure that every frontend component the user interacts with, like textboxes and buttons, will have action listeners attached to them that run the appropriate code when it detects an action. In order to improve our estimates, we will test out all frontend components with some dummy backend code to make sure the frontend component calls the dummy backend code when activated.    
<strong>Plan for detecting problem:</strong>  
Simply running the app, interacting with the app, and analyzing the output should be sufficient enough to determine if the frontend is successfully communicating with the backend of the app.  
<strong>Mitigation Plan:</strong>  

#### Displaying data graphically and accurately:
<strong>Likelihood of occurring:</strong>  
 Medium
<strong>Impact if it occurs:</strong>  
high
<strong>Evidence:</strong>  
We assert that this is a medium because it can be difficult to accurately display graphical data. If the data is inaccurately displayed, it can be difficult for consumers to keep track of their expenses.
<strong>Steps to reduce likelihood/impact and improve estimates:</strong>  
  
<strong>Plan for detecting problem:</strong>  
 
<strong>Mitigation Plan:</strong>  

#### ???:
<strong>Likelihood of occurring:</strong>  
  
<strong>Impact if it occurs:</strong>  
  
<strong>Evidence:</strong>  
  
<strong>Steps to reduce likelihood/impact and improve estimates:</strong>  
  
<strong>Plan for detecting problem:</strong>  
  
<strong>Mitigation Plan:</strong> 
