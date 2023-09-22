#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'compareStrings' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. STRING s1
#  2. STRING s2
#

def compareStrings(s1, s2) -> int:
    # Write your code here

    # def backspace(s3:str )->str:
    #     stack =[]

    #     for s in s3:
    #         if s != '#':
    #             stack.append(s)
    #         elif stack:
    #             stack.pop()
    #         return stack

    # # if backspace(s1)==backspace(s2) return 1
    # # else return 0
    # return int(backspace(s1)==backspace(s2))
    # dont mess up with memoryyyy

    s1_stack = []
    s2_stack = []
    for S1 in s1:
        if S1 == '#' and s1_stack:
            s1_stack.pop()
            continue
        if S1 != '#':
            s1_stack.append(S1)

    for S2 in s2:
        if S2 == '#' and s2_stack:
            s2_stack.pop()
            continue
        if S2 != '#':
            s2_stack.append(S2)
    return int(s1_stack == s2_stack)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s1 = input()

    s2 = input()

    result = compareStrings(s1, s2)

    fptr.write(str(result) + '\n')

    fptr.close()
