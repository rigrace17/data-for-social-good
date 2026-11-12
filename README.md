# Unit 3 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story 

As a music listener, I want to search for songs by their title or artist and compare their streams and popularity so that I can discover which songs and artists are most popular on Spotify.

## Dataset 

Dataset: (https://www.kaggle.com/datasets/nelgiriyewithana/most-streamed-spotify-songs-2024)
- **Artist** (String) - stage name/name of the artist
- **Title** (String) - title of song 
- **Streams** (int) - number of streams (in millions, no commas allowed)
- **Popularity** (int) - ranking of 0-100 on how popular the song is

## UML Diagram 

![UML Diagram for my project](nameOfImageFileHere.png) 

## Description 

For our Unit 3 Project (Data for Social Good), my partner and I used our previous knowledge of 1D Arrays and different information we picked up over the past semester. For our user story, our "user": **As a music listener, I want to search for songs by their title or artist and compare their streams and popularity so that I can discover which songs and artists are most popular on Spotify.** First, we searched up a data set on Kaggle that would satisfy our user. Even though it's a few years old, we thought the artists were still incredibly modern, and many songs from the data set are ones most people still listen to today. It shows information like aritst, title, streams, popularity, and much more information that we chose not to include. Our project contains the classes: DataRunner, UserStory, artist title, popularity, and streams. Our UML Diagram showcases all the methods we used within our program, as well as the instance variables for each class established. We used multiple scanner methods so the user could input artist, title, etc and the program would print out information based on what the user needed. All in all, now our user can search up artists or titles and come back with information pertaining to them.
