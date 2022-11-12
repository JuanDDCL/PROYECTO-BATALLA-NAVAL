import java.util.*;
public class Main {
    public static void main(String[] args) {
        boolean menu = true, salir = true;
        Scanner leer = new Scanner(System.in);
        while (menu) {
            while (salir) {
                System.out.println("\n°°°°°°°°°°°°°°°°°°°° Bienvenido al juego °°°°°°°°°°°°°°°°°°°°\n\nModos de juego\n\n1-Un jugador\n2-Dos jugadores\n3-Tres jugadores\n4-Cuatro jugadores\n5-Salir\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\nSeleccione una opcion");
                int players = leer.nextInt();
                System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                switch (players) {
                    case 1: {
                        opcion1();
                        break;
                    }//Fin case 1
                    case 2: {
                        opcion2();
                        break;
                    }//Fin case 2
                    case 3: {
                        opcion3();
                        break;
                    }//Fin case 3
                    case 4: {
                        opcion4();
                        break;
                    }//Fin case 4
                    case 5: {
                        salir = false;
                        break;
                    }
                    default: {
                        System.out.println("Ingrese una opcion valida");
                        break;
                    }//Fin default
                }//Fin switch players
            }//Fin while sin ganador
            System.out.println("\n°°°°°°°°°°°°°°°°°°°°Desea volver a jugar?°°°°°°°°°°°°°°°°°°°°\n\n1-Si\n2-No\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\nSeleccione una opcion-");
            int opcfinal = leer.nextInt();
            switch (opcfinal) {
                case 1: {
                    salir = true;
                    continue;
                }
                case 2: {
                    System.out.println("\nHasta la protsimaaaaaaa c:\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    menu = false;
                    break;
                }
                default: {
                    System.out.println("Te quedas sin jugar por chistoso >:l\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    menu = false;
                    break;
                }
            }
        }//Fin while menu
    }//Fin de main
    public static int nrandom() {
        return (int) (Math.random() * 9) + 0;
    }//Fin de nrandom
    public static void opcion1() {
        Scanner name = new Scanner(System.in);
        System.out.println("Ingrese nombre del jugador");
        String name1 = name.nextLine();
        int bU[] = new int[120];
        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\nMostrando cartas");
        for (int i = 0; i < 120; i++) {
            bU[i] = nrandom();
            System.out.print(bU[i] + " , ");
        }
        int b1[] = new int[32];
        int b2[] = new int[32];
        int b3[] = new int[32];
        int b4[] = new int[32];
        boolean p1 = true;
        int carta;
        while (p1) {
            boolean t1 = true, t2 = true, t3 = true, t4 = true;
            while (t1) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name1 + " )\n");
                System.out.println("Tus cartas son");
                int bar1 = 0;
                for (int i = 0; i < 7; i++) {
                    b1[i] = bU[i];
                    System.out.print("Carta " + bar1 + ": " + b1[i] + "   ");
                    bar1++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b1[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b1[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b1.length == 1) {
                    System.out.println("EL JUGADOR "+name1+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b1.length == 0) {
                    t1 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name1 + " HAS GANADO");
                }
            }
            while (t2) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de BOT 1 \n");
                System.out.println("Sus cartas son");
                int bar2 = 0;
                for (int i = 0; i < 7; i++) {
                    b3[i] = bU[i];
                    System.out.print("Carta " + bar2 + ": " + b2[i] + "   ");
                    bar2++;
                }
                System.out.println("\n\nAyuda al bot ingresando el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b2[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b2[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b2.length == 1) {
                    System.out.println("EL BOT 1 SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b2.length == 0) {
                    t2 = false;
                    p1 = false;
                    System.out.println("El BOT 1 HA GANADO");
                }
            }
            while (t3) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de BOT 2 \n");
                System.out.println("Sus cartas son");
                int bar3 = 0;
                for (int i = 0; i < 7; i++) {
                    b3[i] = bU[i];
                    System.out.print("Carta " + bar3 + ": " + b3[i] + "   ");
                    bar3++;
                }
                System.out.println("\n\nAyuda al bot ingresando el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b3[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b3[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b3.length == 1) {
                    System.out.println("EL BOT 2 SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b3.length == 0) {
                    t3 = false;
                    p1 = false;
                    System.out.println("El BOT 2 HA GANADO");
                }
            }
            while (t4) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de BOT 3 \n");
                System.out.println("Sus cartas son");
                int bar4 = 0;
                for (int i = 0; i < 7; i++) {
                    b4[i] = bU[i];
                    System.out.print("Carta " + bar4 + ": " + b4[i] + "   ");
                    bar4++;
                }
                System.out.println("\n\nAyuda al bot ingresando el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b4[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b4[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b3.length == 1) {
                    System.out.println("EL BOT 3 SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b3.length == 0) {
                    t3 = false;
                    p1 = false;
                    System.out.println("El BOT 3 HA GANADO");
                }
            }
        }//p1
    }//opcion1
    public static void opcion2() {
        Scanner name = new Scanner(System.in);
        System.out.println("Ingrese nombre del jugador 1");
        String name1 = name.nextLine();
        System.out.println("Ingrese nombre del jugador 2");
        String name2 = name.nextLine();
        int bU[] = new int[120];
        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\nMostrando cartas");
        for (int i = 0; i < 120; i++) {
            bU[i] = nrandom();
            System.out.print(bU[i] + " , ");
        }
        int b1[] = new int[32];
        int b2[] = new int[32];
        int b3[] = new int[32];
        int b4[] = new int[32];
        boolean p1 = true;
        int carta;
        while (p1) {
            boolean t1 = true, t2 = true, t3 = true, t4 = true;
            while (t1) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name1 + " )\n");
                System.out.println("Tus cartas son");
                int bar1 = 0;
                for (int i = 0; i < 7; i++) {
                    b1[i] = bU[i];
                    System.out.print("Carta " + bar1 + ": " + b1[i] + "   ");
                    bar1++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b1[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b1[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b1.length == 1) {
                    System.out.println("EL JUGADOR "+name1+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b1.length == 0) {
                    t1 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name1 + " HAS GANADO");
                }
            }
            while (t2) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name2 + " )\n");
                System.out.println("Tus cartas son");
                int bar2 = 0;
                for (int i = 0; i < 7; i++) {
                    b3[i] = bU[i];
                    System.out.print("Carta " + bar2 + ": " + b2[i] + "   ");
                    bar2++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b2[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b2[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b2.length == 1) {
                    System.out.println("EL JUGADOR "+name2+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b2.length == 0) {
                    t2 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name2 + " HAS GANADO");
                }
            }
            while (t3) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de BOT 1 \n");
                System.out.println("Sus cartas son");
                int bar3 = 0;
                for (int i = 0; i < 7; i++) {
                    b3[i] = bU[i];
                    System.out.print("Carta " + bar3 + ": " + b3[i] + "   ");
                    bar3++;
                }
                System.out.println("\n\nAyuda al bot ingresando el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b3[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b3[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b3.length == 1) {
                    System.out.println("EL BOT 1 SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b3.length == 0) {
                    t3 = false;
                    p1 = false;
                    System.out.println("El BOT 1 HA GANADO");
                }
            }
            while (t4) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de BOT 2 \n");
                System.out.println("Sus cartas son");
                int bar4 = 0;
                for (int i = 0; i < 7; i++) {
                    b4[i] = bU[i];
                    System.out.print("Carta " + bar4 + ": " + b4[i] + "   ");
                    bar4++;
                }
                System.out.println("\n\nAyuda al bot ingresando el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b4[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b4[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b4.length == 1) {
                    System.out.println("EL BOT 2 SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b4.length == 0) {
                    t4 = false;
                    p1 = false;
                    System.out.println("El BOT 2 HA GANADO");
                }
            }
        }//p1
    }//opcion2
    public static void opcion3() {
        Scanner name = new Scanner(System.in);
        System.out.println("Ingrese nombre del jugador 1");
        String name1 = name.nextLine();
        System.out.println("Ingrese nombre del jugador 2");
        String name2 = name.nextLine();
        System.out.println("Ingrese nombre del jugador 3");
        String name3 = name.nextLine();
        int bU[] = new int[120];
        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\nMostrando cartas");
        for (int i = 0; i < 120; i++) {
            bU[i] = nrandom();
            System.out.print(bU[i] + " , ");
        }
        int b1[] = new int[32];
        int b2[] = new int[32];
        int b3[] = new int[32];
        int b4[] = new int[32];
        boolean p1 = true;
        int carta;
        while (p1) {
            boolean t1 = true, t2 = true, t3 = true, t4 = true;
            while (t1) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name1 + " )\n");
                System.out.println("Tus cartas son");
                int bar1 = 0;
                for (int i = 0; i < 7; i++) {
                    b1[i] = bU[i];
                    System.out.print("Carta " + bar1 + ": " + b1[i] + "   ");
                    bar1++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b1[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b1[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b1.length == 1) {
                    System.out.println("EL JUGADOR "+name1+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b1.length == 0) {
                    t1 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name1 + " HAS GANADO");
                }
            }
            while (t2) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name2 + " )\n");
                System.out.println("Tus cartas son");
                int bar2 = 0;
                for (int i = 0; i < 7; i++) {
                    b3[i] = bU[i];
                    System.out.print("Carta " + bar2 + ": " + b2[i] + "   ");
                    bar2++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b2[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b2[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b2.length == 1) {
                    System.out.println("EL JUGADOR "+name2+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b2.length == 0) {
                    t2 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name2 + " HAS GANADO");
                }
            }
            while (t3) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name3 + " )\n");
                System.out.println("Tus cartas son");
                int bar3 = 0;
                for (int i = 0; i < 7; i++) {
                    b3[i] = bU[i];
                    System.out.print("Carta " + bar3 + ": " + b3[i] + "   ");
                    bar3++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b3[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b3[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b3.length == 1) {
                    System.out.println("EL JUGADOR "+name3+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b3.length == 0) {
                    t3 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name3 + " HAS GANADO");
                }
            }
            while (t4) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de BOT 2 \n");
                System.out.println("Sus cartas son");
                int bar4 = 0;
                for (int i = 0; i < 7; i++) {
                    b4[i] = bU[i];
                    System.out.print("Carta " + bar4 + ": " + b4[i] + "   ");
                    bar4++;
                }
                System.out.println("\n\nAyuda al bot ingresando el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b4[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b4[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b4.length == 1) {
                    System.out.println("EL BOT 1 SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b4.length == 0) {
                    t4 = false;
                    p1 = false;
                    System.out.println("El BOT 1 HA GANADO");
                }
            }
        }//p1
    }//opcion3
    public static void opcion4() {
        Scanner name = new Scanner(System.in);
        System.out.println("Ingrese nombre del jugador 1");
        String name1 = name.nextLine();
        System.out.println("Ingrese nombre del jugador 2");
        String name2 = name.nextLine();
        System.out.println("Ingrese nombre del jugador 3");
        String name3 = name.nextLine();
        System.out.println("Ingrese nombre del jugador 4");
        String name4 = name.nextLine();
        int bU[] = new int[120];
        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\nMostrando cartas");
        for (int i = 0; i < 120; i++) {
            bU[i] = nrandom();
            System.out.print(bU[i] + " , ");
        }
        int b1[] = new int[32];
        int b2[] = new int[32];
        int b3[] = new int[32];
        int b4[] = new int[32];
        boolean p1 = true;
        int carta;
        while (p1) {
            boolean t1 = true, t2 = true, t3 = true, t4 = true;
            while (t1) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name1 + " )\n");
                System.out.println("Tus cartas son");
                int bar1 = 0;
                for (int i = 0; i < 7; i++) {
                    b1[i] = bU[i];
                    System.out.print("Carta " + bar1 + ": " + b1[i] + "   ");
                    bar1++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b1[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b1[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b1.length == 1) {
                    System.out.println("EL JUGADOR "+name1+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b1.length == 0) {
                    t1 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name1 + " HAS GANADO");
                }
            }
            while (t2) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name2 + " )\n");
                System.out.println("Tus cartas son");
                int bar2 = 0;
                for (int i = 0; i < 7; i++) {
                    b3[i] = bU[i];
                    System.out.print("Carta " + bar2 + ": " + b2[i] + "   ");
                    bar2++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b2[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b2[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b2.length == 1) {
                    System.out.println("EL JUGADOR "+name2+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b2.length == 0) {
                    t2 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name2 + " HAS GANADO");
                }
            }
            while (t3) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name3 + " )\n");
                System.out.println("Tus cartas son");
                int bar3 = 0;
                for (int i = 0; i < 7; i++) {
                    b3[i] = bU[i];
                    System.out.print("Carta " + bar3 + ": " + b3[i] + "   ");
                    bar3++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b3[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b3[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b3.length == 1) {
                    System.out.println("EL JUGADOR "+name3+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b3.length == 0) {
                    t3 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name3 + " HAS GANADO");
                }
            }
            while (t4) {
                Scanner leer = new Scanner(System.in);
                System.out.println("\n\nTunro de jugador ( " + name4 + " )\n");
                System.out.println("Tus cartas son");
                int bar4 = 0;
                for (int i = 0; i < 7; i++) {
                    b4[i] = bU[i];
                    System.out.print("Carta " + bar4 + ": " + b4[i] + "   ");
                    bar4++;
                }
                System.out.println("\n\nIngrese el numero de la carta que desea utilizar");
                carta = leer.nextInt();
                for (int x = 1; x <= 7; x++) {
                    if (b4[x] == carta) {
                    }
                }
                System.out.println("La ultima carta jugada es: " + b4[carta] + "\n\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                for (int i = carta; i < 119; i++) {
                    bU[i] = bU[i + 1];
                }
                System.out.println("Mostrando cartas");
                for (int i = 0; i < 119; i++) {
                    System.out.print(bU[i] + "   ");
                }//FIN DE SU TURNOOOOOO
                if (b4.length == 1) {
                    System.out.println("EL JUGADOR "+name4+" SE ENCUENTRA A UNA CARTA DE GANAR");
                }
                if (b4.length == 0) {
                    t4 = false;
                    p1 = false;
                    System.out.println("FELICIDADES " + name4 + " HAS GANADO");
                }
            }
        }//p1
    }//opcion4
}//principal
//CÓRDOBA LÓPEZ JUAN DE DIOS        1122-IS     1322134144