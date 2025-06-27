# Ejercicio 1: Algo huele mal

Indique qué malos olores se presentan en los siguientes ejemplos.

## 1.1 Protocolo de Cliente
## Bad Smell: el nombre de los métodos es poco explicativo. 

## Extracto del código con el bad smell:

    public double lmtCrdt()  {...
    protected double mtFcE(LocalDate f1, LocalDate f2)  {...
    private double mtCbE(LocalDate f1, LocalDate f2)  {...

## Solución a aplicar: Rename Method.

Código refactorizado aplicando rename method:

    public double getLimiteCredito()  {...
    protected double getFacturacionEntreFechas(LocalDate f1, LocalDate f2)  {...
    private double getMontoCobradoEntreFechas(LocalDate f1, LocalDate f2)  {...

 ## Bad Smell: el nombre de los parámetros *"f1"* y *"f2"* de los métodos es poco explicativo. 
 
## Extracto del código con el bad smell:

	protected double getFacturacionEntreFechas(LocalDate f1, LocalDate f2)  {...
    private double getMontoCobradoEntreFechas(LocalDate f1, LocalDate f2)  {...
    
## Solución a aplicar: Renombrar los parámetros.

Código refactorizado renombrando parámetros:

    protected double getFacturacionEntreFechas(LocalDate fechaInicio, LocalDate fechaFin)  {...
    private double getMontoCobradoEntreFechas(LocalDate fechaInicio, LocalDate fechaFin)  {...
    
## Bad Smell: Comentarios
Yo los eliminé porque ya me sale instintivo pero este ejercicio tenía comentarios explicando los métodos. Una vez que hice el Rename Method y renombré los parámetros no hay razón alguna para quedarnos con los comentarios, el código ya es legible y se entiende sólo leyendo los nombres.
## Código refactorizado:

     public double getLimiteCredito()  {...
     protected double getFacturacionEntreFechas(LocalDate fechaInicio, LocalDate fechaFin)  {...
     private double getMontoCobradoEntreFechas(LocalDate fechaInicio, LocalDate fechaFin)  {...
#
## 1.2 Participación en proyectos

## Bad smell: Feature Envy

Me parece correcto el cambio porque en la clase Persona se encontraba el mal olor de **Feature Envy**. Es la clase Proyecto quien debe encargarse de procesar a sus participantes. Para solucionar este mal olor se decidió utilizar el refactoring **Move Method**. Aun así, en la figura 2, en la clase Persona, el campo id es público, lo cual rompe el encapsulamiento. Para solucionar este mal olor, se debe refactorizar utilizando Encapsulate Field. 
#

## 1.3 Cálculos

## Codigo original:

    public void imprimirValores()  {
    
	    int totalEdades =  0;
	    double promedioEdades =  0;
	    double totalSalarios =  0;
	    
	    for (Empleado empleado : personal)  {
		    totalEdades = totalEdades + empleado.getEdad();
		    totalSalarios = totalSalarios + empleado.getSalario();
	    }
	    
	    promedioEdades = totalEdades / personal.size();
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	    
	    System.out.println(message);
    }

## Bad smell: Nombre del método poco descriptivo.

## Extracto del código con bad smell:

    public  void  imprimirValores()

## Solución: Rename Method

## Código luego de aplicar el refactoring:

    public void imprimirPromedioEdadesYTotalSueldos()

## Bad smell: Reinventando la rueda para calcular el total de edades.

El cálculo de totalEdades se hace utilizando un for en vez de un stream que para eso están.
 
## Extracto del código con bad smell:

     for (Empleado empleado : personal)  {
    		    totalEdades = totalEdades + empleado.getEdad();
    		    totalSalarios = totalSalarios + empleado.getSalario();
    	    }

## Solución: Replace Loop with Pipeline.

## Código luego de aplicar el refactoring:

    public void imprimirPromedioEdadesYTotalSueldos()  {
    
	    int totalEdades =  0;
	    double promedioEdades =  this.personal.stream().mapToDouble(e -> e.getEdad()).average().orElse(0);
	    double totalSalarios =  0;
	    
	    for (Empleado empleado : personal)  {
		    totalSalarios = totalSalarios + empleado.getSalario();
	    }
	    
	    promedioEdades = totalEdades / personal.size();
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	    
	    System.out.println(message);
    }

## Bad smell: Reinventando la rueda para calcular el cálculo de salarios.

El cálculo de totalSalarios se hace utilizando un for en vez de un stream que para eso están.
 
## Extracto del código con bad smell:

     for (Empleado empleado : personal)  {
    		    totalEdades = totalEdades + empleado.getEdad();
    		    totalSalarios = totalSalarios + empleado.getSalario();
    	    }

## Solución: Replace Loop with Pipeline.

## Código luego de aplicar el refactoring:

    public void imprimirPromedioEdadesYTotalSueldos()  {
    
	    int totalEdades =  0;
	    double promedioEdades =  this.personal.stream().mapToDouble(e -> e.getEdad()).average().orElse(0);
	    double totalSalarios =  this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	    
	    promedioEdades = totalEdades / personal.size();
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	    
	    System.out.println(message);
    }

## Bad smell: Variables y cálculos innecesarios.
Después de hacer los streams, la variable totalEdades y el cálculo de promedioEdades son innecesarios porque ya se calcula todo con el stream.

## Solución: Eliminar las variables y el calculo innecesario.

## Código luego de aplicar el refactoring:
    public void imprimirPromedioEdadesYTotalSueldos()  {
    
	    double promedioEdades =  this.personal.stream().mapToDouble(e -> e.getEdad()).average().orElse(0);
	    double totalSalarios =  this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	    
	    System.out.println(message);
    }
## Bad smell: Long Method.

El método se encarga de muchos cálculos que deberia derivar a otro método para que lo haga por él.

## Extracto del código con bad smell:

    public void imprimirPromedioEdadesYTotalSueldos()  {
    
	    double promedioEdades =  this.personal.stream().mapToDouble(e -> e.getEdad()).average().orElse(0);
	    double totalSalarios =  this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	    
	    System.out.println(message);
    }
## Solución: Extract Method.
Primero extraemos el calculo de edades y despues el de salarios.
## Código luego de aplicar el refactoring:

	public double calcularPromedioEdades(){
		return this.personal.stream().mapToDouble(e -> e.getEdad()).average().orElse(0);
	}
	
	public double calculatTotalSalarios(){
		return this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	}
	
    public void imprimirPromedioEdadesYTotalSueldos()  {
    
	    double promedioEdades = this.calcularPromedioEdades();
	    double totalSalarios = this.calcularTotalSalarios();
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);
	    
	    System.out.println(message);
    }

## Bad smell: Variables temporales.

## Extracto de código con el bad smell:

    public void imprimirPromedioEdadesYTotalSueldos()  {
    
	    double promedioEdades = this.calcularPromedioEdades();
	    double totalSalarios = this.calcularTotalSalarios();
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", promedioEdades, totalSalarios);

## Solución: Replace Temp with Query.

## Código luego de aplicar el refactoring:
    public void imprimirPromedioEdadesYTotalSueldos()  {
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", this.calcularPromedioEdades(), this.calcularTotalSalarios());

## Código luego final refactorizado:
	public double calcularPromedioEdades(){
		return this.personal.stream().mapToDouble(e -> e.getEdad()).average().orElse(0);
	}
	
	public double calculatTotalSalarios(){
		return this.personal.stream().mapToDouble(e -> e.getSalario()).sum();
	}
	
    public void imprimirPromedioEdadesYTotalSueldos()  {
	    
	    String message = String.format("El promedio de las edades es %s y el total de salarios es %s", this.calcularPromedioEdades(), this.calcularTotalSalarios());
	    
	    System.out.println(message);
    }

