package scrabble;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScrabbleScoreController {
    @RequestMapping("/score")
    public ScrabbleScore score(@RequestParam(value="word", required=true) String word) {
        return new ScrabbleScore(word);
    }
}