/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Omar
 *
 * Created on 8 de septiembre de 2016, 10:21 PM
 */

#include <stdio.h>
#include <stdlib.h>

typedef union{
    int id;
    char Nombre[45];
    char Puesto[20];
    char Departamento[20];
    float Salary;
}empleado;

int main(int argc, char** argv) {
    int n, i = 0;
    float mayorSalary = 0.0;
    empleado *arr;
    
    printf("Introduce cuantos empleados vas a registrar: ");
    scanf("%d",&n);
    arr = calloc(n, sizeof(empleado));
    
    for(i = 0; i < n; i++){
        printf("ID del empleado: \n");
        scanf("%d", &arr[i].id);
        printf("Nombre del empleado: \n");
        scanf("%s", &arr[i].Nombre);
        printf("Puesto: \n");
        scanf("%s", &arr[i].Puesto);
        printf("Departamento: \n");
        scanf("%s", &arr[i].Departamento);
        printf("Salary: \n");
        scanf("%f", &arr[i].Salary);
        
        if(arr[i].Salary > mayorSalary){
            mayorSalary = arr[i].Salary;
        }
    }
    
    printf("El mayor salario: %f\n", mayorSalary);

    return (EXIT_SUCCESS);
}

