package com.hillert.coherence.hibernate.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gunnar Hillert
 *
 */
@Repository
public interface FooRepository extends JpaRepository<Foo, Long> {

}