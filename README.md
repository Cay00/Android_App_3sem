# Mobile Application - Android / Kotlin Project

## Overview
This Android application was developed as part of a programming exercise, following the guidelines provided for a 2025 project. The app incorporates various features to demonstrate practical knowledge in Kotlin, Android development, and modern app architecture (MVVM or MVI). It includes user authentication, local data storage, external cloud integration, and custom features to enhance user experience.

## Features
- **Login & Registration**: The app allows users to register and log in. Upon successful login, the user is redirected to the home screen. If the user is already logged in, the app skips the login screen and goes straight to the home screen using shared preferences.
- **Home Screen**: After login, users are presented with a customizable home screen where they can interact with their data.
- **CRUD Operations**: Users can create, read, update, and delete records, which are stored in a local SQLite database.
- **Cloud Integration**: Firebase or Supabase is used to store user data on the cloud, making it possible to read and write user information across different sessions.
- **Custom Feature**: A custom feature was implemented as per the project's requirements, such as an action that opens a native phone app or launches Google Maps with a preset location.
- **Data Validation**: The app validates user input during login and registration, providing feedback in case of errors (e.g., invalid email).

## Technologies Used
- **Kotlin**: The primary language for Android development.
- **Jetpack Compose**: Used for building the UI with a modern declarative approach.
- **MVVM Architecture**: Implemented to separate concerns and manage the app’s data flow efficiently.
- **SQLite**: Used for local data storage, allowing CRUD operations.
- **Firebase / Supabase**: Integrated for cloud data storage and user authentication.
- **SharedPreferences**: Used to store login state and preferences locally.
- **Android Studio**: The development environment used for building and testing the app.

## Installation
1. Clone the repository: git clone https://github.com/your-username/your-repository.git
2. Open the project in Android Studio.
3. Ensure that you have the Java SDK and Android SDK installed.
4. Build and run the app on an emulator or physical device.

## Contributing
Feel free to open issues or submit pull requests if you'd like to contribute to the project.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
