import pandas as pd
print("Pandas version:", pd.__version__)
df = pd.read_csv('https://raw.githubusercontent.com/alexeygrigorev/datasets/master/car_fuel_efficiency.csv ')
df.head()
print(df.head())   
