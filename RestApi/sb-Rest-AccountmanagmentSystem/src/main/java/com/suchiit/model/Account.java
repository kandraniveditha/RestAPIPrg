package com.suchiit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private long id;
    private String accname;
	private String accbranch;
	private String accbalance;
}
