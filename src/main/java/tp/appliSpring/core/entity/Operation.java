package tp.appliSpring.core.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
public class Operation {

	@Id
    private Long numero;
    
    private String label;
    
    private Double montant;
    
    private Date dateOp;
    
    
   // private Compte compte;
    

	public Operation() {
		super();
	}

	public Operation(Long numero, String label, Double montant, Date dateOp) {
		super();
		this.numero = numero;
		this.label = label;
		this.montant = montant;
		this.dateOp = dateOp;
	}

	@Override
	public String toString() {
		return "Operation [numero=" + numero + ", label=" + label + ", montant=" + montant + ", dateOp=" + dateOp + "]";
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public Date getDateOp() {
		return dateOp;
	}

	public void setDateOp(Date dateOp) {
		this.dateOp = dateOp;
	}

    
    
}