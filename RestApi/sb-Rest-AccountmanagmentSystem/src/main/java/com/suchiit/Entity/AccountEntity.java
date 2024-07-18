package com.suchiit.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ACCOUNT")
public class AccountEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="ACC_NAME")
	private String accname;
	
	@Column(name="ACC_BRANCH")
	private String accbranch;
	
	@Column(name="ACC_BALANCE")
	private String accbalance;
	
}
