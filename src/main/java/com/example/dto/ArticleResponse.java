package com.example.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name="ArticleResponse", description="Article Data")
public class ArticleResponse {

    private Long id;

    private String businessId;

    private Integer version = 1;

    private String name;
}
