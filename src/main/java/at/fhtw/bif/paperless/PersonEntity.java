package at.fhtw.bif.paperless;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // getter and setter to string ... deswegen brauche keine getter und setter nicht
@Builder
@NoArgsConstructor
@AllArgsConstructor // jpa
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;



}
