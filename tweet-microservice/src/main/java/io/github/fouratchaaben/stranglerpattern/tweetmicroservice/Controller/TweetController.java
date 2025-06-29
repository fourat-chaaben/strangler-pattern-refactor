package io.github.fouratchaaben.stranglerpattern.tweetmicroservice.Controller;

import io.github.fouratchaaben.stranglerpattern.tweetmicroservice.Tweet;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/tweet")
public class TweetController {

    @PostMapping(value = "/send")
    public String sendTweet(@RequestBody Tweet tweet) {
        return "The tweet is sent";
    }

    @DeleteMapping("/delete")
    public String deleteTweet(@RequestBody Tweet tweet) {
        return "The tweet: \n'''" + tweet.getBody() + "'''\nis deleted";
    }
}
