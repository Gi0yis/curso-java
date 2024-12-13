package gm.zona_fit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity // Marca la clase como una entidad
@Data // genera los metodos get y set
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para MySQL se recomienda IDENTITY para el auto incremento
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer menbresia;
}