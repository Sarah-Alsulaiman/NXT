/*
 * @(#) Song.java
 * 
 * Tern Tangible Programming System
 * Copyright (C) 2009 Michael S. Horn 
 * 
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
package tern.nxt.language;

import java.io.PrintWriter;
import tern.nxt.compiler.Statement;
import tern.nxt.compiler.CompileException;
import topcodes.TopCode;


public class Wait extends Statement {


   public Wait() {
      super();
   }
   
   
   public Wait(TopCode top) {
      super(top);
   }


   public void compile(PrintWriter out, boolean debug) throws CompileException {
      if (debug) out.println("trace " + getCompileID());
      out.println("while not getTouchSensor():");
      out.println("{");
      out.println("   wait 100");
      out.println("}");      
      compileNext(out, debug);
   }
}
