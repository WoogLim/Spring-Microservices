import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// 이 인터페이스는 Spring Data JPA에서 JPA 리포지토리 역할을 합니다.
// JpaRepository 인터페이스를 상속받아 기본적인 CRUD (Create, Read, Update, Delete)
// 및 페이징 기능을 제공합니다. 제네릭 타입으로 엔티티 클래스 (Customer)와
// 그 기본 키의 타입 (Long)을 명시합니다.
// 이 인터페이스는 구현 클래스 없이도 Spring에 의해 자동으로 빈(bean)으로 등록되어,
// 데이터베이스 작업을 수행할 수 있습니다.
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}