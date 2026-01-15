
"""Declaracion de variables
En esta parte del codigo se van
 a declarar varios tipos de variables"""

 #Expresiones aritmeticas
suma = 3 + 5
resta = 10 -12
multi = 24 * 23
div = 10 / 2
divEntera = 12// 5 #Division entera
mod = 10 % 2
potencia = 4**2 #Potencia

salida = f"Hola soy la suma: str{suma}"
print(salida)
salida = 'Hola soy la suma' 
print(salida,suma)
salida = 'Hola soy la suma' + str(suma)
print(salida)
salida = 'Hola soy la suma' +str(suma)
print(salida)
#Interpolacion de strings
salida = f"""
==== Expresones Aritmeticas ====
La suma es: {suma}
La resta es: {resta}
La multiplicacion es: {multi}
La division es: {div}
La division entera es: {divEntera}
El modulo es: {mod}
La potencia es: {potencia}
"""
print(salida)