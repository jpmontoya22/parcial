package dominio;

import java.util.List;

public class Pooflix {
    public int CAPACIDAD = 15;
    private List<Material> material;



    public boolean agregarMaterial(Material material){

        if (this.material.size() < 15) {
            this.material.add(material);
            return true;
        }

        return false;

    }
    public boolean retirarMaterial(int codigo){
        Material retirarMaterial = buscar(codigo);
        if (this.material.size() > 0) {
            this.material.remove(material);
            return true;
        }
        return false;
    }

    public Material buscar(String nombre) {
        Material material = null;

        for (Material m: this.material) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                material = m;
                break;
            }
        }

        return material;
    }
    public Material buscar(int codigo) {
        Material material = this.material.stream()
                .filter(m -> m.getCodigo() == codigo)
                .findFirst()
                .orElse(null);

        return material;
    }

    public List<Material> buscarPorTipo(String tipo) {
        Material material = this.material.stream()
                .filter(m -> m.getTipo() == tipo)
                .findFirst()
                .orElse(null);

        return (List<Material>) material;
    }

    public int CalcularDuracionTotal(){
        int duracion = this.material.size();
        int  duracionTotal = 0;
        int cantidad = 0;

        for (Material  material: this.material){
            duracionTotal = duracionTotal + cantidad ;
        }
        return duracionTotal;
    }


}
