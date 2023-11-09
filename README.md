# Budgetr - Customizable Budget Planning App


## Table of Contents

- [Introduction](#introduction)

-  [Installation](#installation)
	-  [Java](#JavaInstallation)
	- [Android Studio](#androidstudio)

-  [Configuration](#configuration)

- [Usage](#usage)
	- [Operational Use Cases](#operational)

- [Features](#features)

- [Getting Started](#GettingStarted)
	- [Important Info About Our App's Configuration](#ImportantInfo)
	- [Cloning the Project](#cloning)
	- [Building the Project](#building)
	- [Testing the Project](#testing)
	- [Using the App](#UsingTheApp)

- [Customization](#customization)

## Introduction

Budgetr is a user-friendly budget planning application designed to help you manage your finances with ease. Whether you're saving for a big purchase, paying off debt, or simply trying to gain better control of your money, Budgetr can help you achieve your financial goals.

With Budgetr, you can create and customize your budget plan according to your specific needs and financial goals. Track your income, expenses, and savings effortlessly, and gain valuable insights into your spending habits.

## Installation
Note: If you don't have Java JDK version 17 or higher, start at Java Installation step 1. Otherwise, go to Android Studio Installation step 1.
### Java Installation
1. Download JDK version 17 or higher from the [Oracle](https://www.oracle.com/java/technologies/downloads/) website
2. Once downloaded, double-click the installer and follow the installation steps
3. In File Explorer, navigate to where the JDK installed and locate the JDK's "bin" folder and copy this file path. Do not close File Explorer.
4. Now on Windows, in the Search box at the bottom-left corner, enter "Edit the system environment variables."
5. Press the "Environment Variables..." button at the bottom-right of the System Properties page
6. On the Environment Variables page go to the System variables list, click on "Path," then click on "Edit..."
7. Click on the blank line underneath the very last file path in the list and paste the JDK's bin file path there, then close the window by clicking "OK"
8. Back on the Environment Variables page, if you do not have a variable named "JAVA_HOME" in the User Variables list, go back to File Explorer and navigate to the "jdk-<version_number>" file and copy this file path
9. Back on the Environment Variables page, click "New" on the User Variables list
10. For the "Variable name" text field, enter JAVA_HOME
11. For the "Variable value" text field, paste the jdk-<version_number> file path, then click OK
12. After that, click OK on the Environment Variables page, then click OK on the System Properties page

### Android Studio Installation
1. To download the latest version of Android Studio, go to [Android Studio](https://developer.android.com/studio) website and select the download for your operating system
2. Once the download finishes, double-click the installer file and follow the steps in the Android Studio Setup.
3. After the Android Studio Setup finishes, Android Studio will automatically open with the Android Studio Setup Wizard
4. Select the Standard setup for Android Studio
5. Accept the Current Settings and License Agreements
6. After this, Android Studio will automatically download all necessary components. This will take a few minutes.

## Configuration
Our project uses X plugins: Dokka, Firebase

## Usage

Budgetr is designed to be intuitive and user-friendly. Here's a quick overview of how to use the app:

1. **Create Your Budget:**

   - Start by setting up your budget by entering your income, expenses, and savings goals.

2. **Track Your Expenses:**

   - Log your expenses regularly and categorize them using predefined or custom categories.

3. **Monitor Your Progress:**

   - Keep an eye on your financial health with visual reports and charts.

4. **Notifications:**

   - Become notified when you are exceeding your spending limit(s).

5. **Adjust as Needed:**

   - Modify your budget as your financial situation changes, and your goals evolve.

### Operational Use Cases
1. Creating an expense category
The expense category allows the user to create custom categories for different expenses they may have. For example, a user can create the category "Food" and enter all expenses related to food for the app to track.
2. Bar Chart
The bar chart is for the user to get a visualization of their spending. The chart uses the information from the user's categories, such as the category name and money spent, to display this info alongside other categories.

## Features

- **Customizable Budget Plans:** Tailor your budget to match your unique financial situation and goals.

- **Expense Tracking:** Easily log and categorize your expenses to keep tabs on your spending.

- **Income Management:** Record your income sources and view your overall financial picture.

- **Savings Goals:** Set and monitor savings goals to achieve your financial objectives.

- **Visual Reports:** Gain insights through visual charts and reports to make informed financial decisions.

- **Expense Categories:** Pre-defined categories and the ability to add custom categories for accurate tracking.

- **Notifications:** Receive notifications of too much spending.

- **Secure Data:** Your financial data is securely stored and protected.

## Getting Started
### Important Info About Our App's Configuration
- Android Studio version: Android Studio Giraffe version 2022.3.1 Patch 2
- Android Gradle Plugin Version: 8.1.2
- Gradle Version: 8.0
- Gradle JDK version: jbr-17 JetBrains Runtime version 17.0.6
- Kotlin Compiler version: 1.8.10
- Kotlin version: 1.9.0
- Dokka Gradle Plugin version: 1.9.10
- Jetpack Compose version: 1.3.2
- build.gradle (:app) compileSdk: 34
-  build.gradle (:app) minSdk: 28
-  build.gradle (:app) targetSdk: 34
-  build.gradle (:app) sourceCompatibility: JavaVersion.VERSION_17
-  build.gradle (:app) targetCompatibility: JavaVersion.VERSION_17
- build.gradle (:app) jvmTarget: 17
### Cloning the Project
1. Open up Android Studio. When the "Welcome to Android Studio" screen appears, click on "Get from VCS"
2. Copy the URL from the Budgetr GitHub repository and paste it into the "URL:"" text field, then click "Clone"
3. The project should start downloading and open automatically. Note: if a Windows Security Alert window pops up when the app opens, click "Allow access"

### Building the Project
1. With the project opened, in the menu bar at the top, click Build -> Make Project to allow Gradle to automatically build the project

### Testing the Project
1. In Android Studio, open a terminal
2. For Windows, enter "gradlew.bat test". For Mac or Linux, use ""./gradlew test". This command executes all tests in the project
3. To see the results, in File Explorer, navigate to the location where Budgetr is stored. From there go to app/build/reports/tests/testDebugUnitTest/index.html to view the test result HTML page

### Using the App

## Customization

Budgetr is all about flexibility. Here's how you can customize your budget plan:

- **Categories:** Add, edit, or delete expense categories to match your spending habits.

- **Income Sources:** Record all sources of income, including salaries, side hustles, and investments.

- **Budget Goals:** Set specific goals for different aspects of your financial life, such as an emergency fund or vacation savings.

- **Timeframes:** Adjust the timeframe of your budget, whether it's monthly, quarterly, or yearly.

---

Thank you for choosing Budgetr to help you manage your finances. We hope this app makes budgeting easy and effective for you. If you have any questions or encounter any issues, please don't hesitate to contact us. Happy budgeting!
