# Gestion de Casting :dancer:

Lo primero que se necesita es tener la linea de comando de mysql y ejecutar la siguiente linea de mysql que crea un base nueva en base a las tablas definidas en la DB ya creada.

```
mysql -uroot -padmin casting < casting.sql
```

## Diagrama del caso :book:
En el siguiente enlace se puede visualizar un diagrama de todo el caso para una mejor organizacion de la estructura de la base de datos y del programa.
[Ver Diagrama](https://miro.com/app/board/uXjVOFgto34=/?invite_link_id=186523800084)


## compilacion :computer: :hammer_and_wrench:

En el paquete controlador se encuentra un archivo que es el que se tiene que compilar **Principal.java**, al abrirlo ejecutara la interfaz grafica del dashboard donde se podran ver todas la opciones que se pueden realizar.



### Explicacion del proyecto

En la parte de de Controlador es donde se va a ejecutar todo el programa, en la parte de los modelos se encuentra toda la parte logica de las interfazes graficas.
En la parte de las vistas es donde se encuentra todo lo referente a las interfazes graficas que se desarrollaron.


### Lo que hace el programa

Lo que hace el programa es por medio de un dashboard se encuentran 4 botones los cuales nos permiten crear los registros para las


* Clientes
* Candidatos
* Casting
* Contrato

Del mismo modo estos nos llevan a otros subprogramas que es donde es encuentran los formularios asi mismo, al llenar un formulario y apretar el boton de registrar lo que hara la lógica es capturar esos datos ingresados en variables para despues insertarlos en la base de datos por medio del comando INSERT en mysql.

Estos datos se pueden ver en la parte de los contratos donde el cliente va a elegir a los candidatos que requiere para su proyecto.


