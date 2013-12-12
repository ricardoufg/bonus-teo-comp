/*
    Copyright © 2013 FreeUFG.
   
    This file is part of BonusTeoComp.

    BonusTeoComp is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    BonusTeoComp is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with BonusTeoComp.  If not, see <http://www.gnu.org/licenses/>.
 */

package br.org.freeUFG.teoComp2013;

import java.util.ArrayList;

public class MaquinaTuring {
    
    private ArrayList<Character> fita;
    private ArrayList<String> delta;    //Pensar na função delta
    private int cabeca;
    
    //Pensar no construtor
    public MaquinaTuring(){
        
    }
    //Necessário implementar este método
    public String rodar(String cadeia){
        this.recebeEntrada(cadeia);
        return "aceita";
    }
    private void recebeEntrada(String w){
        this.cabeca = 0;
        this.fita = new ArrayList<> ();  
        for(int i=0; i<w.length(); i++){
            Character c = new Character(w.charAt(i));
            this.fita.add(c);
        }
    }
    private void moverCabeça(String direcao){
        if(direcao.equals("direita")){
            this.cabeca++;
            //Caso em que se move para uma célula em branco
            if(this.cabeca >= this.fita.size()){    
                Character c = new Character('_');
                this.fita.add(c);
            }
        }
        if(direcao.equals("esquerda")){
            if(this.cabeca > 0){
                this.cabeca--;
            }
        }
    }
    private void escreveNaFita(char s){
        Character c = new Character(s);
        this.fita.set(this.cabeca, c);
    }
    
}