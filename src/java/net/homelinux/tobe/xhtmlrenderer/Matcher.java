/*
 *
 * Matcher.java
 * Copyright (c) 2004 Torbj�rn Gannholm
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.	See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 */

package net.homelinux.tobe.xhtmlrenderer;

/**
 *
 * @author  Torbj�rn Gannholm
 */
public interface Matcher {
    
    public void setAttributeResolver(AttributeResolver ar);
    
    public void setDocument(org.w3c.dom.Document doc);
    
    /** iterator should return objects of type Stylesheet in the correct order of declaration */
    public void setStylesheets(java.util.Iterator i);
    
    /** If you wish to use ElementStyling, you must pass a StylesheetFactory to the matcher */
    public void setStylesheetFactory(StylesheetFactory styleFactory);
    
    public CascadedStyle getCascadedStyle(org.w3c.dom.Element e);
    
}
