import requests
result = requests.get("https://www.stackoverflow.com/questions?sort=featured")
from bs4 import BeautifulSoup
print result #response 200
soup = BeautifulSoup(result.text,"html.parser")
soup.find('a') #find_all