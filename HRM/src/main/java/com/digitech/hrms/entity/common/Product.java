package com.digitech.hrms.entity.common;


import com.digitech.hrms.entity.acl.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String name;

    private  String address;

    @OneToOne(cascade = CascadeType.MERGE)
    private User headOfProduct;

    @ManyToOne(fetch = FetchType.EAGER)
    private OperatingUnit operatingUnit;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<Department>departments;
}
