package by.sam_solutions.grigorieva.olga.backend.service.database;

import by.sam_solutions.grigorieva.olga.backend.entity.Role;
import by.sam_solutions.grigorieva.olga.backend.repository.role.RoleRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DatabaseInitService {

    @Bean
    public ApplicationRunner initializer(RoleRepository roleRepository) {
        Role admin = new Role();
        admin.setRoleName("ADMIN");
        Role user = new Role();
        user.setRoleName("USER");

        if (roleRepository.findByName("ADMIN") == null) roleRepository.create(admin);
        if (roleRepository.findByName("USER") == null) roleRepository.create(user);

        return args -> { };
    }
}
