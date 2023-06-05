package com.movie.moviemicroservice.repository;

import com.movie.moviemicroservice.model.BookingDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends MongoRepository<BookingDetails,String> {
}
