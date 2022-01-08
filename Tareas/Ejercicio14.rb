=begin Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que lee e imprime una matriz de N y M magnitud, Identifica el numero 
de veces repetidas un numero e imprime la matriz
=end
contador =0
letrero = ""
puts ("Ingrese la cantidad de filas")
matrizfila = gets().to_i
puts ("Ingrese la cantidad de columnas")
matrizcolumna = gets().to_i
letrero = letrero + "Magnitud de la matriz: matriz[ "
letrero = letrero + matrizfila.to_s
letrero = letrero+ " ] "
letrero = letrero+ " [ "
letrero = letrero + matrizcolumna.to_s
letrero = letrero+ " ]\n"
matriz = Array.new(matrizfila){Array.new(matrizcolumna)}
for i in (0...matrizfila)
	for j in (0...matrizcolumna)
		fil = i+1
		col = j+1
		puts ("Matriz[ "+fil.to_s+" ][ "+col.to_s+" ]")
		matriz[i][j] = gets().to_i
	end	
end
puts ("Que numero quieres buscar?")
busqueda_de_numero = gets().to_i
for i in (0...matrizfila)
	for j in (0...matrizcolumna) 
		if matriz[i][j] == busqueda_de_numero then 
			contador= contador + 1
		else
		end
	end			
end
letrero = letrero + "El numero: "
letrero = letrero + busqueda_de_numero.to_s
letrero = letrero + " aparece "
letrero = letrero + contador.to_s+" veces en la matriz.\n"
letrero = letrero+"Matriz: \n"
for i in(0...matrizfila)
	for j in (0...matrizcolumna)
		letrero = letrero+ "[ ";
		letrero = letrero+ matriz[i][j].to_s+" ]";
	end
	letrero = letrero + "\n";
end
puts(letrero)
