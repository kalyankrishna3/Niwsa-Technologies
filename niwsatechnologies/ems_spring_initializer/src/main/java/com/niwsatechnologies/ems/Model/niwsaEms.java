package com.niwsatechnologies.ems.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity (name="Niwsa_Employeetable")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class niwsaEms {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long serialID;
    private String empID;
    private String empLastName;
    private String empFirstName;
    private String empEmail;


}
