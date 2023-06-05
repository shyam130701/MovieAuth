package com.movie.moviemicroservice.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {

    private Long id;
    private String name;
    private Integer age;

    private String email;

    private String password;
}
