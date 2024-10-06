
package tareasemana08;

/*Escribir un programa en java que permita ingresar la cantidad de personas,nombre
de la persona,sexo. para recojer sus votos que elejiran un partido politico en
la campaña presidencial los partidos son: APRA,PP,APP. Mostrar al final , cuantos 
votantes de sexo masculino y femenino hay, cuantos votos obtuvo cada  partido,
su porcentaje y que partido resulto elegiddo.

NP=5
Italo	m	APRA
Jeyner	m	PP
Gabriel	m	APRA
Luisa   f       APP
Esther  f       APRA

Cantidad de votantes sexo masculino : 3
cantidad de votantes sexo femenino : 2
cantidad de votos APRA: 3
porcentaje equivalente: 60%
cantidad de votos PP:1
porcentaje equivalente: 20%
cantidad de votos APP:1
porcentaje equivalente: 20%
partido elegido : APRA


 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[]args){
        int nv,cv,cvsf=0,cvsm=0,cvAPRA=0,cvAPP=0,cvPP=0;
        double porcAPRA,porcAPP,porcPP;
        String nombrevotante,nombrePartido="",sexo,partidoelegido="";
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de votantes : ");
        nv=lectura.nextInt();
        //proceso
        for (int i = 1; i <=nv; i++) {
            System.out.print("Ingrese el nombre del votante "+i+" : ");
            nombrevotante=lectura.next();
            System.out.print("Ingrese el sexo del votante(m,f) : ");
            sexo=lectura.next();
            System.out.print("Ingrese el partido politico que apoya(APRA,APP,PP) : ");
            nombrePartido=lectura.next();
            
            if (sexo.equals("m")) {
                cvsm++;
                
            } else {
                cvsf++;
            }
            if (nombrePartido.equals("APRA")) {
                cvAPRA++;
            }else if(nombrePartido.equals("APP")){
                cvAPP++;
            }else if(nombrePartido.equals("PP")){
                cvPP++;
            
            }   
        }
                porcAPRA=((double)cvAPRA/nv)*100;
                porcAPP=((double)cvAPP/nv)*100;
                porcPP=((double)cvPP/nv)*100;
                
        if (cvAPRA>cvAPP && cvAPRA>cvPP) {
            partidoelegido="APRA";
        }else if (cvAPP>cvAPRA && cvAPP>cvPP){
            partidoelegido="APP";
        }else if (cvPP>cvAPRA && cvPP>cvAPP){
            partidoelegido="PP";
        }else{
            partidoelegido="EMPATE";
            
        }
              
                
        System.out.println("La cantidad de votantes de sexo masculino es : "+cvsm);
        System.out.println("La cantidad de votantes de sexo femenino es : "+cvsf);
        System.out.println("La cantidad de votos para el partido APRA es : "+cvAPRA);
        System.out.println("El porcentaje obtenido del partido es : "+porcAPRA +"%");
        System.out.println("La cantidad de votos para el partido APP es : "+cvAPP);
        System.out.println("El porcentaje obtenido del partido es : "+porcAPP +"%");
        System.out.println("La cantidad de votos para el partido PP es : "+cvPP);
        System.out.println("El porcentaje obtenido del partido es : "+porcPP +"%");
        System.out.println("El Partido elegido con mayor votos es : "+partidoelegido);
    }
    
}
