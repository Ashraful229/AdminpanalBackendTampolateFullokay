package com.digitech.hrms.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private EmployeeMaster employeeMaster;

    @OneToOne(cascade = CascadeType.MERGE)
    private Shift shiftId;

    private String status;

    private LocalDate date;

    private LocalDateTime dateTime;

}
