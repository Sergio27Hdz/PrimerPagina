=begin Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que realiza la conversion de monedas de mxn 
a dolar, euro, yen y dolar de Hong Kong
=end
puts ("Elija una opcion de conversion")
print ("1. Dolar\n2. Euro\n3.Yen\n4.DolarHK\n")
opcion = gets().to_i
if opcion<=4
	case opcion
		when 1
			puts ("Dame la cantidad a manejar")
			valor = gets().to_f
			equiv = 19.19
			conversion = valor/equiv;
			puts ("La equivalencia es de #{conversion} dolares")
		when 2	
			puts ("Dame la cantidad a manejar")
			valor = gets().to_f
			equiv = 21.23
			conversion = valor/equiv;
			puts ("La equivalencia es de #{conversion} euros")
		when 3
			puts ("Dame la cantidad a manejar")
			valor = gets().to_f
			equiv = 5.67
			conversion = valor*equiv;
			puts ("La equivalencia es de #{conversion} Yenes")
		when 4
			puts ("Dame la cantidad a manejar")
			valor = gets().to_f
			equiv = 2.45
			conversion = valor/equiv;
			puts ("La equivalencia es de #{conversion} dolares HK")
		else
			puts("Colocaste una opcion incorrecta")
	end
	else
end	
