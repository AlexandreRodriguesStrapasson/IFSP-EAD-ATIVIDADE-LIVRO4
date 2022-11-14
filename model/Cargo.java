package model;

public class Cargo {
    private int idCargo;
    private String Cargo;

    public Cargo(int idCargo, String cargo) {
        this.idCargo = idCargo;
        Cargo = cargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}
