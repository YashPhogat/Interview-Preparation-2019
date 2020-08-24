import collections
def droppedRequests(requestTime):
    if len(requestTime) <= 3: return 0
    count = collections.Counter(requestTime)
    soln = set()
    lookup = {0:0}
    for i in range(requestTime[0], requestTime[-1]+1):
        lookup[i] = lookup[i-1] + count[i]

    # print(lookup)
    for i in range(3, len(requestTime)):
        temp1 , temp2 = 0, 0
        if requestTime[i]-10 in lookup: temp1 = lookup[requestTime[i]-10]
        if requestTime[i]-60 in lookup: temp2 = lookup[requestTime[i]-60]
        if requestTime[i-3] == requestTime[i]: soln.add(i)
        elif i+1 - temp1 > 20: soln.add(i)
        elif i+1 - temp2 > 60: soln.add(i)

    return len(soln)

request = [1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,11,11,11,11]

print(droppedRequests(request))