package Principal;

import Controller.AutomotoraController;
import Model.Automotora;
import Vista.MenuInicio;

public class Main {
    public static void main(String[] args) {
        Automotora automotora= new Automotora();
        automotora= AutomotoraController.cargaMasivaDatos(automotora);
        MenuInicio ventana= new MenuInicio(automotora);
    }
}