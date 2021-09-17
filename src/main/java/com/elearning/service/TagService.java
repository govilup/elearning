package com.elearning.service;

import com.elearning.model.Tag;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface TagService {

    Boolean createTags(List<Tag> tags);

    Set<Tag> getTags();

    Boolean deleteTag(int id, String tagName);

    Boolean editTag(Tag tag);
}
