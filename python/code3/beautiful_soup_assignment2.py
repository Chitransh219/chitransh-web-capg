import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input('Enter - ')
count=input("Enter count: ")
count1=int(count)
pos=input("Enter position: ")
pos1=int(pos)
html = urllib.request.urlopen(url, context=ctx).read()
soup = BeautifulSoup(html, 'html.parser')
str=""


# Retrieve all of the anchor tags
tags = soup('a')

while count1 > 0 :
    for index,tag in enumerate(tags,start=1):
        if index!=pos1:
            continue
        url=tag.get('href',None)
        html = urllib.request.urlopen(url, context=ctx).read()
        soup = BeautifulSoup(html, 'html.parser')
        tags=soup('a')
        str=tag.contents[0]
    count1=count1-1

print(str)
    
