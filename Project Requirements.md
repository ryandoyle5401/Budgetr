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
<br>
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
1.  
<strong>Extensions:</strong> Text.  
<strong>Exceptions:</strong> Text.  


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
