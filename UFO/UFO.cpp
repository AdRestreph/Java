//
// Created by adrestreph on 8/03/2024.
//

#include <iostream>
#include "UFO.h"

int UFO::abducirHum(){
    return rand() % (10-1)+1;
}

int UFO::abducirVaca(){
    return rand() % (10-1)+1;
}

void UFO::volar(){
    cout <<"Nave acelerando motores para despegar"<< endl;
}

void UFO::aterrizar(){
    cout <<"Nave desacelerando para aterrizar"<< endl;
}