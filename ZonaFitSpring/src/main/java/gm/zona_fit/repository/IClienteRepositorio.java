package gm.zona_fit.repository;

import gm.zona_fit.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//                                clase con la que vamos a trabajar/tipo dato id
public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
