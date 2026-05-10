import requests
response = requests.get(
   "https://official-joke-api.appspot.com/random_joke"
)
data = response.json()
print(data)

response2 = requests.get(
    "https://api.weatherapi.com/current"
)
print(response2.text)
