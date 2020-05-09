package com.example.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name="ArticleRequest", description="Dto to create or update an Article")
public class ArticleRequest {
    private String name;
}
