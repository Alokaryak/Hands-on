###I. R Workspace
# Editor -- where you write your programs / scripts
# Console -- shows the commands you are writing; you can also write directly to it
# Environment -- shows all of the objects in your current R session
# Plots, Packages and Help - tabs with additional info about your session

###II. Basic commands and operations
#data.00 is a data - frame
# <- is an assignment operator, so whatever we will type on the right of the assignment operator will be assigned to the data frame
# here, mtcars is a data set which is called Motor Trend Car Road Tests
#you can read more about the data set by going to Help on the lower right window and searching "mtcars"
data.00 <- mtcars

#In R, everything that exists is an object and anything that happens is a function call.

#specific rows, columns, entries, etc using $ and [i,j]
# accessing a specific column with the $ operator
data.00$hp
# accessing columns with the [i,j] notation
data.00[,'hp']
data.00[,4]
data.00[1:5,1]
data.00[1:5,]

head(data.00) #first 6 observations
tail(data.00) #last 6 observations
str(data.00) #not string but it describes the structure of the data frame.

##tidyverse standards and data wrangling

library(tidyverse)

#Things to remember while working with tidyverse
# 1. Every column of the data frame is a unique variable
# 2. Every row is an unique observation, each row will have an unique key and purpose
# 3. Only keep what you need in a data set

filter(data.00, cyl == 4) # row sub-setting function
select(data.00, mpg, cyl) # column sub-setting function


data.00 %>% # pipe operator or piping operator
  filter(cyl == 4)

data.00 %>% 
  select(disp,mpg,qsec) %>%
  filter(disp == 160, qsec == 16.46)

# Creating something new
data.00 %>%
  mutate(mpg.per.cyl = mpg/cyl)


