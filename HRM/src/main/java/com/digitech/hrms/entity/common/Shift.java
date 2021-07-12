package com.digitech.hrms.entity.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="shifts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shift {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private LocalDateTime startTime;

	private  LocalDateTime endTime;
	
	

}
