def getLinha(matriz, n):
    return [i for i in matriz[n]]  # ou simplesmente return matriz[n]

def getColuna(matriz, n):
    return [i[n] for i in matriz]

mat1 = [[3.4, 5.6, 3.2], [6.7, 1.2, 9.8], [7.8, 9.2, 5.8]]            # uma matriz 2x2
mat1lin = len(mat1)                # retorna 2
mat1col = len(mat1[0])             # retorna 2

mat2 = [[7.7, 6.6, 3.3], [9.7, 1.1, 2.2], [5.4, 1.6, 2.9]]      # uma matriz 2x3
mat2lin = len(mat2)                # retorna 2
mat2col = len(mat1[0])             # retorna 3

matRes = []                        # deverá ser uma matriz 2x3
for i in range(mat1lin):           
    matRes.append([])

    for j in range(mat2col):
        # multiplica cada linha de mat1 por cada coluna de mat2;
        listMult = [x*y for x, y in zip(getLinha(mat1, i), getColuna(mat2, j))]

        # e em seguida adiciona a matRes a soma das multiplicações
        matRes[i].append(sum(listMult))

print(matRes)