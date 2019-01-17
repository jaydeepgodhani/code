import requests
from bs4 import BeautifulSoup

def extractQuestion(soup):
    data_list=[]
    for name in soup.find_all('div',{'class':'question-summary'}):
    #for name in soup.find_all('a',{'class':'question-hyperlink'}):
        data={}
        data['Question'] = name.find('a').text #.get('href')
        data['Link'] = name.find('a').get('href')
        data_list.append(data)
    return data_list

if __name__=='__main__':
    result = requests.get("https://www.stackoverflow.com/questions?sort=featured")
    soup = BeautifulSoup(result.text,"html.parser")
    data_list = extractQuestion(soup)
    df = pd.DataFrame(data_list)
    df.to_csv('question.csv')
#print result #response 200
#soup.find('a') #find_all