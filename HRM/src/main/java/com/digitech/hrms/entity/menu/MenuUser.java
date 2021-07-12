package com.digitech.hrms.entity.menu;


import com.digitech.hrms.entity.acl.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MenuUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    //user
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    //menu
    @ManyToOne
    private Menu menu;
}
