requirement = 6
umbrellas = [4,2,8]

opt = []
max_inf = float("inf")

for i in range(requirement+1):
    opt.append(max_inf)

opt[0] = 0

for i in range(1, requirement+1):
    for val in umbrellas:
        if i >= val:
            opt[i] = min(opt[i], opt[i-val] + 1)

if opt[-1]>requirement:
    print(-1)
else:
    print(opt[-1])

# print(opt)

