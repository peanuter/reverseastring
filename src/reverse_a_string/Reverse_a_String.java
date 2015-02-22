/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_a_string;
import java.util.Scanner;

/**
 * @author peanuter
 * Created 2-22-2015
 */
public class Reverse_a_String {

    /**
     * Standard stream in accepts a string and reverses its order.
     * Application utilizes StringBuilder rather then StringBuffer
     * as StringBuffer's synchronization creates more overhead compared
     * to StringBuilder.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String mystring;
        String newstring;
        mystring = in.nextLine();
        newstring = new StringBuilder(mystring).reverse().toString();
        System.out.println("You entered string "+newstring);
    }
   
}
/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
