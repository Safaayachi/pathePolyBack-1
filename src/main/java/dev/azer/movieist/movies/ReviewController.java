package dev.azer.movieist.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService service;

    @PostMapping("/{imdbId}")
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload, @PathVariable String imdbId) {

        return new ResponseEntity<Review>(service.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.OK);
    }
    @PutMapping("/admin/{imdbId}")
    public ResponseEntity<Review> updateReview(@RequestBody Map<String, String> updateReview, @PathVariable String imdbId) {
        return new ResponseEntity<Review>(service.updateReview(updateReview.get("reviewBody"), updateReview.get("imdbId")), HttpStatus.OK);
}
    @DeleteMapping("/admin/{imdbId}")
    public void deleteReview(@PathVariable String imdbId) {
        ReviewService.deleteReview(imdbId);
    }



}