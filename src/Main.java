public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE SERVIDORES ===");

        servidor servidor1 = new servidor("ServidorWeb", "192.168.1.20");
        servidor servidor2 = new servidor("ServidorBD", "192.168.1.21");

        servidor1.mostrarInformacion();
        servidor2.mostrarInformacion();

        System.out.println("\n--- Activando Servidor 1 ---");
        servidor1.activar();
        servidor1.mostrarInformacion();

        servidor1.activar();

        System.out.println("\n--- Activando Servidor 2 ---");
        servidor2.activar();
        servidor2.mostrarInformacion();

        System.out.println("\n[Estado actual]");
        System.out.println("Total servidores: " + servidor.getTotalServidores());
        System.out.println("Servidores activos: " + servidor.getServidoresActivos());

        System.out.println("\n--- Desactivando Servidor 1 ---");
        servidor1.desactivar();
        servidor1.mostrarInformacion();

        System.out.println("\n[Estado final]");
        System.out.println("Total servidores: " + servidor.getTotalServidores());
        System.out.println("Servidores activos: " + servidor.getServidoresActivos());
    }
}