# Ejercicio 2

Para cada una de las siguientes situaciones, realice en forma iterativa los siguientes pasos:

(i) indique el mal olor,

(ii) indique el refactoring que lo corrige,

(iii) aplique el refactoring, mostrando el resultado final (código y/o diseño según corresponda).

Si vuelve a encontrar un mal olor, retorne al paso (i).

# 2.2 Juego

## Bad smell: nombre de metodo poco explicativo.
Los metodos incrementar y decrementar son poco explicativos y no se comprende su objetivo.

## Solucion: Rename Method.

## Código luego de aplicar el refactoring:
```Java
	public  class  Juego {
	// ......
	
		public  void  incrementarPuntuacion(Jugador j) {
			j.puntuacion = j.puntuacion + 100;
		}

		public  void  decrementarPuntuacion(Jugador j) {
			j.puntuacion = j.puntuacion - 50;
		}
```

## Bad smell: Feature Envy.

El método incrementarPuntuacion ejecuta logica que deberia estar en Jugador.

## Solución: Move Method.

Aplicamos esa logica en la clase Jugador y en el método original invocamos al nuevo método de Jugador.

## Código luego de aplicar el refactoring:
```Java
public  void  incrementarPuntuacion(Jugador j) {
	j.incrementarPuntuacion();
}
```
###
```Java
public class Jugador  {
	public String nombre;
	public String apellido;
	public int  puntuacion =  0;
	
	public void incrementarPuntuacion(){
		this.puntuacion = this.puntuacion + 100;
	}
```

## Bad smell: Feature Envy.

El método decrementarPuntuacion ejecuta logica que deberia estar en Jugador.

## Solución: Move Method.

Aplicamos esa logica en la clase Jugador y en el método original invocamos al nuevo método de Jugador.

## Código luego de aplicar el refactoring:
```Java
public  void  decrementarPuntuacion(Jugador j) {
	j.decrementarPuntuacion();
}
```
###
```Java
public class Jugador  {
	public String nombre;
	public String apellido;
	public int  puntuacion =  0;
	
	public void decrementarPuntuacion(){
		this.puntuacion = this.puntuacion - 100;
	}
```
## Bad smell: Rompe el encapsulamiento.

La clase jugador tiene variables de instancia que son públicas.

## Solución: Encapsulate Field.

## Código luego de aplicar el refactoring:
```Java
public class Jugador  {
	private String nombre;
	private String apellido;
	private int  puntuacion =  0;
```
## Código final refactorizado:
```Java
public  class  Juego {
	// ......
	public  void  decrementarPuntuacion(Jugador j) {
		j.decrementarPuntuacion();
	}
		
	public  void  incrementarPuntuacion(Jugador j) {
		j.incrementarPuntuacion();
	}
```
###

```Java
public class Jugador  {
	private String nombre;
	private String apellido;
	private int puntuacion =  0;
	
	public void incrementarPuntuacion(){
		this.puntuacion = this.puntuacion + 100;
	}
		
	public void decrementarPuntuacion(){
		this.puntuacion = this.puntuacion - 100;
	}
}
```
# 2.3 Carrito de compras.

## Bad smell: Nombre poco explicativo.
El nombre del método total de carrito es poco explicativo.

##Solución: Rename Method.

## Código luego de aplicar el refactoring:

```Java
public  double  getPrecioTotal()  {
	return  this.items.stream()
	.mapToDouble(item ->item.getProducto().getPrecio()  * item.getCantidad())
	.sum();

}
```
## Bad smell: Feature Envy.

La clase Carrito realiza el cálculo de getProducto * getCantidad, este deberia estar en la clase ItemCarrito.

## Solución: Extract Method y Move Method

Hay que extraer la parte en la que está el mal olor y la movemos a la clase ItemCarrito en un nuevo método el cual estará referenciado en la clase Carrito.

