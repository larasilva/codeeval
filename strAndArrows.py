"""
Arrow reading:  '>>-->' or '<--<<'
Each symbol in the string can belong to more than one arrow
"""
def isArrow(str):
	if str==">>-->":
		return 1;
	if str=="<--<<":
		return 1;
	else:
		return 0;

test_cases = open(sys.argv[1], 'r')
for test in test_cases:
	if len(test)!=0:
		if len(test)<5:
			print '0';
		else:
			result = 0
			for x in range(0,len(test)-5):
				result += isArrow(test[x:x+4])
			print result

test_cases.close()
