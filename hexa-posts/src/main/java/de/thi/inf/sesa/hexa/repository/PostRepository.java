package de.thi.inf.sesa.hexa.repository;

import org.springframework.data.repository.CrudRepository;

import de.thi.inf.sesa.hexa.model.Post;

import java.util.UUID;

public interface PostRepository extends CrudRepository<Post, UUID> {
}
