import urllib.request, urllib.parse, urllib.error

from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

count=0
sum=0

url = input('Enter - ')
html = urllib.request.urlopen(url, context=ctx).read()
soup = BeautifulSoup(html, "html.parser")

#Retrieve all span tags

tags= soup('span')

for tag in tags:
    temp=tag.contents[0]
    temp2=int(temp)
    count=count+1
    sum=sum+temp2
    
print('Count',count)
print('Sum',sum)