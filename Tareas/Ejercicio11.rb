=begin Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que imprime la serie B
=end

letrero = ""
puts("Que cantidad de numeros va a generar la serie?(Solo enteros)")
numero = gets().to_i
serienegativa= -1
seriepositiva = 2
contador = 2
i = 0
j = 0
while i != numero
letrero = letrero+ serienegativa.to_s
letrero = letrero+ ", "
i = i+1
	while j != contador
		if i == numero
			break
		else
		letrero= letrero+ seriepositiva.to_s
		letrero = letrero+ ", "	
		i = i + 1
		j = j + 1
		end
	end
	j = 0
	seriepositiva = seriepositiva + 2
	contador = contador + 1
	serienegativa= serienegativa - 2
end
puts (letrero)




