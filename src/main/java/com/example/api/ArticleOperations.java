package com.example.api;

import com.example.dto.ArticleRequest;
import com.example.dto.ArticleResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

public interface ArticleOperations {

    String PREFIX_URI = "/articles";

    @Post
    @Operation(summary = "This method adds a new Article.ID must not be set manually. " +
            "Each Article must have at least a name. A successful request returns the response code 200." )
    // THIS TAG IS MISSING
    @Tag(name = "Article Operations")
    @RequestBody(description = "An Article as Json")
    @ApiResponse(content = @Content(mediaType = MediaType.APPLICATION_JSON,
            schema = @Schema(implementation = ArticleResponse.class)))
    HttpResponse<ArticleResponse> createArticle(@Body ArticleRequest article);

}
