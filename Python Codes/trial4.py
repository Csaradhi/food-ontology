#TO PRINT CONTENTS OF THE ROW CONTAINING the search term
#from xlrd import open_workbook
import xlrd

book = xlrd.open_workbook("C:\Users\Sai\Desktop\queryResults.xlsx",on_demand=True)
sheet = book.sheet_by_name('queryResults')
num_rows = sheet.nrows - 1
num_cells = sheet.ncols - 1
print "Enter the fruit number"
a = input()
if (a>9):
    fruit = "\"Fruit" + str(a) +"\""
else:
    fruit = "\"Fruit0" + str(a) +"\""
print fruit
rowIndex = -1
i=0
count=0
for cell in sheet.col(0):
    if fruit in cell.value:
        count=count+1
print count

if (a==1):
    i=1
elif (a==2):
    i=13
elif (a==3):
    i=25
elif (a==4):
    i=37
elif (a==5):
    i=49
elif (a==6):
    i=62
elif (a==7):
    i=74
elif (a==8):
    i=88
elif(a==9):
    i=100
elif(a==10):
    i=112
else:
    print "No Fruit with that number exists"
j=0
while (j<count):
    for cell in sheet.col(0):
        if fruit in cell.value:
            break
    j=j+1
                    
    row=i
    # If we found the row, print it
    if row != -1:
        cells = sheet.row(row)
        for cell in cells:
            print cell.value
    i=i+1
    print "\n"

book.unload_sheet('queryResults')
