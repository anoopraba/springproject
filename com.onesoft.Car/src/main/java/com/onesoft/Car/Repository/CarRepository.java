package com.onesoft.Car.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.Car.Entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer> {


}
