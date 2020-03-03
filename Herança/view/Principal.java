package view;

import negocio.Aluno;
import negocio.Professor;

public class Principal {

	public static void main(String[] args) {

		Aluno objAluno1 = new Aluno("Rubens");
		System.out.println(objAluno1.saudar());
		
		Aluno objAluno2 = new Aluno("Lara");
		System.out.println(objAluno2.saudar());

		Professor objProfessor1 = new Professor ("Rubens Lara");
		System.out.println(objProfessor1.saudar("Dr."));

	}

}
