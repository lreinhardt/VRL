///*
// * TutorialSessionLoader.java
// *
// * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
// *
// * Copyright (C) 2009 Michael Hoffer <info@michaelhoffer.de>
// *
// * Supported by the Goethe Center for Scientific Computing of Prof. Wittum
// * (http://gcsc.uni-frankfurt.de)
// *
// * This file is part of Visual Reflection Library (VRL).
// *
// * VRL is free software: you can redistribute it and/or modify
// * it under the terms of the GNU General Public License version 3
// * as published by the Free Software Foundation.
// *
// * VRL is distributed in the hope that it will be useful,
// * but WITHOUT ANY WARRANTY; without even the implied warranty of
// * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// * GNU General Public License for more details.
// *
// * You should have received a copy of the GNU General Public License
// * along with this program.  If not, see <http://www.gnu.org/licenses/>.
// *
// * Linking this library statically or dynamically with other modules is
// * making a combined work based on this library.  Thus, the terms and
// * conditions of the GNU General Public License cover the whole
// * combination.
// *
// * As a special exception, the copyright holders of this library give you
// * permission to link this library with independent modules to produce an
// * executable, regardless of the license terms of these independent
// * modules, and to copy and distribute the resulting executable under
// * terms of your choice, provided that you also meet, for each linked
// * independent module, the terms and conditions of the license of that
// * module.  An independent module is a module which is not derived from
// * or based on this library.  If you modify this library, you may extend
// * this exception to your version of the library, but you are not
// * obligated to do so.  If you do not wish to do so, delete this
// * exception statement from your version.
// */
//
//package eu.mihosoft.vrl.io;
//
//
////import eu.mihosoft.vrl.reflection.TutorialSession;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
///**
// * XML tutorial session loader. Tutorial sessions are still in alpha stadium.
// * It may work but probably won't!
// * @author Michael Hoffer <info@michaelhoffer.de>
// */
//public class TutorialSessionLoader implements FileLoader {
//
//    @Override
//    public Object loadFile(File file) throws FileNotFoundException{
//
//        TutorialSession session = new TutorialSession();
//
//        // Read from disk using FileInputStream
//        FileInputStream fIn = new FileInputStream(file);
//
//        session.loadSession(fIn);
//
//        return session;
//    }
//}
