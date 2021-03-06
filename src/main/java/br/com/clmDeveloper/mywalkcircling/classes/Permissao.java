package br.com.clmDeveloper.mywalkcircling.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Permissao implements GrantedAuthority {
	
	private static final long serialVersionUID = 7719618879298057805L;

	@Id
	@SequenceGenerator(name="perm_seq",sequenceName="perm_seq", allocationSize=1)
	@GeneratedValue(generator="perm_seq",
			strategy = GenerationType.SEQUENCE)
	private Long codigo;
	
	@Column(length=30, nullable=false)
	private String authority;
	

	@Override
	public String getAuthority() {
		return this.authority;
	}


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}

	
}
