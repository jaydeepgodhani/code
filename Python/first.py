import sys
if True:
    print 'hi'
    print 'yo'
else:
    print 'no'
print 'hmm'
l1 = [1,2,3,4,5]
print l1[1:3]

def repeat(s,excl):
    result = s*3
    if excl:
        result = result + '!!!'
    return result

def main():
    print 'hello there',sys.argv[1]
    print repeat('Noo',False),
    print repeat('Yes',True)

if __name__== '__main__':
    main()

print 5//2
raw_input("\npress enter key to exit")