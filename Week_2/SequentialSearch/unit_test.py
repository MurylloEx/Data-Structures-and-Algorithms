# -*- coding: utf-8 -*-
from seq_search_engine import seq_search_find
from seq_search_obj import ListObject

var_list = [
    ListObject(1,  { 'Objeto': 'Pessoa', 'Nome': 'Nousog',      'Cpf': '43293163904' }),
    ListObject(2,  { 'Objeto': 'Pessoa', 'Nome': 'Puona',       'Cpf': '36564723008' }),
    ListObject(3,  { 'Objeto': 'Pessoa', 'Nome': 'Gillu',       'Cpf': '42955223689' }),
    ListObject(4,  { 'Objeto': 'Pessoa', 'Nome': 'Daraim',      'Cpf': '48886574592' }),
    ListObject(5,  { 'Objeto': 'Pessoa', 'Nome': 'Silloebo',    'Cpf': '48316805677' }),
    ListObject(6,  { 'Objeto': 'Pessoa', 'Nome': 'Ziadan',      'Cpf': '05171102457' }),
    ListObject(7,  { 'Objeto': 'Pessoa', 'Nome': 'Beidak',      'Cpf': '50267984898' }),
    ListObject(8,  { 'Objeto': 'Pessoa', 'Nome': 'Haida',       'Cpf': '48653468480' }),
    ListObject(9,  { 'Objeto': 'Pessoa', 'Nome': 'Grulhnikh',   'Cpf': '54759821805' }),
    ListObject(10, { 'Objeto': 'Pessoa', 'Nome': 'Belegbothir', 'Cpf': '70599472308' }),
    ListObject(11, { 'Objeto': 'Pessoa', 'Nome': 'Krilwi',      'Cpf': '43846783803' }),
    ListObject(12, { 'Objeto': 'Pessoa', 'Nome': 'Hahgoy',      'Cpf': '63642948804' }),
    ListObject(13, { 'Objeto': 'Pessoa', 'Nome': 'Kezigramph',  'Cpf': '72174746638' }),
    ListObject(14, { 'Objeto': 'Pessoa', 'Nome': 'Yagazag',     'Cpf': '52634578806' }),
    ListObject(15, { 'Objeto': 'Pessoa', 'Nome': 'Foxaevoy',    'Cpf': '18784587105' })
]

#Obtendo a pessoa chamada Hahgoy
print(seq_search_find(var_list, 12).Data)

#Obtendo a pessoa chamada Foxaevoy
print(seq_search_find(var_list, 15).Data)

#Obtendo a pessoa chamada Grulhnikh
print(seq_search_find(var_list, 9).Data)

#Resultado esperado:

#{'Objeto': 'Pessoa', 'Cpf': '63642948804', 'Nome': 'Hahgoy'}
#{'Objeto': 'Pessoa', 'Cpf': '18784587105', 'Nome': 'Foxaevoy'}
#{'Objeto': 'Pessoa', 'Cpf': '54759821805', 'Nome': 'Grulhnikh'}
