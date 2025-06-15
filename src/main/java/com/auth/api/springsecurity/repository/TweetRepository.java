package com.auth.api.springsecurity.repository;

import com.auth.api.springsecurity.entities.Tweet;
import com.auth.api.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
