package br.edu.uepb.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.uepb.library.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
