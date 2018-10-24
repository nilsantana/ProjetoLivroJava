/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Nil
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Joana",21,"F");
        p[1] = new Pessoa("Ana",31,"F");
        
        
        l[0] = new Livro("Aprendendo Java","Antonio jarra",300,p[0]);
        l[1] = new Livro("POO para iniciantes","Maria de Fátima",500,p[0]);
        l[2] = new Livro("Java Avançado","Helena Silva",800,p[1]);
        
        System.out.println(l[0].detalhesg());
        
    }
    
}
