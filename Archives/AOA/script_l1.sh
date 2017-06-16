#!/bin/bash

# Script de répétition du programme de test
for i in $(seq 1 31)
do
	./run_kernel 50 15 0
done
