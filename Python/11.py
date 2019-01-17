import sys

y=sys.argv[1]
yr=int(y)
set1=['C','java']
set2=['Advance Maths','Web tech']
set3=['Algo','DS']
set4=['ML','AI']
set5=['Language Processing','Neural Network']
if yr == 1:
    print 'Your courses are ',set1
elif yr == 2:
    print 'Your courses are ',set2
elif yr == 3:
    print 'Your courses are ',set3
elif yr == 4:
    print 'Your courses are ',set4
elif yr == 5:
    print 'Your courses are ',set5
else:
    print 'Enter valid year'