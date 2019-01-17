def add(*tupple):
    sum =0
    for i in tupple:
        sum +=i
    print sum
add(1,2,3,4)

def temp(x,y):
    return x,y
if __name__ == '__main__':
    t=temp(10,20)
    print t