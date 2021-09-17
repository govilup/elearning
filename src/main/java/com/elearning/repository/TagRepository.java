package com.elearning.repository;

import com.elearning.model.Tag;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends CrudRepository<Tag, Integer> {

    boolean deleteByIdAndTagName(int id, String tagName);
}
