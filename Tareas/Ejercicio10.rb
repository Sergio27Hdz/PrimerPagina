=begin Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que imprime la serie A
=end
letrero = ""
puts("Que cantidad de numeros va a generar la serie?(Solo enteros)")
limite = gets().to_i
for i in (1..limite-1)
		operador = (2*i)-1
		resultado = i**operador
		letrero = letrero + resultado.to_s
		letrero = letrero + ", "
end
operador = (2*limite)-1
resultado = limite**operador
letrero = letrero + resultado.to_s
letrero = letrero + "."
if limite==0
	puts("No hay ningun numero")
else
	puts(letrero)
end