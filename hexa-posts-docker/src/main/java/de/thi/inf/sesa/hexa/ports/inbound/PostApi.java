package de.thi.inf.sesa.hexa.ports.inbound;

import de.thi.inf.sesa.hexa.domain.model.Post;
import de.thi.inf.sesa.hexa.domain.model.UserReference;

import java.util.List;
import java.util.UUID;

public interface PostApi {
    Post createPost(String title, String content, UserReference userRef);
    List<Post> listNewestPost();
    Post findPost(UUID postRef);
    long countPosts();
}
