import sys
dict1 = {1:'one',2:'two',3:'three',4:'four',5:'five',6:'six',7:'seven',8:'eight',9:'nine',10:'ten',11:'eleven',12:'twelve',13:'thirteen',14:'fourteen',15:'fifteen',16:'sixteen',17:'seventeen',18:'eighteen',19:'ninteen'}
dict2 = {2:'twenty',3:'thirty',4:'fourty',5:'fifty',6:'sixty',7:'seventy',8:'eighty',9:'ninty'}
dict3 = {1:'thousand',2:'lakh',3:'crore'}
lastword = ""
wordstr2=""
intermediate =""
asnwer =""
num = input('enter a number ')
count = 0
def makeword(numb):
    lastword = ""
    if(len(str(numb))==3):
        lastword = str(dict1[numb/100]) + ' hundred '
        numb%=100
    if(len(str(numb))==2 and (numb/10 == 1)):
        lastword += dict1[numb] + " "
        numb%=10
    elif(len(str(numb))==2 and numb/10 != 1):
        lastword += dict2[numb/10] + " "
        numb%=10
        if(len(str(numb%10))==1):
            if(numb!=0):
                lastword += dict1[numb]
    else:
        if(len(str(numb%10))==1):
            if(numb!=0):
                lastword += dict1[numb]
    return lastword
    
def makefinal(numb,count):
    finalword = ""
    if(len(str(numb))==2 and (numb/10 == 1)):
        finalword += dict1[numb]
        numb%=10
    elif(len(str(numb))==2 and numb/10 != 1):
        finalword += dict2[numb/10] + " "
        numb%=10
        if(len(str(numb%10))==1):
            if(numb!=0):
                finalword += dict1[numb]
    else:
        if(len(str(numb%10))==1):
            if(numb!=0):
                finalword += dict1[numb]
    if(finalword):
        wordstr2 = finalword + " " + dict3[count] + " "
        return wordstr2
    else:
        return ''

while(num>0):
    if count == 0:
        last = num%1000
        num/=1000
        lastword = makeword(last)
        count+=1
    else:
        intermediate = makefinal(num%100,count)
        asnwer=intermediate+asnwer
        count+=1
        num/=100
print asnwer+lastword