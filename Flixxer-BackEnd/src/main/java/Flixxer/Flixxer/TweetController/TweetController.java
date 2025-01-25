package Flixxer.Flixxer.TweetController;



import Flixxer.Flixxer.TweetTestPojo.Tweet;
import Flixxer.Flixxer.TweetTestPojo.TweetResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TweetController {

    @GetMapping("/getTweet")
    public TweetResponse getTweet(@RequestParam(required = false) String movieId){
       // List<Tweet> dummyTweets = new ArrayList<>();
        System.out.println("movieId: " + movieId);
        TweetResponse tweetResponse;


        if (movieId.isEmpty()) {
            tweetResponse = new TweetResponse();
            tweetResponse.setTweets(fetchAllTweets());
        } else {
            tweetResponse = new TweetResponse();
            tweetResponse.setMovieId(movieId);
            tweetResponse.setTweets(fetchTweetsByMovieId(movieId));
        }

        return tweetResponse;

    }


    private List<Tweet> fetchTweetsByMovieId(String movieId){
        List<Tweet> tweetList = new ArrayList<>();
       switch (movieId) {
           case "24":    //DIE HARD -------- MOVIES PAGE
               Tweet tweet = new Tweet();
               tweet.setUserId("Deepti");
               tweet.setTweet("What more is there to say than #DieHard is brilliant and so is Bruce Willis. \uD83E\uDD29\uD83D\uDC4F");
               tweetList.add(tweet);

               Tweet tweet1 = new Tweet();
               tweet1.setUserId("Alyssa");
               tweet1.setTweet("Yes I think I consider this a christmas movie as I first saw it as a kid around xmas!!\uD83D\uDE44\uD83E\uDD28");
               tweetList.add(tweet1);

               Tweet tweet2 = new Tweet();
               tweet2.setUserId("Ronald");
               tweet2.setTweet("Die Hard is the best Christmas movie of all time! #DieHard \uD83C\uDF85\uD83C\uDF84");
               tweetList.add(tweet2);

               Tweet tweet3 = new Tweet();
               tweet3.setUserId("Ulas");
               tweet3.setTweet("Die Hard is not a Christmas movie. It's an the best action movie of all times!!\uD83D\uDE44\uD83E\uDD28\uD83D\uDE24!!");
               tweetList.add(tweet3);

               Tweet tweet4 = new Tweet();
               tweet4.setUserId("Cassie");
               tweet4.setTweet("Die Hard is a Christmas movie!!!\uD83C\uDF85\uD83C\uDF84\uD83D\uDE0E\uD83C\uDF84 It takes place during Christmas #DieHard!!");
               tweetList.add(tweet4);


               return tweetList;


           case "25":    //TOY STORY
               Tweet tweet12 = new Tweet();
               tweet12.setUserId("Kris");
               tweet12.setTweet("This is a very clever animated story that was a big hit. \uD83D\uDC4F");
               tweetList.add(tweet12);

               Tweet tweet13 = new Tweet();
               tweet13.setUserId("Dan");
               tweet13.setTweet("Great comedies are hard to come by - Toy Story strikes gold on that basis alone!! \uD83D\uDC4F");
               tweetList.add(tweet13);

               Tweet tweet14 = new Tweet();
               tweet14.setUserId("Cassie");
               tweet14.setTweet("Toy Story is by far the best Disney film ever made,\uD83D\uDC4F \uD83D\uDE0Dit's pretty much perfect. It's adventurous, it's exciting, it's entertaining, it's good for the whole family, it's got great characters, story, and plot, and above all, it's fun.❤\uFE0F");
               tweetList.add(tweet14);

               Tweet tweet15 = new Tweet();
               tweet15.setUserId("Ronald");
               tweet15.setTweet("The animation is extraordinary in it's ability to bring such great entertainment to the screen.\uD83D\uDCAF\uD83D\uDE4C");
               tweetList.add(tweet15);

               return tweetList;

           case "26":    //TOY STORY 2
               Tweet tweet16 = new Tweet();
               tweet16.setUserId("Deepti");
               tweet16.setTweet("This is a very clever animated story that was a big hit. \uD83D\uDC4F");
               tweetList.add(tweet16);

               Tweet tweet17 = new Tweet();
               tweet17.setUserId("Al");
               tweet17.setTweet("Great comedies are hard to come by - Toy Story strikes gold on that basis alone!! \uD83D\uDC4F");
               tweetList.add(tweet17);

               Tweet tweet18 = new Tweet();
               tweet18.setUserId("Cassie");
               tweet18.setTweet("Toy Story is by far the best Disney film ever made,\uD83D\uDC4F \uD83D\uDE0Dit's pretty much perfect. It's adventurous, it's exciting, it's entertaining, it's good for the whole family, it's got great characters, story, and plot, and above all, it's fun.❤\uFE0F");
               tweetList.add(tweet18);

               Tweet tweet19 = new Tweet();
               tweet19.setUserId("Ulas");
               tweet19.setTweet("The animation is extraordinary in it's ability to bring such great entertainment to the screen.\uD83D\uDCAF\uD83D\uDE4C");
               tweetList.add(tweet19);

               return tweetList;


           case "27":    //Toy Story 3
               Tweet tweet20 = new Tweet();
               tweet20.setUserId("Kris");
               tweet20.setTweet("This is a very clever animated story that was a big hit. \uD83D\uDC4F");
               tweetList.add(tweet20);

               Tweet tweet21 = new Tweet();
               tweet21.setUserId("Dan");
               tweet21.setTweet("Great comedies are hard to come by - Toy Story strikes gold on that basis alone!! \uD83D\uDC4F");
               tweetList.add(tweet21);

               Tweet tweet22 = new Tweet();
               tweet22.setUserId("Cassie");
               tweet22.setTweet("Toy Story is by far the best Disney film ever made,\uD83D\uDC4F \uD83D\uDE0Dit's pretty much perfect. It's adventurous, it's exciting, it's entertaining, it's good for the whole family, it's got great characters, story, and plot, and above all, it's fun.❤\uFE0F");
               tweetList.add(tweet22);

               Tweet tweet23 = new Tweet();
               tweet23.setUserId("Ronald");
               tweet23.setTweet("The animation is extraordinary in it's ability to bring such great entertainment to the screen.\uD83D\uDCAF\uD83D\uDE4C");
               tweetList.add(tweet23);

               return tweetList;

           case "33":    //Interstellar
               Tweet tweet24 = new Tweet();
               tweet24.setUserId("Greg");
               tweet24.setTweet("In #Interstellar, if you didn’t understand the physics, try Kip Thorne’s highly readable Bbook “The Science of Interstellar \uD83D\uDE05.");
               tweetList.add(tweet24);

               Tweet tweet25 = new Tweet();
               tweet25.setUserId("Cooper");
               tweet25.setTweet("We used to look up at the sky and wonder at our place in the stars. Now we just look down, and worry about our place in the dirt !! ");
               tweetList.add(tweet25);

               Tweet tweet26 = new Tweet();
               tweet26.setUserId("Noah");
               tweet26.setTweet("I definitely think it's more ambitious than Gravity from a story perspective, but it's far, far messier. #Interstellar \uD83E\uDD2F\uD83E\uDD2F");
               tweetList.add(tweet26);

               Tweet tweet27 = new Tweet();
               tweet27.setUserId("David");
               tweet27.setTweet("In #Interstellar, if you didn’t understand the plot, there is no published book to help you \uD83D\uDE05.");
               tweetList.add(tweet27);

               return tweetList;


           case "28":    //Elf
               Tweet tweet28 = new Tweet();
               tweet28.setUserId("Kris");
               tweet28.setTweet("This is a very clever animated story that was a big hit. \uD83D\uDC4F");
               tweetList.add(tweet28);

               Tweet tweet29 = new Tweet();
               tweet29.setUserId("Dan");
               tweet29.setTweet("Great comedies are hard to come by - Toy Story strikes gold on that basis alone!! \uD83D\uDC4F");
               tweetList.add(tweet29);

               Tweet tweet30 = new Tweet();
               tweet30.setUserId("Cassie");
               tweet30.setTweet("Toy Story is by far the best Disney film ever made,\uD83D\uDC4F \uD83D\uDE0Dit's pretty much perfect. It's adventurous, it's exciting, it's entertaining, it's good for the whole family, it's got great characters, story, and plot, and above all, it's fun.❤\uFE0F");
               tweetList.add(tweet30);

               Tweet tweet31 = new Tweet();
               tweet31.setUserId("Ronald");
               tweet31.setTweet("The animation is extraordinary in it's ability to bring such great entertainment to the screen.\uD83D\uDCAF\uD83D\uDE4C");
               tweetList.add(tweet31);

               return tweetList;


       }
        return tweetList;
    }



    private List<Tweet> fetchAllTweets(){
        List<Tweet> allTweets = new ArrayList<>();

        Tweet tweet3 = new Tweet();
        tweet3.setUserId("Deepti");
        tweet3.setTweet("Here’s a developer moment we’ve all had: spent hours debugging, only to realize it was a missing semicolon..\uD83D\uDE4C\uD83D\uDE4C \uD83D\uDE05\uD83D\uDE05!!");
        allTweets.add(tweet3);
        Tweet tweet4 = new Tweet();
        tweet4.setUserId("Kris");
        tweet4.setTweet("People don't know what they want until you show them - Steve Jobs   #HotTakes \uD83E\uDDE0");
        allTweets.add(tweet4);
        Tweet tweet1 = new Tweet();
        tweet1.setUserId("Ronald");
        tweet1.setTweet("There’s so much buzz around AI-generated code, no-code tools, blockchain \uD83D\uDC40\uD83E\uDDE0. I’m curious: do you see this as the future of development, or just a passing trend? ");
        allTweets.add(tweet1);
        Tweet tweet2 = new Tweet();
        tweet2.setUserId("Alyssa");
        tweet2.setTweet("There’s nothing quite like the thrill of creating something from scratch  \uD83D\uDE0E");
        allTweets.add(tweet2);



        return allTweets;
    }

    @PostMapping("/saveTweet")
    public Tweet saveTweet(@RequestBody Tweet tweet, @RequestParam(required = false) String movieId){
    System.out.println("SaveTweet was called : " + tweet);
    return tweet;

    }


    @GetMapping("/getHashtagSuggestions")
    public List<String> getHashtagSuggestions(@RequestParam String term) {
        List<String> hashTagList = new ArrayList<>();
        hashTagList.add("DieHardIsAChristmasMovie");
        hashTagList.add("DieHardForever");
        hashTagList.add("DieHardFan");
        hashTagList.add("DieHard");
        hashTagList.add("NewYear2025");
        hashTagList.add("Zipped");
        hashTagList.add("ToyStory");
        hashTagList.add("PercussionMusic");
        hashTagList.add("Goodbye2024");
        hashTagList.add("ZipZap");
        hashTagList.add("ZipcodeRocks!!");

        List<String> matchHashtagList = hashTagList.stream()
                .filter(s -> s.toLowerCase().startsWith(term.toLowerCase()))
                .toList();

        return matchHashtagList;

    }


}
