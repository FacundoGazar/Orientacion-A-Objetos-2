# Ejercicio 3 - Documentos y estadísticas

## Bad smell: rompe el encapsulamiento.
La variable interna words es pública.
## Solución: Encapsulate Field

```Java
public  class  Document  {
	private List<String> words;
	
	public List<String> getWords(){
		return this.words;
	}
	
	public void setWords(List<String> words) {
        this.words = new ArrayList<>(words);
    }
    
    ...
```

## Bad smell: código duplicado.
Los métodos **calculateAvg** y **characterCount** usan la misma logica para calcular la cantidad de caracteres totales en el documento.

## Solución: Extract Method.

## Código luego de aplicar el refactoring:
```Java
public class Document {
    private List<String> words;
  
    public long characterCount() {
 	long count = this.words
            .stream()
            .mapToLong(w -> w.length())
            .sum();
    	return count;
	}
	
    public long calculateAvg() {
    	long avgLength = this.characterCount() / this.words.size();
 	    return avgLength;
	}
```

## Code smell: variables temporales.

El código usa variables temporales cuando puede devolver directamente el resultado de aplicar los streams.

## Solución: Replace Temp with Query.

## Código luego de aplicar el refactoring:

```Java
public class Document {
    private List<String> words;
  
    public long characterCount() {
    	return this.words
            .stream()
            .mapToLong(w -> w.length())
            .sum();
	}
	
    public long calculateAvg() {
 	    return this.characterCount() / this.words.size();
	}
```

## 3.  Analice el código original y detecte si existe un problema al calcular las estadísticas. Explique cuál es el error y en qué casos se da ¿El error identificado sigue presente luego de realizar los refactorings? En caso de que no esté presente, ¿en qué momento se resolvió? De acuerdo a lo visto en la teoría, ¿podemos considerar esto un refactoring?
Uno de los errores detectados es que se usa el tipo de dato *long* para calcular el promedio de caracteres por palabras, pero *long* está diseñado para representar enteros, en caso de que nos de un numero con decimales no podriamos representarlo. Lamentablemente el error sigue presente luego de los refactorings ya que no se puede modificar el comportamiento del código.
Otro error es que en el calculo del promedio podriamos encontrarnos con un documento sin palabras, es decir estariamos dividiendo por 0, lo que nos daria un error. Esto tampoco puede solucionarse refactorizando porque cambiarlo seria cambiar el comportamiento del código, lo que está prohibido al refactorizar.
