=begin Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que lee e imprime dos matrices de N y M magnitud y las multiplica para posteriormente imprimir
=end
contador =0
letrero = ""
puts ("Ingrese la cantidad de filas de la matriz uno")
matrizfila_uno = gets().to_i
puts ("Ingrese la cantidad de columnas en matriz uno")
matrizcolumna_uno = gets().to_i
puts ("Ingrese la cantidad de filas en matriz 2")
matrizfila_dos = gets().to_i
puts ("Ingrese la cantidad de columnas en matriz 2")
matrizcolumna_dos = gets().to_i
if matrizcolumna_uno == matrizfila_dos then
	letrero = letrero + "Magnitud de las matrices:\n Matriz 1[ ";
	letrero = letrero + matrizfila_uno.to_s
	letrero = letrero+ " ] "
	letrero = letrero+ " [ "
	letrero = letrero + matrizcolumna_uno.to_s
	letrero = letrero+ " ]\n"
	letrero = letrero + "Matriz 2[ "
	letrero = letrero + matrizfila_dos.to_s
	letrero = letrero+ " ] "		
	letrero = letrero+ " [ "
	letrero = letrero + matrizcolumna_dos.to_s
	letrero = letrero+ " ]\n"
	matriz_uno = Array.new (matrizfila_uno){Array.new(matrizcolumna_uno)}
	matriz_dos = Array.new (matrizfila_dos){Array.new(matrizcolumna_dos)}
	matriz_resultado = Array.new (matrizfila_uno){Array.new(matrizcolumna_dos)}
	letrero = letrero + "Matriz 1:\n"
	for i in (0...matrizfila_uno)
		for j in (0...matrizcolumna_uno)
			fil = i+1
			col = j+1
			puts (" Ingrese el valor Matriz[ "+ fil.to_s + " ][ " + col.to_s + " ]")
			matriz_uno[i][j] = gets().to_i
			letrero = letrero +"[ "+ matriz_uno[i][j].to_s+ " ]"
		end
		letrero = letrero + "\n"
	end
	letrero = letrero + "\n\n"
	letrero = letrero + "Matriz 2: \n"
	for i in (0...matrizfila_dos)
		for j in (0...matrizcolumna_dos)
			fil = i + 1 
			col = j + 1
			puts (" Ingrese el valor Matriz[ "+ fil.to_s+" ][ "+col.to_s+" ]")
			matriz_dos[i][j] = gets().to_i
			letrero = letrero +"[ "+ matriz_dos[i][j].to_s+ " ]"
		end	
		letrero = letrero + "\n"
	end
	letrero = letrero + "\n\n"
	letrero = letrero + "Matriz resultado: \n"
	for i in (0...matrizfila_uno)
		for j in (0...matrizcolumna_dos)
			matriz_resultado[i][j] = 0
			for k in (0...matrizcolumna_uno) 
				matriz_resultado[i][j]= matriz_resultado[i][j] + (matriz_uno [i][k] * matriz_dos[k][j])
			end
			letrero = letrero + "[ "
			letrero = letrero + matriz_resultado [i][j].to_s
			letrero = letrero + " ]"		
		end
		letrero = letrero + "\n"				
	end
	letrero = letrero + "\n\n"
	puts(letrero)
else
	puts ("No es posible realizar la multiplicacion")
end