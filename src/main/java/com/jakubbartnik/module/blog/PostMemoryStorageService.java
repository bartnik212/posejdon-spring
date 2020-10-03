package com.jakubbartnik.module.blog;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Scope
public class PostMemoryStorageService {

    private static final List<PostDto> STORAGE = new ArrayList<>();

    static {
        STORAGE.add(new PostDto("1", "Lorem Ipsum Dolor", "Lorem..."));
        STORAGE.add(new PostDto("2", "Morbi vesram", "Morbi..."));
        STORAGE.add(new PostDto("3", "Vestibulum", "Vestibulum..."));

    }

    public Optional<PostDto> getPost(String uuid) {
        return STORAGE.stream()
                .filter(post -> post.getUuid().equalsIgnoreCase(uuid))
                .findFirst();
    }

    public List<PostDto> getPosts() {
        return STORAGE;
    }

    public PostDto create(String title, String text) {
        PostDto post = new PostDto(title, text);
        STORAGE.add(post);
        return post;
    }
}
