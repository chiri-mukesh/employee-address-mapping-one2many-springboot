package com.rinfotek.springdatajpamappings.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;
//import java.util.ArrayList;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private long empId;
    @Column(name = "emp_Name")
    private String empName;
    @Column(name = "emp_Age")
    private int empAge;
    //address_add_id - default fk column name
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_add_id")
//    private Address address;

    //unidirectional one-to-many
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName = "emp_id")
    private List<Address> address;//for single emp have multiple address



}
