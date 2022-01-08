=begin
Nombre: Sergio Alberto Hernandez Serrato Mat: 1853132 Hora: V5*
Programa que obtiene una cifra en grados y le da opcion al usuario a convertirlo a farenheit o a Celcius
=end
puts "Calcular conversion a temperatura"
puts " 1. F -> C\n 2. C -> F\n 3. Terminar\n"
opcion = gets.chomp.to_i

if opcion  == 1 then
	puts "Ingrese el valor a convertir"
	valor = gets.chomp.to_i
	conversion = ((valor-32)*(5))/9
	puts "el valor convertido es de #{conversion} grados centigrados"
elsif opcion == 2 then
	puts "Ingrese el valor a convertir"
	valor = gets.chomp.to_i
	conversion = ((valor*9)/5)+32
	puts "el valor convertido es de #{conversion} grados centigrados"
else
	puts "El programa ha finalizado con exito"
end

		