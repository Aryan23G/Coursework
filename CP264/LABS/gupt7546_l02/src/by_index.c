/**
 * -------------------------------------
 * @file  by_index.c
 * Lab 2 Index Functions Source Code File
 * -------------------------------------
 * @author Aryan Gupta, 169 057 546, gupt7546@mylaurier.ca
 *
 * @version 2025-01-06
 *
 * -------------------------------------
 */
#include "by_index.h"

void fill_values_by_index(int values[], int size) {

    for(int i = 0; i < size; i++) {
        values[i] = i + 1;
    }
}

void fill_squares_by_index(int values[], long int squares[], int size) {

    for(int i = 0; i < size; i++) {
		squares[i] = values[i] * values[i];
	}


}


void print_by_index(int values[], long int squares[], int size) {

    printf("Value  Square\n");
	printf("-----  ----------\n");
	for(int i = 0; i < size; i ++) {
		squares[i] = values[i] * values[i];
		printf("    %d         %ld\n", values[i], squares[i]);
	}



}
