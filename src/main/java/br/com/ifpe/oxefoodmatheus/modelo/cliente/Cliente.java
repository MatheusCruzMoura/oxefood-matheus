package br.com.ifpe.oxefoodmatheus.modelo.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodmatheus.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CategoriaProduto")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends EntidadeAuditavel {

	private static final long serialVersionUID = 6577746705401688461L;

	@NotNull
	@Column(nullable = false)
	private String chaveEmpresa;

	@Column
	private String nome;

	@Column
	private String cpf;

	@Column
	private String fone;

	@Column
	private String foneAlternativo;

}
