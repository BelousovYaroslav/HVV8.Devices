/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvv_devices;

import java.util.LinkedList;
import java.util.TreeMap;

/**
 *
 * @author yaroslav
 */
public class HVV_HvDevice {
    public String m_strID;
    public String m_strName;
    
    public TreeMap m_mapParameters;
    public LinkedList m_lstCanGraph;
    
    public String toString() {
        return m_strID + ". " + m_strName;
    }
}
