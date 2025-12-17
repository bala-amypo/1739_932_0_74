package.com.example.demo.entity;
import jakarta.persistance.Entity;
@Entity

public class StudentEntity{

    @id
    @GeneratedValue(strategy=GeneratedType.INDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;
}
