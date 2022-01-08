=begin Nombre: Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que lee e imprime dos matrices de N y M magnitud y las suma para posteriormente imprimir
=end
contador =0
letrero = ""
puts ("ATENTCION\nDebido a ser suma de matrices,\n no se pueden realizar cuando son de diferente magnitud")
puts ("Ingrese la cantidad de filas de ambas matrices")
matricesfilas = gets().to_i
puts ("Ingrese la cantidad de columnas")
matricescolumnas = gets().to_i
letrero = letrero + "Magnitud de las matrices: matriz[ "
letrero = letrero + matricesfilas.to_s
letrero = letrero+ " ] "
letrero = letrero+ " [ "
letrero = letrero + matricescolumnas.to_s
letrero = letrero+ " ]\n"
letrero = letrero + "Matriz uno; \n"
matriz_uno = Array.new (matricesfilas){Array.new (matricescolumnas)}
matriz_dos = Array.new (matricesfilas){Array.new(matricescolumnas)}
matriz_resultado = Array.new (matricesfilas){Array.new(matricescolumnas)}
for i in (0...matricesfilas)
	for j in (0...matricescolumnas)
		fil = i+1
		col = j+1
		puts (" Ingrese el valor Matriz[ "+fil.to_s+" ][ "+col.to_s+" ]")
		matriz_uno[i][j] = gets().to_i
		letrero = letrero +"[ "+ matriz_uno[i][j].to_s+ " ]"
	end
	letrero = letrero + "\n"	
end
letrero = letrero + "\n\n"
letrero = letrero + "Matriz 2: \n"
for i in (0...matricesfilas)		
	for j in (0...matricescolumnas)
		fil = i+1
		col = j+1
		puts (" Ingrese el valor Matriz[ "+fil.to_s+" ][ "+col.to_s+" ]")
		matriz_dos[i][j] = gets().to_i
		letrero = letrero +"[ "+ matriz_dos[i][j].to_s+ " ]"
	end	
	letrero = letrero + "\n"
end
letrero = letrero + "\n\n"
letrero = letrero + "Matriz resultado: \n"
for i in (0...matricesfilas) 
	for j in (0...matricescolumnas) 
		matriz_resultado[i][j] = matriz_uno[i][j] + matriz_dos [i][j]
		letrero = letrero +"[ "+ matriz_resultado[i][j].to_s+ " ]"
	end
	letrero = letrero + "\n"
end
letrero = letrero + "\n\n"
puts(letrero)