```Java
public  double  getPrecioTotal()  {
	return  this.items.stream()
	.mapToDouble(item ->item.getPrecioTotal())
	.sum();
}	
```
###
```Java
public  class  ItemCarrito  {
	private Producto producto;
	private  int cantidad;

	public Producto getProducto()  {
		return  this.producto;
	}

	public int getCantidad()  {
		return  this.cantidad;
	}

	public double getTotalPrecio(){
		return this.getCantidad() * this.getProducto().getPrecio();
	}
}
```

## Código final refactorizado:

```Java
public  class  ItemCarrito  {
	private Producto producto;
	private  int cantidad;

	public Producto getProducto()  {
		return  this.producto;
	}

	public int getCantidad()  {
		return  this.cantidad;
	}

	public double getTotalPrecio(){
		return this.getCantidad() * this.getProducto().getPrecio();
	}
}
```
###
```Java
public  class  Carrito  {
	private List<ItemCarrito> items;
	
	public  double  getPrecioTotal()  {
		return  this.items.stream()
		.mapToDouble(item ->item.getPrecioTotal())
		.sum();
	}
}
```
###
```Java
public  class  Producto  {
	private String nombre;
	private  double precio;

	public  double  getPrecio()  {
		return  this.precio;
	}
}
```

# 2.5 Envío de pedidos.


## Bad smell: Feature Envy.
La clase Cliente le está pidiendo todos los campos a Dirección y formateandolos él mismo, esta es lógica que debería emplearse en Dirección.

## Solución: Move Method.

## Código luego de aplicar el refactoring:

```Java
public  class Cliente {

	public String getDireccionFormateada() {

		return this.direccion.toString();
	}
}
```
###
```Java
public class Direccion {
	...
	public Sring toString(){
		return this.getLocalidad() + "," + this.getCalle() + "," + 
				this.getNumero() + "," + this.getDepartamento();
	}
}
```

## Bad smell: Rompe encapsulamiento.
Las variables instancia de Dirección son públicas, lo cual rompe el encapsulamiento.

## Solución: Encapsulate Field.

## Codigo luego de aplicar el refactoring:

```Java
public class Direccion {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;

	public String getLocalidad(){
		return this.localidad;
	}

	public void setLocalidad(String localidad){
		this.localidad = localidad;
	}

	public String getCalle(){
		return this.calle;
	}

	public void setCalle(String calle){
		this.calle = calle;
	}	

	public String getNumero(){
		return this.numero;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}	

	public String getDepartamento(){
		return this.departamento;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
}
```

## Bad smell: Middle Man.
La clase Cliente se está usando solamente para llamar al método de Direccion, es mejor que la que interactue con Supermercado sea directamente Direccion en vez de Cliente.

## Solución: Remove Middle Man.

## Código luego de aplicar el refactoring:

```Java
public void notificarPedido(long nroPedido, Direccion direccion) {
	String notificacion = MessageFormat.format(“Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}”, new Object[] { nroPedido, direccion.toString() });

	// lo imprimimos en pantalla, podría ser un mail, SMS, etc..
	System.out.println(notificacion);
}
```

## Código final refactorizado:

```Java
public  class Supermercado {
	public void notificarPedido(long nroPedido, Direccion direccion) {
		String notificacion = MessageFormat.format(“Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}”, new Object[] { nroPedido, direccion.toString() });

		// lo imprimimos en pantalla, podría ser un mail, SMS, etc..
		System.out.println(notificacion);
	}
}
```
###
```Java
public class Direccion {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;

	public String getLocalidad(){
		return this.localidad;
	}

	public void setLocalidad(String localidad){
		this.localidad = localidad;
	}

	public String getCalle(){
		return this.calle;
	}

	public void setCalle(String calle){
		this.calle = calle;
	}	

	public String getNumero(){
		return this.numero;
	}

	public void setNumero(String numero){
		this.numero = numero;
	}	

	public String getDepartamento(){
		return this.departamento;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public Sring toString(){
		return this.getLocalidad() + "," + this.getCalle() + "," + 
				this.getNumero() + "," + this.getDepartamento();
	}
}
```

# 2.6 Películas

