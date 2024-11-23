# Chatting Application

This is a simple Android Chat Application developed using **Firebase** and **Kotlin**. It supports user authentication, real-time messaging, and user interface optimization with Jetpack libraries.

## Features

- **User Authentication**: Sign up and log in using Firebase Authentication.
- **Real-Time Chat**: Send and receive messages instantly using Firebase Realtime Database.
- **Edge-to-Edge Display**: Optimized for modern Android UI with WindowInsetsCompat for immersive design.
- **User-Friendly Interface**: Minimal and sleek UI for smooth navigation and interaction.
- **Dynamic User List**: Display all users except the currently logged-in user.
- **Real-Time Updates**: Messages and user data are updated in real time.

## Technologies Used

- **Programming Language**: Kotlin
- **Backend**: Firebase (Authentication & Realtime Database)
- **UI Optimization**: Jetpack (WindowInsetsCompat, Edge-to-Edge display)
- **RecyclerView**: For dynamic list rendering
- **AndroidX**: For modern Android development practices

## Project Structure

- `Login` and `SignUp` Activities: Handle user authentication using Firebase.
- `MainActivity2`: Displays the list of registered users fetched from Firebase.
- `ChatActivity`: Enables real-time messaging between users.
- `UserAdapter`: A RecyclerView adapter for displaying user data dynamically.
- `MessageAdapter`: Manages message display in the chat screen.

## Installation and Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/Utkarsh164/chat-app
