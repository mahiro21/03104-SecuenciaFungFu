/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public final class Main {

    public static void main(String[] args) {

        // Variables
        double gastoPersona;
        double dineroLeft;
        

        //Constantes
        final double DineroIni = 2;
        final double PrecioPeli = 1.30;
        final double PrecioPalomitas = 0.45;

        System.out.printf("Secuencia de Kung-Fu%n====================%n");
        System.out.printf(Locale.ENGLISH, "Dinero inicial .....: %.2f €%n", DineroIni);
        System.out.printf("---%n");
        System.out.printf(Locale.ENGLISH, "Precio película ....: %.2f €%n", PrecioPeli);
        System.out.printf(Locale.ENGLISH, "Parte palomitas ....: %.2f €%n", PrecioPalomitas);
        System.out.printf("---%n");
        gastoPersona =  PrecioPeli + PrecioPalomitas;
        System.out.printf(Locale.ENGLISH, "Gastos por persona .: %.2f €%n", gastoPersona);
        System.out.printf("---%n");
        dineroLeft = DineroIni - gastoPersona;
        System.out.printf(Locale.ENGLISH, "Dinero restante ....: %.2f €%n", dineroLeft);

    }
}
