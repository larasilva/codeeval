import sys
test_cases = open(sys.argv[1], 'r')
def fizzbuzz(n, a1, a2):
    result = ""
    if n % a1==0:
        result = result + "F"
    if n % a2==0:
    	result = result + "B"
    if len(result)==0:
    	result = str(n)
    return result
for test in test_cases:
	#[fizz number, buzz number, number to count]
	test_values = [int(s) for s in test.split()]
	i = 0
	answer =""

	for i in range (1,test_values[2]+1):
		answer +=fizzbuzz(i, test_values[0], test_values[1])
		answer +=" "
		
	print(answer.strip(" "))
    
test_cases.close()
