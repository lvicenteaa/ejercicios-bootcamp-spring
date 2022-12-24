package tk.lvicenteaa.ejercicios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tk.lvicenteaa.ejercicios.entities.Laptop;

@Repository
public interface LaptopRepository extends  JpaRepository<Laptop, Long>{

}
