public class servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    public void activar() {
        if (!this.activo) {
            this.activo = true;
            servidoresActivos++;
        }
    }

    public void desactivar() {
        if (this.activo) {
            this.activo = false;
            servidoresActivos--;
        }
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }

    public void mostrarInformacion() {
        System.out.println("Servidor ID: " + id + " | Nombre: " + nombre + " | IP: " + direccionIP + " | Activo: " + activo);
    }
}
