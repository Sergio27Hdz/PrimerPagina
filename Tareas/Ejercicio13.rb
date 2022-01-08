=begin Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que lee e imprime vector de N digitos, Identifica el numero 
de veces repetidas un numero e imprime el vector
=end

letrero = ""
puts("Que cantidad de numeros va a tener el vector")
vectortamano = gets().to_i
vector = Array.new(vectortamano)
contador =0
letrero = letrero + "Magnitud del vector: "
letrero = letrero + vectortamano.to_s
letrero = letrero+ "\n"
for i in (0...vectortamano)
	k=i +1 
	puts ("vector["+k.to_s+"]= ")
	vector[i] = gets().to_i
end
puts ("Que numero quieres buscar?")
busqueda_de_numero = gets().to_i
for i in (0...vectortamano) 
	if (vector[i] == busqueda_de_numero) then
			contador = contador + 1
	else
	end
end
letrero = letrero + "El numero: "
letrero = letrero + busqueda_de_numero.to_s		
letrero = letrero + " aparece "
letrero= letrero + contador.to_s + " veces en el vector.\n"
letrero= letrero+"Vector: \n"
letrero= letrero+ "vector=["
for i in (0...vectortamano-1)
	letrero = letrero+ vector[i].to_s+", "
end
letrero = letrero+ vector[vectortamano-1].to_s+". "
letrero = letrero+"]"
puts (letrero)