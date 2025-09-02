package IntegracionBackFront.backfront.Repositories.UserType;

import IntegracionBackFront.backfront.Entities.UserType.UserTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository extends JpaRepository<UserTypeEntity, Long> {

}
