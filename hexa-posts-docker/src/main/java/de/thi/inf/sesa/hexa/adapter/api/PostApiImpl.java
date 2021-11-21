package de.thi.inf.sesa.hexa.adapter.api;

import de.thi.inf.sesa.hexa.domain.model.Post;
import de.thi.inf.sesa.hexa.domain.PostService;
import de.thi.inf.sesa.hexa.domain.model.UserReference;
import de.thi.inf.sesa.hexa.ports.inbound.PostApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PostApiImpl implements PostApi {
    @Autowired
    private PostService service;

    @Override
    public Post createPost(String title, String content, UserReference userRef) {
        return service.createPost(title, content, userRef);
    }

    @Override
    public List<Post> listNewestPost() {
        return service.listNewestPost();
    }

    @Override
    public Post findPost(UUID postRef) {
        return service.findPost(postRef);
    }

    @Override
    public long countPosts() {
        return service.countPosts();
    }
}
