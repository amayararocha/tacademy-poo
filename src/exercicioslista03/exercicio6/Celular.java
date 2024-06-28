package exercicioslista03.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Celular {
    // Atributos
    private String marca;
    private String modelo;
    private int armazenamento; // em GB
    private List<String> aplicativosInstalados;

    // Construtor
    public Celular(String marca, String modelo, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.aplicativosInstalados = new ArrayList<>();
    }

    // Getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public List<String> getAplicativosInstalados() {
        return aplicativosInstalados;
    }

    public void setAplicativosInstalados(List<String> aplicativosInstalados) {
        this.aplicativosInstalados = aplicativosInstalados;
    }

    // Método para instalar um aplicativo
    public void instalarAplicativo(String aplicativo) {
        aplicativosInstalados.add(aplicativo);
        System.out.println("Aplicativo " + aplicativo + " instalado com sucesso.");
    }

    // Método para exibir as informações do celular
    public void exibirInformacoes() {
        System.out.println("---------------------------");
        System.out.println("Informações do Celular:");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Armazenamento: " + getArmazenamento() + " GB");
        if (aplicativosInstalados.isEmpty()) {
            System.out.println("Aplicativos Instalados: Nenhum aplicativo instalado.");
        } else {
            System.out.println("Aplicativos Instalados: " + String.join(", ", getAplicativosInstalados()));
        }
        System.out.println("---------------------------");
    }
}
