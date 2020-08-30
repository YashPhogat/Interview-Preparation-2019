line = "000000"

def process(line):

    try:
        num = int(line[2:], 16)
        print(num)
    except:
        return "INVALID"

    # num = int(line[2:], 16)
    summ = 0
    while num != 0:
        summ = summ + num % 10
        num = num // 10

    compare = (str(hex(summ))[2:]).upper()
    # print(compare, hex(summ), line[:2])
    if line[:2] == compare.zfill(2):
        return "VALID"
    return "INVALID"

print(process(line))