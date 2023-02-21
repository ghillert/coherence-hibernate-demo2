package com.hillert.coherence.hibernate.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/foo")
public class FooController {

	private final FooRepository fooRepository;
	public FooController(FooRepository repository) {
		this.fooRepository = repository;
	}

	@GetMapping
	public List<Foo> getFoos() {
		return this.fooRepository.findAll();
	}

	@GetMapping("/{id}")
	public Foo getSingleFoo(@PathVariable Long id) {
		return this.fooRepository.findById(id).get();
	}

	@PostMapping
	public Long addFoo(@RequestBody Foo foo) {
		return this.fooRepository.saveAndFlush(foo).getId();
	}
}
