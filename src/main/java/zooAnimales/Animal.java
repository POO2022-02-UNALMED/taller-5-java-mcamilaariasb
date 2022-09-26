package zooAnimales;

import gestion.*;

public class Animal {
    private static int totalAnimales=0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
   
    public Animal() {
        this(null, 0, null, null);
    }   

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public static int getTotalAnimales() {
        return totalAnimales;
    }

    public static void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }
    public static String totalPorTipo() {
    	return "Mamiferos: " + Mamifero.totalMamifero + "\n" +
    			"Aves: " + Ave.totalAve + "\n" +
    			"Reptiles: " + Reptil.totalReptil+ "\n" +
    			"Peces: " + Pez.totalPez + "\n" +
    			"Anfibios: " + Anfibio.totalAnfibio;		
    }
    public String movimiento() {
    	return "desplazarse";
    }
    @Override
    public String toString(){
        if (this.zona==null){
            return "Mi nombre es "+ getNombre()+
                    ", tengo una edad de "+getEdad()+
                    ", habito en " +getHabitat()+
                    " y mi genero es " +getGenero();
        }
        else{
            return "Mi nombre es "+getNombre()+
                        ", tengo una edad de "+getEdad()+
                        ", habito en " +getHabitat()+
                        " y mi genero es " +getGenero()+
                        ", la zona en la que me ubico es "+zona.getNombre()+
                        ", en el "+zona.getZoo().getNombre();
        }
    }
    
}