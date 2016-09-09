/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: Omar
 *
 * Created on 8 de septiembre de 2016, 10:06 PM
 */

#include <stdio.h>
#include <stdlib.h>

union job{
    char name[32];
    float salary;
    int worker_no;
}u;

struct job1{
    char name[32];
    float salary;
    int worker_no;
}s;
int main(int argc, char** argv) {
    printf("Tamano de la union = %d", sizeof(u));
    printf("\nTamano de la estructura = %d", sizeof(s));
    
    
    
    return (EXIT_SUCCESS);
}

