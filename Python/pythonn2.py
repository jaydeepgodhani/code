def f(a):
    if(a==1):
        return 1
    else:
        return a*f(a-1)
print f(5)