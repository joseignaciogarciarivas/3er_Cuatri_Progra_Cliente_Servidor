package gestordevehiculos.model;

public class Motor {

    private int cilindros;
    private TiposCombustible combustible;

    public Motor() {

    }

    public Motor(int cilindros, TiposCombustible combustible) {
        this.cilindros = cilindros;
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motor{");
        sb.append("cilindros=").append(cilindros);
        sb.append(", combustible=").append(combustible);
        sb.append('}');
        return sb.toString();
    }

}
