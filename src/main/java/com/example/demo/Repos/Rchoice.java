package com.example.demo.Repos;

import com.example.demo.TableEntities.Choices;
import com.example.demo.TableEntities.Quiz;
import org.springframework.data.repository.CrudRepository;

public interface Rchoice extends CrudRepository<Choices,Integer> {
}
