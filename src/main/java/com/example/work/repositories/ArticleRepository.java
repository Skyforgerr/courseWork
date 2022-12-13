package com.example.work.repositories;

import com.example.work.models.Article;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ivan 12.12.2022
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
