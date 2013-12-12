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

import java.util.Scanner;

/**
 * Protótipo inicial da Maquina de turing para um
 * <strong>M<sub>AFD</sub></strong> fixo, que decide uma <strong>L<sub>AFD</sub>
 * </strong>também fixa.<br>
 * O Levando em conta as seguintes transições
 * <table align="center" border="1" cellpadding="1" cellspacing="1"
 * style="width: 500px;">
 * <caption>
 * Diagrama de Transi&ccedil;&atilde;o da Solu&ccedil;&atilde;o de um Problema
 * na M&aacute;quina de Turing</caption>
 * <thead>
 * <tr>
 * <th scope="col">
 * <span style="font-size:11px;">Estado inicial</span></th>
 * <th scope="col">
 * <span style="font-size:11px;">Caracter Lido</span></th>
 * <th scope="col">
 * <span style="font-size:11px;">Estado Seguinte</span></th>
 * <th scope="col">
 * <span style="font-size:11px;">Caracter Escrito</span></th>
 * <th scope="col">
 * <span style="font-size:11px;">Movimento da Cabe&ccedil;a</span></th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td style="text-align: center;">
 * 1</td>
 * <td style="text-align: center;">
 * 1</td>
 * <td style="text-align: center;">
 * 2</td>
 * <td style="text-align: center;">
 * 1</td>
 * <td style="text-align: center;">
 * &gt;</td>
 * </tr>
 * <tr>
 * <td style="text-align: center;">
 * 2</td>
 * <td style="text-align: center;">
 * 1</td>
 * <td style="text-align: center;">
 * 2</td>
 * <td style="text-align: center;">
 * 0</td>
 * <td style="text-align: center;">
 * &lt;</td>
 * </tr>
 * <tr>
 * <td style="text-align: center;">
 * 2</td>
 * <td style="text-align: center;">
 * _</td>
 * <td style="text-align: center;">
 * 3</td>
 * <td style="text-align: center;">
 * _</td>
 * <td style="text-align: center;">
 * &gt;</td>
 * </tr>
 * <tr>
 * <td style="text-align: center;">
 * 4</td>
 * <td style="text-align: center;">
 * 0</td>
 * <td style="text-align: center;">
 * H</td>
 * <td style="text-align: center;">
 * 1</td>
 * <td style="text-align: center;">
 * &nbsp;</td>
 * </tr>
 * </tbody>
 * </table>
 * <p style="text-align: center;">
 * <strong>Legenda: &ldquo;_&rdquo; = caracter vazio; &ldquo; &rdquo;= sem
 * movimento</strong><br />
 * &nbsp;</p>
 * Temos então uma MT que lê uma cadeia de caracteres “1” e a transforma em uma
 * cadeia com extremos “1” e seu interior com “0” :<br>
 *
 *
 *
 * @author dyeimys
 */

public class ExemploMT {

    int cont = 0;
    char fita[];

    /**
     * Metodo que inicia o algoritmo
     *
     * @param palavra Palavra que será lida
     */
    public void iniciar(String palavra) {
        fita = palavra.toCharArray();
        q1();
    }

    /**
     * Estado
     * <code>q1</code>
     * <br> Lê <b>1</b>, Escreve <b>1</b> e move para<b> Direita</b> e vai para
     * <b>q2</b>
     */
    private void q1() {
        if (cont < fita.length) {
            if (fita[cont] == '1') {
                fita[cont] = '1';
                cont++;
                q2();
            }else{
                qErro();
            }
        } else {
            qErro();
        }
    }

    /**
     * Estado
     * <code>q2</code>
     * <br> Lê <b>1</b>, Escreve <b>0</b> e move para<b> Direita</b>e vai para
     * <b>q2</b>
     * <br> Lê <b>_</b>, Escreve <b>_</b> e move para<b> Esquerda</b>e vai para
     * <b>q3</b><br>
     */
    private void q2() {
        if (cont < fita.length) {
            if (fita[cont] == '1') {
                fita[cont] = '0';
                cont++;
                q2();
            } else if (fita[cont] == '_') {
                fita[cont] = '_';
                cont--;
                q3();
            } else {
                qErro();
            }
        } else {
            qErro();
        }
    }

    /**
     * Estado
     * <code>q3</code>
     * <br> Lê <b>0</b>, Escreve <b>1</b> e aceita
     *
     */
    private void q3() {
        if (cont < fita.length) {
            if (fita[cont] == '0') {
                fita[cont] = '1';
                imprimeFita();
                System.out.println("Palavra aceita");
            } else {
                qErro();   
            }
        } else {
            qErro();
        }
    }

    /**
     * Estado
     * <code>qErro</code>
     */
    private void qErro() {
        imprimeFita();
        System.err.println("Palavra não aceita");
 
    }

    /**
     * Metodo que imprime a fita
     */
    private void imprimeFita() {
        for (char a : fita) {
            System.out.print(a);
        }
        System.out.println("");
    }

  
}
