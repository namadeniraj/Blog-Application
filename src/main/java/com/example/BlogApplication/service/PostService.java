package com.example.BlogApplication.service;

import com.example.BlogApplication.entity.Post;
import com.example.BlogApplication.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;

	public Optional<Post> getById(Long id) {
		return postRepository.findById(id);
	}

	public List<Post> getAll() {
		return postRepository.findAll();
	}

	public Post save(Post post) {
		if (post.getId() == null) {
			post.setCreatedAt(LocalDateTime.now());
		}
		post.setUpdatedAt(LocalDateTime.now());
		return postRepository.save(post);
	}

	public void delete(Post post) {
		postRepository.delete(post);
	}

}

