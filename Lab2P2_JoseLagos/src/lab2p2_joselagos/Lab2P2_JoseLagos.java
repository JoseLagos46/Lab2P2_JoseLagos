package lab2p2_joselagos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab2P2_JoseLagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        Computadoras compu = new Computadoras();

        int inicio = 0;

        while (inicio == 0) {

            System.out.print("\nMENU\n"
                    + "1. Crear\n"
                    + "2. Listar\n"
                    + "3. Modificar\n"
                    + "4. Eliminar\n"
                    + "5. Salir\n"
                    + "Ingrese su opcion: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("\nCreacion de Computadoras");
                    System.out.print("Ingrese el modelo de la computadora: ");
                    String modelo = leer.next();
                    System.out.print("Ingrese el numero de serie: ");
                    int serie = leer.nextInt();
                    System.out.print("Ingrese la capacidad del disco duro: ");
                    int capacidad = leer.nextInt();
                    System.out.print("Ingrese el tamaño de la pantalla: ");
                    int pantalla = leer.nextInt();
                    System.out.print("Tiene teclado numerico? [s/n]: ");
                    char aux = leer.next().toLowerCase().charAt(0);
                    boolean teclado = true;
                    if (aux == 's') {
                        teclado = true;
                    } else if (aux == 'n') {
                        teclado = false;
                    }
                    System.out.print("Ingrese el tipo de procesador: ");
                    String procesador = leer.next();

                    System.out.print("Ingrese el numero del tipo de tarjeta grafica:\n1. Normal\n2. Gamer\nIngrese su opcion: ");
                    int auxiliar = leer.nextInt();

                    String tarjeta = "";
                    if (auxiliar == 1) {
                        tarjeta += "Normal";
                    } else if (auxiliar == 2) {
                        tarjeta += "Gamer";
                    }
                    System.out.print("Ingrese el Sistema Operativo por defecto:\n1. Windows\n2. ChromeOS\nIngrese opcion: ");
                    int auxiliar2 = leer.nextInt();
                    String SO = "";
                    if (auxiliar2 == 1) {
                        SO += "Windows";
                    } else if (auxiliar2 == 2) {
                        SO += "ChromeOS";
                    }
                    System.out.print("Ingrese las horas de fabrica: ");
                    int horas = leer.nextInt();
                    System.out.print("Ingrese la capacidad de la bateria: ");
                    int mili = leer.nextInt();
                    System.out.print("Ingrese la duracion de la bateria: ");
                    int duracion = leer.nextInt();

                    lista.add(new Computadoras(modelo, serie, capacidad, pantalla, teclado, procesador, tarjeta, SO, horas, mili, duracion));
                    break;

                }
                case 2: {
                    System.out.println("\nListado");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i) instanceof Computadoras) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }

                    System.out.println("\nInforme de Computadoras Gamer:");
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Computadoras) lista.get(i)).getTarjeta().equals("Gamer") && ((Computadoras) lista.get(i)).getPantalla() > 17 && ((Computadoras) lista.get(i)).isTeclado() == true) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }

                    System.out.println("\nInforme de Computadoras Educativas:");
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Computadoras) lista.get(i)).getCapacidad() < 300 && ((Computadoras) lista.get(i)).getSO().equals("ChromeOS") && ((Computadoras) lista.get(i)).getPantalla() < 13) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }

                    System.out.println("\nInforme de Computadoras de Poco Uso:");
                    for (int i = 0; i < lista.size(); i++) {
                        if (((Computadoras) lista.get(i)).getHoras() > 2 && ((Computadoras) lista.get(i)).getDuracion() < 1 && ((Computadoras) lista.get(i)).getSO().equals("Windows")) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("\nModificar");
                    System.out.print("Ingrese el numero de serie de la computadora que desea modificar: ");
                    int modificar = leer.nextInt();

                    for (int i = 0; i < lista.size(); i++) {
                        if (((Computadoras) lista.get(i)).getSerie() == modificar) {
                            System.out.print("Ingrese lo que desea modificar\n"
                                    + "1. Modelo\n"
                                    + "2. Capacidad de Disco duro\n"
                                    + "3. Tamaño de Pantalla\n"
                                    + "4. Teclado numerico\n"
                                    + "5. Tipo de procesador\n"
                                    + "6. Tarjeta grafica\n"
                                    + "7. Sistema Operativo por defecto\n"
                                    + "8. Tiempo de fabrica\n"
                                    + "9. Capacidad de la bateria\n"
                                    + "10. Duracion de la bateria\n"
                                    + "Ingrese su opcion: ");
                            int option = leer.nextInt();
                            switch (option) {
                                case 1: {
                                    System.out.print("\nIngrese el nuevo modelo: ");
                                    String aux = leer.next();
                                    ((Computadoras) lista.get(i)).setModelo(aux);
                                    break;
                                }
                                case 2: {
                                    System.out.print("\nIngrese la capacidad del disco duro: ");
                                    int aux = leer.nextInt();
                                    ((Computadoras) lista.get(i)).setCapacidad(aux);
                                    break;
                                }
                                case 3: {
                                    System.out.print("\nIngrese el tamaño de la pantalla: ");
                                    int aux = leer.nextInt();
                                    ((Computadoras) lista.get(i)).setPantalla(aux);
                                    break;
                                }
                                case 4: {
                                    System.out.print("\nTiene teclado numerico [s/n]");
                                    char aux = leer.next().toLowerCase().charAt(0);
                                    boolean teclado = true;
                                    if (aux == 's') {
                                        teclado = true;
                                    } else if (aux == 'n') {
                                        teclado = false;
                                    }
                                    ((Computadoras) lista.get(i)).setTeclado(teclado);
                                    break;
                                }
                                case 5: {
                                    System.out.print("\nIngrese el tipo de procesador: ");
                                    String aux = leer.next();
                                    ((Computadoras) lista.get(i)).setProcesador(aux);
                                    break;
                                }
                                case 6: {
                                    System.out.println("Ingrese el numero del nuevo tipo de tarjeta grafica:\n1. Normal\n2. Gamer\nIngrese su opcion: ");
                                    int auxiliar = leer.nextInt();
                                    String tarjeta = "";
                                    if (auxiliar == 1) {
                                        tarjeta += "Normal";
                                    } else if (auxiliar == 2) {
                                        tarjeta += "Gamer";
                                    }
                                    ((Computadoras) lista.get(i)).setTarjeta(tarjeta);
                                    break;
                                }
                                case 7: {
                                    System.out.print("Ingrese el nuevo Sistema Operativo por defecto:\n1. Windows\n2. ChromeOS\nIngrese opcion: ");
                                    int auxiliar = leer.nextInt();
                                    String SO = "";
                                    if (auxiliar == 1) {
                                        SO += "Windows";
                                    } else if (auxiliar == 2) {
                                        SO += "ChromeOS";
                                    }
                                    ((Computadoras) lista.get(i)).setSO(SO);
                                    break;
                                }
                                case 8: {
                                    System.out.print("\nIngrese el tiempo de fabrica: ");
                                    int aux = leer.nextInt();
                                    ((Computadoras) lista.get(i)).setHoras(aux);
                                    break;
                                }
                                case 9: {
                                    System.out.print("\nIngrese la capacidad de la bateria: ");
                                    int aux = leer.nextInt();
                                    ((Computadoras) lista.get(i)).setMiliamperios(aux);
                                    break;
                                }
                                case 10: {
                                    System.out.print("\nIngrese la duracion de la bateria");
                                    int aux = leer.nextInt();
                                    ((Computadoras) lista.get(i)).setDuracion(aux);
                                    break;
                                }
                                default: {
                                    System.out.println("\nOpcion Invalida");

                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("\nEliminar");
                    System.out.print("Ingrese el numero de serie de la computadora que desea eliminar: ");
                    int eliminar = leer.nextInt();

                    for (int i = 0; i < lista.size(); i++) {
                        if (((Computadoras) lista.get(i)).getSerie() == eliminar) {
                            lista.remove(i);
                        }
                    }
                    break;
                }
                case 5: {
                    inicio = 1;
                    System.out.println("\nUsted ha salido del programa");
                    break;
                }
                default:
                    System.out.println("\nOcion Invalida.");
                    break;
            }
        }

    }

}
