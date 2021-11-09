package de.thi.inf.sesa.hexa.ports.inbound;

import de.thi.inf.sesa.hexa.domain.model.Comment;

import java.util.List;
import java.util.UUID;

public interface CommentApi {
    Comment commentPost(UUID postRef, String content);
    List<Comment> listAll(UUID postRef);
}
