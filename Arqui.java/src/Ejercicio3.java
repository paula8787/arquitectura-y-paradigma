class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) throws FondosInsuficientesException {
        if (monto > saldo) {
            throw new FondosInsuficientesException("Error: Fondos insuficientes. Saldo disponible: " + saldo);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Paula", 500.0);

        try {
            cuenta.mostrarSaldo();
            cuenta.retirar(600.0); 
        } catch (FondosInsuficientesException e) {
            System.out.println(e.getMessage());
        }

        cuenta.mostrarSaldo();
    }
}

