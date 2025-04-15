import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Membaca file Excel
file_path = "Data CM1.xlsx"
xls = pd.ExcelFile(file_path)

# Membaca sheet "ID"
df = pd.read_excel(xls, sheet_name="ID")

# Menampilkan 5 baris pertama
df.head()
