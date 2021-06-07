Algoritmo pseudocodigoEjercicio6
	para i=1 hasta 8 Con Paso 1 Hacer
		Escribir "Ingrese edad"
		Leer edad;
		Si edad<25 Entonces
			n=n+1
			edad=edadN+edad
			edadN=edad
		SiNo
			n1=n1+1;
			edad=edadM+edad
			edadM=edad
		FinSi
	FinPara
	Escribir n," ",n1;
	Escribir "Promedio edad menores a 25 años es ",edadN/n;
	Escribir "Promedio edad amyores o iguales a 25 años es ",edadM/n1;
FinAlgoritmo
