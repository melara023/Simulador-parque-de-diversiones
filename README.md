HEAD
# Simulador-parque-de-diversiones
Investigación aplicada 1 DWF 404 | Simulador parque de diversiones
Este en un proyecto basado en un parque de diversiones que necesita un sistema para administrar sus atracciones y visitantes.
En el que cada atracción tiene restricciones de edad, capacidad máxima y estados operativos.


Este en un proyecto basado en un parque de diversiones que necesita un sistema para administrar sus atracciones y visitantes. 
En el que cada atracción tiene restricciones de edad, capacidad máxima y estados operativos.
master

Para solucionar este problema, se desarrolló un sistema en Java que permite:

- Gestionar atracciones con diferentes requisitos y estados.
- Administrar visitantes y verificar si pueden acceder a las atracciones.
- Reubicar visitantes en caso de que una atracción esté en mantenimiento.

Para resolver el problema, se diseñó un sistema basado en Programación Orientada a Objetos (POO) con las siguientes clases principales:

Atraccion (clase abstracta): Representa una atracción del parque. Contiene atributos como nombre, capacidad máxima, edad mínima y estado de mantenimiento.
MontañaRusa, Carrusel, CasaTerror (subclases de Atraccion): Son implementaciones específicas con diferentes restricciones.
Visitante: Representa a una persona que visita el parque. Tiene atributos como nombre, edad y una lista de boletos.
Boleto: Representa un boleto de entrada con diferentes tipos (Infantil, Adulto, VIP).
ParqueDiversiones: Administra el ingreso de visitantes y la gestión de atracciones.
El código permite asignar visitantes a atracciones verificando si cumplen los requisitos. Si una atracción está en mantenimiento, el visitante se reubica en otra disponible.

Para la ejecución del proyecto primero debemos clonar el repositorio con el siguiente comando desde la terminal: 
 git clone https://github.com/melara023/Simulador-parque-de-diversiones.git
cd Simulador-parque-de-diversiones
2- Compilar el proyecto 
usando IntelliJ IDEA, abrimos el proyecto y nos aseguramos de que esté configurado correctamente con Java 8 o superior.
3- ejecutamos el simulador desde la terminal utilizando el siguiente comando 
java -cp bin park.TestPark
o simplemente ejecutando el TestPark.Java

----- PRUEBAS UNITARIAS -----
La investigación también cuenta con prebas unitarias desarrolladas con JUnit5, estas están ubicadas en la carpeta 
src/test/java/park/. El principal objetivo de estas pruebas es verificar el correcto funcionamiento de las clases principales
como "Atracción", "Boleto", "Visitante", "ParqueDIversiones"

Con el desarrollo de estas pruebas validamos los siguientes requerimientos: 
 1- Restricciones de edad para acceder a las atracciones.
 2- Asignación correcta de visitantes a las atracciones.
 3- Funcionamiento de boletos VIP y su acceso especial.
 4- Capacidad máxima de las atracciones y reubicación de visitantes.
