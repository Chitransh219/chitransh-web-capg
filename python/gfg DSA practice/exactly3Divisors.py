def exactly3Divisors(N):
    # code here
    
    prime=[True]*(N+1)
    prime[0] = prime[1] = False;
    p=2
    
    while(p*p<=N):
        
        if(prime[p]==True):
        
            for i in range(p*2, N+1,p):
                prime[i]=False
            
        p=p+1
        
    
    i=0
    while(i*i<=N):
        print(prime[i])
        i=i+1
N=6

print(exactly3Divisors(N))
