import urllib.request, urllib.parse, urllib.error
import xml.etree.ElementTree as ET
import ssl

api_key = False
# If you have a Google Places API key, enter it here
# api_key = 'AIzaSy___IDByT70'
# https://developers.google.com/maps/documentation/geocoding/intro

if api_key is False:
    api_key = 42
    serviceurl = 'http://py4e-data.dr-chuck.net/xml?'
else :
    serviceurl = 'https://maps.googleapis.com/maps/api/geocode/xml?'

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url="http://py4e-data.dr-chuck.net/comments_780418.xml"

address = input('Enter location: ')
if len(address) < 1:
    url="http://py4e-data.dr-chuck.net/comments_780418.xml"

print('Retrieving', url)
uh = urllib.request.urlopen(url, context=ctx)

data = uh.read()
print('Retrieved', len(data), 'characters')
tree = ET.fromstring(data)

results = tree.findall('.//count')
print("Count: ",len(results))
          
sum = 0

for count in results:
    sum = sum+ int(count.text)

print("Sum:", str(sum))
    
