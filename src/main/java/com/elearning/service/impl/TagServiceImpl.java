package com.elearning.service.impl;

import com.elearning.model.Tag;
import com.elearning.repository.TagRepository;
import com.elearning.service.TagService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

import static com.elearning.constant.Constant.*;

@Service
@Slf4j
@Transactional
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Boolean createTags(List<Tag> tags) {
        Iterable<Tag> iterable = tagRepository.saveAll(tags);
        if(iterable.spliterator().getExactSizeIfKnown() > 0) {
            return CREATED;
        }
        return NOT_CREATED;
    }

    @Override
    public Set<Tag> getTags() {
        return (Set<Tag>) tagRepository.findAll();
    }

    @Override
    public Boolean deleteTag(int id, String tagName) {
        return tagRepository.deleteByIdAndTagName(id, tagName);
    }

    @Override
    public Boolean editTag(Tag tag) {
        Tag updated = tagRepository.save(tag);
        if(updated != null) {
            return UPDATED;
        }
        return FAILED_UPDATE;
    }
}
