=begin Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que imprime la serie C
=end

letrero = ""
puts("Que cantidad de numeros va a generar la serie?(Solo enteros)")
numero = gets().to_i
numeropos = 0 
numeroneg= -1 
contador = 1
letrero = ""
i = 0
j = 0
k = 0
while i != numero
	while j != contador
		if i == numero
			break
		else
			numeropos = numeropos+ 2
			letrero = letrero+numeropos.to_s
			letrero = letrero+ ", "	
			i = i + 1 
			j = j + 1
		end
	end
	j = 0
	contador = contador+1	
	while k != 3
		if i == numero
			break
		else
			numeroneg = numeroneg-2
			letrero = letrero+ numeroneg.to_s
			letrero = letrero+ ", "
			i = i + 1
			k = k + 1
		end
	end
	k = 0
end
puts (letrero) 
