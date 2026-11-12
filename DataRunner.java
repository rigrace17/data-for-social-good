import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
    
//All file names here
    //Artists
    String artistSet = "artist.txt";
    //Streams
    String streamsSet = "streams.txt";
    //Title
    String titleSet = "title.txt";
    //Popularity
    String popularitySet = "popularity.txt";

    
    //Establishes the start of the program
    UserStory us = new UserStory (artistSet, streamsSet, titleSet, popularitySet);

    //Starting the program
    us.startProgram();
  }
}
