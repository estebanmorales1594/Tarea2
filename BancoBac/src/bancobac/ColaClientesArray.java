package bancobac;


public class ColaClientesArray {
    
    ArrayList2 discapacitados = new ArrayList2();
    ArrayList2 adultomayor = new ArrayList2();
    ArrayList2 embarazada = new ArrayList2();
    ArrayList2 corporativo = new ArrayList2();
    ArrayList2 normal = new ArrayList2();
    
    ArrayList2 discapacitadoscomp = new ArrayList2();
    ArrayList2 adultomayorcomp = new ArrayList2();
    ArrayList2 embarazadacomp = new ArrayList2();
    ArrayList2 corporativocomp = new ArrayList2();
    ArrayList2 normalcomp = new ArrayList2();

    ArrayList2 subdiscapacitados = new ArrayList2();
    ArrayList2 subadultomayor = new ArrayList2();
    ArrayList2 subembarazada = new ArrayList2();
    ArrayList2 subcorporativo = new ArrayList2();
    ArrayList2 subnormal = new ArrayList2();
  
    public ColaClientesArray(String nombre, String tipo, String correo, String hora, String fecha) throws Exception{
        
    if (tipo == "discapacitado"){
        
        subdiscapacitados.add(nombre);
        subdiscapacitados.add(correo);
        subdiscapacitados.add(tipo);
        subdiscapacitados.add(fecha);
        subdiscapacitados.add(hora);

        discapacitados.add( subdiscapacitados );
        discapacitadoscomp.add(subdiscapacitados);
}              
}
    public static void main(String[] args) throws Exception{
        ColaClientesArray Cola;
        Cola = new ColaClientesArray("fgdgd", "fsfsfs", "afefesfe", "fsefsef", "ewfwefwe");
        //String Elem1 = Cola.discapacitados.getElemento(0);
        //System.out.print(Elem1);
        String Elem2 = Cola.subdiscapacitados.getElemento(0);
        System.out.print(Elem2);
    }
}