## Bad smell: Switch Statement
El método **calcularCostoPelicula** tiene una serie de condicionales.

## Solución: Replace Switch Statement with Polymorphism.

## Código luego de aplicar el refactoring:

```Java
public class Usuario {
	String tipoSubscripcion;
	// ...
	
	public void  setTipoSubscripcion(String unTipo) {
		this.tipoSubscripcion = unTipo;
	}

	public double  calcularCostoPelicula(Pelicula pelicula)  {
		return this.tipoSubscripcion.calcularCostoPelicula(Pelicula pelicula);
	}
}
```
```Java
public interface Subscripcion {
    public double calcularCostoPelicula(Pelicula pelicula);
}
```
```Java
public class SubscripcionBasica implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno();
    }
}
```
```Java
public class SubscripcionFamilia implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return (pelicula.getCosto() + pelicula.calcularCargoExtraPorEstreno()) * 0.90;
    }
}
```
```Java
public class SubscripcionPlus implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto();
    }
}
```
```Java
public class SubscripcionPremium implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() * 0.75;
    }
}
```
## Bad smell: Feature Envy

Las clases SubscripcionBasica y SubscripcionFamilia contienen logica que deberia resolver la clase Pelicula en el método calcularCostoPelicula.

## Solución: Move Method.

## Código luego de aplicar el refactoring:

```Java
public class SubscripcionBasica implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.calcularCostoConCargoExtra();
    }
}
```
```Java
public class SubscripcionFamilia implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return .calcularCostoConCargoExtra() * 0.90;
    }
}
```
```Java
public class SubscripcionPlus implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto();
    }
}
```
```Java
public class SubscripcionPremium implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() * 0.75;
    }
}
```Java
public class Pelicula {
	...
	public double calcularCostoConCargoExtra() {
        return this.getCosto() + this.calcularCargoExtraPorEstreno();
    }
    ...
}
```

## Bad smell: Comment
El comentario explicando el método **calcularCargoExtraPorEstreno()** es innecesario porque ya es explicativo por sí solo.

## Solución: eliminar el comentario.

## Código luego de aplicar el refactoring:

```Java
public double  calcularCargoExtraPorEstreno(){
	return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
}
```
## Bad smell: Rompe el  encapsulamiento.
Las variables internas de Pelicula y Usuario son públicas.

## Solución: Encapsulate Field.

## Código luego de aplicar el refactoring:
```Java
public class Usuario {
	private String tipoSubscripcion;
	// ...
```
```Java
public class Pelicula {
	private LocalDate fechaEstreno;
	...
```
## Código final refactorizado:

```Java
public class Usuario {
	private String tipoSubscripcion;
	// ...
	
	public void  setTipoSubscripcion(String unTipo) {
		this.tipoSubscripcion = unTipo;
	}

	public double  calcularCostoPelicula(Pelicula pelicula)  {
		return this.tipoSubscripcion.calcularCostoPelicula(Pelicula pelicula);
	}
}
```
```Java
public interface Subscripcion {
    public double calcularCostoPelicula(Pelicula pelicula);
}
```
```java
public class SubscripcionBasica implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.calcularCostoConCargoExtra();
    }
}
```
```Java
public class SubscripcionFamilia implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return .calcularCostoConCargoExtra() * 0.90;
    }
}
```
```Java
public class SubscripcionPlus implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto();
    }
}
```
```Java
public class SubscripcionPremium implements Subscripcion{
    @Override
    public double calcularCostoPelicula(Pelicula pelicula) {
        return pelicula.getCosto() * 0.75;
    }
}
```
```Java
public class Pelicula {
	private LocalDate fechaEstreno;
	
	public double calcularCostoConCargoExtra() {
	    return this.getCosto() + this.calcularCargoExtraPorEstreno();
	}
	
	public double  calcularCargoExtraPorEstreno(){
		return (ChronoUnit.DAYS.between(this.fechaEstreno, LocalDate.now()) ) > 30 ? 0 : 300;
	}
}
```
