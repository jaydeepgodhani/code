import sys

set1=['Tintin','noddy','Panchtantra','Nancy','Micky']
set2=['Anna','Meluha','Geetanjali','Fountainhead','Paulo']
age = sys.argv[1]
if int(age) < 18:
    print 'You should read ',set1
else:
    print 'You should read ',set2