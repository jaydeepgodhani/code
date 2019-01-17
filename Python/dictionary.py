dict1 = {'name':'jder','hi':'what','fg':'df','sdf':'sdg'}
print dict1
dict2 = {'name':'jde','hi':'what'}
print cmp(dict1,dict2)
print len(dict1)
print str(dict1)
print type(str(dict1))
dict3=dict1.copy
print dict1.get('name')
print dict1.has_key('name')
print dict1.items()
print dict1.keys()
print dict1.values()
print dict1.setdefault('name')
print dict1.setdefault('gender','none')
dict1.update(dict2)
print dict2
del dict1['sdf']
print dict1
seq=('Item1','Item2')
dict4=dict.fromkeys(seq)
print dict4     