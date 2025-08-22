cont = 0
clients = 0 
cars = 0
serv = 0
costtotal = 0
cartotal = 0 
servtotal = 0 
car1total = 0 
car2total = 0
car3total = 0 
serv1total = 0 
serv2total = 0 
serv3total = 0
car1p = 0 
car2p = 0 
car3p = 0
serv1p = 0 
serv2p = 0 
serv3p = 0 
cost11 = 50 
cost12 = 70 
cost13 = 90 
cost21 = 70 
cost22 = 90 
cost23 = 110 
cost31 = 90 
cost32 = 110 
cost33 = 130
car1 = "Pequeno"
car2 = "Médio" 
car3 = "Grande" 
serv1 = "Lavação interna" 
serv2 = "Lavação interna + externa" 
serv3 = "Lavação interna+externa+cera"

clients = int(input("Quantos clientes foram atendidos?: "))
print("-------------------------------------------------")

while (cont < clients):
    name = str(input("Qual o seu nome?: "))
    car = int(input("Qual seu tipo de veículo?: "))
    cartotal=+1
    if (car>3):
        print("Tipo de carro inválido")
        break
    
    serv = int(input("E qual tipo de serviço você irá escolher?: "))
    servtotal=+1
    if (serv>3):
        print("Serviço inválido")
        break
    
    if (car == 1 and serv == 1):
        carN = car1
        servN = serv1
        cost = cost11
        costtotal += cost11
        car1total =car1total+1
        serv1total =serv1total+1
    if (car == 1 and serv == 2):
        carN = car1
        servN = serv2
        cost = cost12
        costtotal += cost12
        car1total =car1total+1
        serv2total =serv2total+1
    if (car == 1 and serv == 3):
        carN = car1
        servN = serv3
        cost = cost13
        costtotal += cost13
        car1total =car1total+1
        serv3total =serv3total+1
    if (car == 2 and serv == 1):
        carN = car2
        servN = serv1
        cost = cost21
        costtotal += cost21
        car2total =car2total+1
        serv1total =serv1total+1
    if (car == 2 and serv == 2):
        carN = car2
        servN = serv2
        cost = cost22
        costtotal += cost22
        car2total =car2total+1
        serv2total =serv2total+1
    if (car == 2 and serv == 3):
        carN = car2
        servN = serv3
        cost = cost23
        costtotal += cost23
        car2total =car2total+1
        serv3total =serv3total+1
    if (car == 3 and serv == 1):
        carN = car3
        servN = serv1
        cost = cost31
        costtotal += cost31
        car3total =car3total+1
        serv1total =serv1total+1
    if (car == 3 and serv == 2):
        carN = car3
        servN = serv2
        cost = cost32
        costtotal += cost32
        car3total =car3total+1
        serv2total =serv2total+1
    if (car == 3 and serv == 3):
        carN = car3
        servN = serv3
        cost = cost33
        costtotal += cost33
        car3total = car3total+1
        serv3total =serv3total+1
        
    if (car1total != 0 or car2total != 0 or car3total != 0):
        if (car1total > car2total and car1total > car3total):
            carM = car1
        elif (car2total > car1total and car2total > car3total):
            carM = car2
        elif (car3total > car2total and car3total > car1total):
            carM = car3
        else:
            carM = "Não houve tipo de carro mais atendido"
          
    if (serv1total != 0 or serv2total != 0 or serv3total != 0):  
        if (serv1total > serv2total and serv1total > serv3total):
            servM = serv1    
        elif (serv2total > serv1total and serv2total > serv3total):
            servM = serv2
        elif (serv3total > serv1total and serv3total > serv2total):
            servM = serv3
        else:
            servM = "Não houve tipo de serviço mais vendido"
            
    car1p = (car1total*100)/clients
    car2p = (car2total*100)/clients
    car3p = (car3total*100)/clients
    serv1p = (serv1total*100)/clients
    serv2p = (serv2total*100)/clients
    serv3p = (serv3total*100)/clients    
    print("\nOlá",name,"seu veículo é do tipo",carN,", e o serviço escolhido foi o de",servN)
    print("-------------------------------------------------")
    cont=cont+1

print("O tipo de veículo mais atendido foi o: ",carM,"")
print("E o tipo de serviço mais vendido foi o: ",servM,"")
print("-------------------------------------------------")
print("O percentual de veículos atendidos por cada tipo foi de:\nPequenos: ",car1p,"%\nMédios: ",car2p,"%\nGrandes: ",car3p,"%")
print("-------------------------------------------------")
print("O percentual de atendimentos feitos foi de:\nLavações internas: ",serv1p,"%\nLavações internas + externas: ",serv2p,"%\nLavações internas + externas + cera: ",serv3p,"%")
print("-------------------------------------------------")
print("O valor total arrecadado foi de R$",costtotal,"")
print("-------------------------------------------------")
print("Operação concluída. Volte sempre!!")     