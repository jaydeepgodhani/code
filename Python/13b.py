import sys
#only 9digit number or less than 9 digit is allowed,len() condition not checked
num=input('Enter number ')
a=""
dict1 = {0:'',1:'one',2:'two',3:'three',4:'four',5:'five',6:'six',7:'seven',8:'eight',9:'nine',10:'ten',11:'eleven',12:'twelve',13:'thirteen',14:'fourteen',15:'fifteen',16:'sixteen',17:'seventeen',18:'eighteen',19:'ninteen'}
dict2 = {2:'twenty',3:'thirty',4:'fourty',5:'fifty',6:'sixty',7:'seventy',8:'eighty',9:'ninty'}
dict3 = {1:'thousand',2:'lakh',3:'crore'}
if(num/10**7==0):a+=''
elif(0<num/10**7<=19):a+=dict1[num/10**7]+' crore '
else:a+=dict2[num/10**8]+dict1[(num/10**7)%10]+' crore '
num=num%10**7
if(num/10**5==0):a+=''
elif(0<num/10**5<=19):a+=dict1[num/10**5]+' lakh '
else:a+=dict2[num/10**6]+dict1[(num/10**5)%10]+' lakh '
num=num%10**5
if(num/10**3==0):a+=''
elif(0<num/10**3<=19):a+=dict1[num/10**3]+' thousand '
else:a+=dict2[num/10**4]+dict1[(num/10**3)%10]+' thousand '
num=num%10**3
if(num/10**2==0):a+=''
else:a+=dict1[num/10**2]+' hundred '
num=num%10**2
if(num==0):a+=''
elif(0<num<=19):a+=dict1[num]
else:a+=dict2[num/10]+dict1[num%10]
print a