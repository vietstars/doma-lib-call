package domacall.model;


import lombok.Data;

import domalib.entity.AccountEntity;

@Data 
public class AccountModel {

	private Long id;

	private String email;

	private String password;

	private String gender;

	private Integer status;
	
	public AccountModel fromDTO(AccountEntity account) {
		setId(account.getId());
		setEmail(account.getEmail());
		setPassword(account.getPassword());
		setGender(account.getGender());
		setStatus(account.getStatus());
		return this;
	}
}