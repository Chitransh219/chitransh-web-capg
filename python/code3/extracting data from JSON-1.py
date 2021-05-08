import urllib.request, urllib.parse, urllib.error
import json
import ssl

api_key = False
# If you have a Google Places API key, enter it here
# api_key = 'AIzaSy___IDByT70'
# https://developers.google.com/maps/documentation/geocoding/intro

if api_key is False:
    api_key = 42
    serviceurl = 'http://py4e-data.dr-chuck.net/json?'
else :
    serviceurl = 'https://maps.googleapis.com/maps/api/geocode/xml?'

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url="http://py4e-data.dr-chuck.net/comments_780419.json"

address = input('Enter location: ')
if len(address) < 1:
    url=serviceurl+urllib.parse.urlencode({'address':address})

print('Retrieving', url)
uh = urllib.request.urlopen(url, context=ctx)

data = uh.read()
print('Retrieved', len(data), 'characters')


info = json.loads(data)

    
    
sum=0


print("Count: ",len(info["comments"]))

for i in range(len(info["comments"])):
    sum=sum+int(info["comments"][i]["count"])

print("Sum: ", sum)