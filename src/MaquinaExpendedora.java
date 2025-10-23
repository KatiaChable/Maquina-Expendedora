public class MaquinaExpendedora {
    private Impresora impresora;
    private Monedero monedero;

    public MaquinaExpendedora(){
        this.impresora = new Impresora();
        this.monedero = new Monedero();
    }

    public void comprarBillete(int tipoBillete, double precio, double dineroIntroducido) {
         if (!impresora.tieneTinta() || !impresora.tienePapel()) {
            System.out.println("Servicio no disponible");
            monedero.devolverCantidadIntroducida();
            return;
        }
        
        if (dineroIntroducido < precio) {
            System.out.println("Dinero insuficiente");
            monedero.devolverCantidadIntroducida();
            return;
        }
        
        impresora.imprimirBillete(tipoBillete);
        impresora.grabarBandaMagnetica(tipoBillete);
        impresora.expulsarBillete();
        
        double cambio = dineroIntroducido - precio;
        if (cambio > 0) {
            if (monedero.esPosibleSuministrar((int)(cambio * 100))) {
                monedero.suministrar((int)(cambio * 100));
            }
        }
        
        System.out.println("Operación completada exitosamente");
    }
}

    /*private void agregarBilletesIniciales() {
        agregarBillete(1, "Billete Simple", 1.50);
        agregarBillete(2, "Billete Ida y Vuelta", 2.80);
        agregarBillete(3, "Abono Diario", 5.00);    
}

    public void agregarBillete(int tipo, String nombre, double precio) {
        if (cantidadBilletes < billetes.length) {
            billetes[cantidadBilletes] = new Billete(tipo, nombre, precio);
            cantidadBilletes++;
        } 
    }*/
