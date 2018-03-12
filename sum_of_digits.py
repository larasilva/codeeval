import sys
def digitsum(line):
	line_list = list(line)
	sum = 0
	for digit in line_list:
		if digit.isdigit():
			sum += int(digit)
	return sum;
    
test_cases = open(sys.argv[1], 'r')
for test in test_cases:
    # ignore test if it is an empty line
    # 'test' represents the test case, do something with it
    if len(test.strip()) != 0:
    	result = digitsum(test)
    	print(result)

test_cases.close()
