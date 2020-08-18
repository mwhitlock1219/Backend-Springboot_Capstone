package com.tts.stream.controller;

import java.util.Optional;

import com.tts.stream.model.Movie;
import com.tts.stream.model.MovieResponse;
import com.tts.stream.model.User;
import com.tts.stream.repository.UserRepository;
import com.tts.stream.service.MovieService;
import com.tts.stream.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)

public class WatchListController {

    @Autowired
    public UserService userService;

    @Autowired
    public UserRepository userRepository;

    // @GetMapping("/user")
    // @ResponseBody
    // public void pullMovieToWatchList(@RequestParam(name = "userId") Long userId)
    // {
    // System.out.println(userId);
    // // Optional<User> user = userRepository.findById(Long.parseLong(userId));
    // // User currentUser = user.get();
    // // String currentWatchList = currentUser.getWatchList();
    // // return currentWatchList;
    // }

    @PostMapping("/watchlist")
    public void addMovieToWatchlist(@RequestBody MovieResponse package1) {
        Optional<User> user = userRepository.findById(Long.parseLong(package1.getUserId()));
        User currentUser = user.get();
        // System.out.println(currentUser);
        if (currentUser.getWatchList() == null) {
            currentUser.setWatchList(package1.getMovieId());
            System.out.println(currentUser.getWatchList());
            userRepository.save(currentUser);
        } else {
            String watchList = currentUser.getWatchList();
            String[] whatever = watchList.split(" ", -1);
            Boolean alreadyInHere = false;
            for (int i = 0; i < whatever.length; i++) {
                if (whatever[i].equals(package1.getMovieId())) {
                    alreadyInHere = true;
                    System.out.println(alreadyInHere);
                }
            }
            if (!alreadyInHere) {
                currentUser.setWatchList(currentUser.getWatchList() + " " + package1.getMovieId());
                userRepository.save(currentUser);
            }
        }
        System.out.println(currentUser.getWatchList());
    }

}
