package com.elearning.service;

import com.elearning.model.Tag;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TagServiceImpl implements TagService {


    @Override
    public Boolean createTags(List<Tag> tags) {
        return null;
    }

    @Override
    public Set<Tag> getTags(List<Integer> tagId) {
        return null;
    }

    @Override
    public Boolean deleteTag(int id, String tagName) {
        return null;
    }

    @Override
    public Boolean editTag(Tag tag) {
        return null;
    }
}
