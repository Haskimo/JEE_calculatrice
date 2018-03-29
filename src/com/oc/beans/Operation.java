package com.oc.beans;

public class Operation {
	 
    private float nombre1;
    private float nombre2;
    private String operateur;
    private float resultat;
     
    public float getResultat() {
		return resultat;
	}

	public Operation (int nombre1, String operateur, int nombre2) {
        
		this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.operateur = operateur;
               
        switch (operateur)
        {
        	case "+":
        		this.resultat = this.nombre1 + this.nombre2;
        		break; 
        	case "-":
        		this.resultat = this.nombre1 - this.nombre2;
        		break; 
        	case "*":
        		this.resultat = this.nombre1 * this.nombre2;
        		break; 
        	case "/":
        		this.resultat = this.nombre1 / this.nombre2;
        		break; 
        	default: // Normalement ça n'arrive pas
            	this.resultat = -99999999;             
        }
    }

	public String getOperateur() {
		return operateur;
	}

	public float getNombre1() {
		return nombre1;
	}

	public float getNombre2() {
		return nombre2;
	}

}