package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private static ArrayList<Zona> zonas=new ArrayList<Zona>();
   
    public Zoologico() {
    	this(null, null);
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }
    public void agregarZonas(Zona zona) {
    	zonas.add(zona);
    }
	
	public int cantidadTotalAnimales() {
		int total = 0;
		for(Zona zona :zonas) {
			total += zona.cantidadAnimales();
		}
		return total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zonas;
	}

	public static void setZona(ArrayList<Zona> zonas) {
		Zoologico.zonas = zonas;
	}
}