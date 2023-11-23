package miPrincipal;

public class Rectangulo {
    // Atributos
    private int ancho;
    private int altura;

    public Rectangulo( int ancho, int altura )
    {
        setAncho( ancho );
        setAltura( altura );
    }

    // Metodos set/get
    public void setAncho( int ancho )
    {
        // El ancho debe ser mayor que 0 (cero)
        // Caso contrario, lanzar excepcion tipo RectanguloException
    }

    public void setAltura( int altura )
    {
        // La altura debe ser mayor que 0 (cero)
        // Caso contrario, lanzar excepcion tipo RectanguloException
    }

    public int getAncho()
    {
        return 0;
    }

    public int getAltura()
    {
        return 0;
    }

    // Metodos de instancia
    public int calcularArea()
    {
        return 0;
    }

    // Metodo toString()
    public String toString()
    {
        String resultado = String.format("");
        return resultado;
    }
}