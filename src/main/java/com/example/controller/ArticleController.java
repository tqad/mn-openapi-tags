package com.example.controller;


import com.example.api.ArticleOperations;
import com.example.dto.ArticleRequest;
import com.example.dto.ArticleResponse;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller(ArticleOperations.PREFIX_URI)
public class ArticleController implements ArticleOperations {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleController.class);
    public static final String OBJECT_NOT_FOUND = "Object Not Found";

    // the tags annotation is missing, because i want the inherited
    @Override
    public HttpResponse<ArticleResponse> createArticle(ArticleRequest article) {
        LOGGER.info("Attempt to create article {} .", article.getName());
        return null;
    }
}
