f = lambda x:x+2
type(f)
#type(lamda x:x+2)
print f(2)

def higher(f,x):
    return f(x)
higher(lambda x:x+2,2)

#map(function,list)
a =range(1,11)
for i in a:
    print i
b = map(lambda x:x*2,a) #a remains same MAP produces new list
print b

c=filter(lambda x:x%2,a)
print c

d= reduce(lambda x,y: x if(x>y) else y,b)
print d

e= reduce(lambda x,y:x+y,b)
print e

#[expr(i) for i in list Condition]

f= map(lambda x:x*2 if(x%2==0) else 0,b)
print f

print '\n\n\n'

