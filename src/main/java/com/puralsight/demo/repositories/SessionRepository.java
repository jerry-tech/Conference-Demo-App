/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puralsight.demo.repositories;

import com.puralsight.demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author HP
 */
public interface SessionRepository extends JpaRepository<Session, Long>{
   
}
