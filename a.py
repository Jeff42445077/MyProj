

def checkout(skus):
    A = skus[0]
    B = skus[0]
    C = skus[0]
    D = skus[0]
    A_SO=A//3
    B_SO=B//2
    A_SI=A%3
    B_SI=B%2
    Total = A_SO*130+B_SO*45+A_SI*50+B_SI*30+C*20+D*15
    return(Total)
