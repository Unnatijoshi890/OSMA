package org.techhub.model;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RegistrationModel {
	private int rId;
	private String name;
	private String Email;
	private String contact;
	private String address;
	private String password;
	private String Role;
}