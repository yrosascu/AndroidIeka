Este proyecto es acerca de la Elaboracion de uno de los mas famosos juegos el Tic Tac Toe o como otros lo conocen el juego de 3 en raya
Primero creamos un nuevo proyecto Android y empezamos...
Lo que necesitamos es identificar primero cuales son las posiciones ganadoras, tenemos a:
1 2 3
4 5 6
7 8 9
1 4 7
2 5 8
3 6 9
1 5 9
3 5 7

En total 8 formas de ganar, y como maximo en cada partida el ganador ocupa 5 posiciones, entonces creamos una matriz 
para las posiciones ganadoras y arreglos para colocar las posiciones de cada jugador.

int[][] ganan = {{1, 2, 3},{4, 5, 6}, ....}
int[] arr_x = new int [5]
int[] arr_o = new int [5]

ahora necesitamos contadores, para contar las jugadas(alterna las jugadas par jugador 1, impar jugador 2), para contar la cantidad
de 'x' y de 'o'.

Despues de cada jugada, debemos deshabilitar la casilla marcada:

boton1.setClickable(false);

Ahora veamos el layout:
En el archivo xml, utilizamos un TableLayout, dentro un RowTable para posicionar los botones, aqui para determinar cual es la posición del
elemento a clickear utilizamos la caracteristica "tag", y habilitamos la opcion del clic

<ImageButton
    android:id="@+id/imageButton1"
    android:clickable="true"
    android:tag="1"
>

Ademas le otorgamos un tamaño y para las rayitas lo unico que hacemos es dejar un espacio delgado entre botón y botón de "2px" y le colocamos
un fondo al TableLayout y a cada boton(una imagen en blanco)
    android:layout_width="52px"
    android:layout_height="52px"
    android:margin="2px"

Para los botones de "Nuevo y "Cerrar", usamos funciones definidas como finish(); y llamamos nuevamente a nuestra funcion inicio() que la que engloba
todas las variables y funciones OnClickListener.
    
