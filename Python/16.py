import sys

print '1.add\n2.multiply\n3.average'
y=raw_input('Choose operation : ')
x=int(y)
if x not in (1,2,3):
    print 'Enter valid operation !'
else:
    [var1,var2]=raw_input('enter values ').split(" ")
    var1 = int(var1)
    var2 = int(var2)
    if x == 1:
        print 'Answer is ',var1+var2
    elif x == 2:
        print 'Answer is ',var1*var2
    else :
        print 'Answer is ',float((var1+var2)/2)