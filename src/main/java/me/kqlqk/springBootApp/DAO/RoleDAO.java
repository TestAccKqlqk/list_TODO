package me.kqlqk.springBootApp.DAO;

import me.kqlqk.springBootApp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
    Role getById(long id);
}
