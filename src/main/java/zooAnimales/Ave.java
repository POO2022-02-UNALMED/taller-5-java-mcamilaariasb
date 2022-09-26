package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado=new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    public static int totalAve;

    public Ave() {
        this(null, 0, null, null, null);
    }  
    
    public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;

        totalAve++;
    }
    
    public static Ave crearHalcon(String nombre, int edad, String genero) {
    	halcones++;
    	totalAve++;
        Ave halcon = new Ave (nombre, edad,"montanas", genero, "cafe glorioso");
        listado.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
    	aguilas++;
    	totalAve++;
        Ave aguila = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
        listado.add(aguila);
        return aguila;
    }

    public int cantidadAves() {
        //return totalAve; 
        return listado.size();
    }

    public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
    public String movimiento() {
    	return "volar";
    }


    
}
