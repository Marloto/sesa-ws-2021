package de.thi.inf.sesa.hexa.adapter.api;

import de.thi.inf.sesa.hexa.domain.PostService;
import de.thi.inf.sesa.hexa.domain.model.Comment;
import de.thi.inf.sesa.hexa.ports.inbound.CommentApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CommentApiImpl implements CommentApi {

    @Autowired
    private PostService service;

    @Override
    public Comment commentPost(UUID postRef, String content) {
        return service.createCommentForPost(postRef, content);
    }

    @Override
    public List<Comment> listAll(UUID postRef) {
        return service.listCommentsForPost(postRef);
    }
}
