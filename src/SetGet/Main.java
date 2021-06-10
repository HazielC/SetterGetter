/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetGet;


public class Main {
    
    
public static void main(String[] args) {    
    
User budi = new User();

budi.setUsername("Budi Santoso");
budi.setPassword("Jln. S Supriadi Blok A No 16");


System.out.println("Nama Ortu: " + budi.getOrtu());
System.out.println("Alamat: " + budi.getAlamat());
    
}
}
