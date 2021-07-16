package com.observe.friends;
import org.springframework.data.repository.CrudRepository; 
import com.observe.friends.Friend; 

public interface FriendRepository extends CrudRepository<Friend, Integer> { 
} 