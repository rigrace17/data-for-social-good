import java.util.Scanner;

public class UserStory {

    //Declaring instance variables
    private String[] artist;
    private String[] title;
    private int[] streams;
    private int[] popularity;

    //String array for title of songs
    private String[] SongNames = {"MILLION DOLLAR BABY", "Not Like Us", "i like the way you kiss me", "Flowers", "Houdini",
    "Lovin On Me", "Beautiful Things", "Gata Only", "Danza Kuduro - Cover", "BAND4BAND (feat. Lil Baby)", 
    "I Had Some Help (feat. Morgan Wallen)", "The Door", "LUNCH", "Like That", "bathroom floor", "LALA", 
    "Fortnight (feat. Post Malone)", "greedy", "BLUE", "As It Was", "Paint The Town Red", "Espresso", 
    "Danza Kuduro - Cover", "TEXAS HOLD 'EM", "Future", "Beat Automotivo Tan Tan Tan Viral", "STAY (with Justin Bieber)",
    "Baby Shark", "we can't be friends (wait for your love)"};

    //String array for the actual artists
    private String[] ArtistNames = {"Tommy Richman", "Kendrick Lamar", "Artemas", "Miley Cyrus", "Eminem", "Jack Harlow",
    "Benson Boone", "FloyyMenor", "MUSIC LAB JPN", "Central Cee", "Post Malone",
    "Teddy Swims", "Billie Eilish", "Future", "Kids With Buns", "Myke Towers",
    "Taylor Swift", "Tate McRae", "Billie Eilish", "Harry Styles", "Doja Cat", "Sabrina Carpenter", "MUSIC LAB JPN", "Beyoncï¿", 
    "official sound studio", "WZ Beat", "The Kid LAROI", "Pinkfong", "Ariana Grande"};

    public UserStory(String artistSet, String streamsSet, String titleSet, String popularitySet) {
      this.artist = FileReader.toStringArray(artistSet);
      this.title = FileReader.toStringArray(titleSet);
      this.streams = FileReader.toIntArray(streamsSet);
      this.popularity = FileReader.toIntArray(popularitySet);
    }

  public String toString() {
    String result = "Example of an Artist: " + "\n";
    for (int i = 0; i < artist.length; i++) {
      result += "ARTIST: " + artist[i] + " 1. Streams: " + streams[i] + "\n";
    }
    return result;
  }
    //The method to start the program
    public void startProgram() {
      Scanner input = new Scanner(System.in);
      boolean running = true;

      while(running) {
        System.out.print("Choose Title or Artist" + "\n" + "--->");
        String choice = input.nextLine();

        if(choice.equals("Title")) {
          start();
          running = shouldContinue();
        } else if (choice.equals("Artist")) {
          initiate();
          running = shouldContinue();
        } else {
          System.out.println("Thats not possible, please try again!");
        }
      }
    }
  
//Asks the user if they want to continue the program
public boolean shouldContinue() {
  Scanner input = new Scanner(System.in);
  while (true) {
    System.out.println("Would you like to continue? (Enter: yes or no)");
    System.out.print("---> ");
    String choice = input.nextLine();

    if (choice.equals("yes")) return true;
    if (choice.equals("no")) return false; 
    System.out.println("Thats not possible, please try again!");
  }
}
    //Dispalys the list of the title of songs 
    public void start() {
      Scanner input = new Scanner(System.in);

      System.out.println("Choose a song to locate their streams: ");
      for (String sn : SongNames) {
        System.out.println("- " + sn);
      
      }

      System.out.print("--->");
      String choice = input.nextLine();

      boolean found = false; 
      for (String sn : SongNames) {
        if (choice.equals(sn)) {
          found = true;
        }
      }

      if (found) {
        System.out.println(numStreams(choice));
      } else {
        System.out.println("That's not possible, please try again!");
      }
    }
  
    //Finds out how many streams a song has
    public String numStreams(String songName) {
      int max = -1;
      String result = "";
      for (int i = 0; i < title.length; i++) {
        if (title[i]. equals(songName)) {
          if (streams[i] > max) {
            max = streams [i];
            result = songName + " has " + max + " Million streams";
            
          }
        }
      }
      return result;
    }
  
  //Sorts popularity by artist
   public void initiate() {
      Scanner input = new Scanner(System.in);

      System.out.println("Type an artsist's name to find their most popular song's fame: ");
      for (String an : ArtistNames) {
        System.out.println("- " + an);
      }

      System.out.print("---> ");
      String choice = input.nextLine();

      boolean found = false;
      for (String an : ArtistNames) {
        if (choice.equals(an)) {
          found = true;
        }
      }

      if(found) {
        System.out.println(numPopularity(choice));
      }else{
        System.out.println("That's not possible, please try again!");
      }
    }
  
    //Finds the highest rated song of an artist
    public String numPopularity(String artistName) {
      int max = -1;
      String topSong = "";

      for (int i = 0; i < artist.length; i++) {

        if (artist[i].equals(artistName)) {
          if (popularity[i] > max) {
          max = popularity[i];
          topSong = title[i];
        }
      }
    }
    return artistName + "'s most popular song is: " + topSong + " with " + max + " popularity.";
}
}
