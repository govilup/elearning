package com.elearning.controller;

import com.elearning.model.Tag;
import com.elearning.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/tags")
public class TagsController {

    @Autowired
    private TagService tagService;

    @PostMapping
    public ResponseEntity<String> createTag(@RequestBody List<Tag> tags) {
        if(tags == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please check the request.");
        }

        Boolean isCreated = tagService.createTags(tags);
        if(isCreated) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Tags Created");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Issue");
    }

    @GetMapping
    public ResponseEntity<Set<Tag>> getTags(@RequestBody List<Integer> ids) {
        if(ids == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }

        Set<Tag> tags = tagService.getTags(ids);
        if(tags != null) {
            return ResponseEntity.ok(tags);
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<String> editTag(@RequestBody Tag tag) {
        if(tag == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please check the request.");
        }

        Boolean isUpdated = tagService.editTag(tag);
        if(isUpdated) {
            return ResponseEntity.ok().body("Tag Updated");
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Issue");
    }

    @DeleteMapping("/{id}/{name}")
    public ResponseEntity<String> createTag(@PathVariable Integer id, @PathVariable String name) {
        if(id == null || name.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please check the request.");
        }

        Boolean isDeleted = tagService.deleteTag(id, name);
        if(isDeleted) {
            return ResponseEntity.ok().body("Tag Deleted " + name);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Issue");
    }

}
