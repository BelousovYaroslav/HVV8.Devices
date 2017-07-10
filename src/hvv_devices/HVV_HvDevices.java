/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvv_devices;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author yaroslav
 */
public class HVV_HvDevices {
    public TreeMap m_devices;
    
    private static HVV_HvDevices singletonDevices = null;
   
    protected HVV_HvDevices() {
        // Exists only to defeat instantiation.
        m_devices = new TreeMap();
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        HVV_HvDevice dev = new HVV_HvDevice();
        dev.m_strID = "MSW";
        dev.m_strName = "Главный рубильник";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        
        dev.m_lstCanGraph = null;
        
        m_devices.put( "MSW", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "PRE";
        dev.m_strName = "Уставка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Значение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "мкА");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        
        m_devices.put( "PRE", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "VIB";
        dev.m_strName = "Вибрация";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        
        dev.m_lstCanGraph = null;
        
        m_devices.put( "VIB", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "REG";
        dev.m_strName = "Режим";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Режим");
        
        dev.m_lstCanGraph = null;
        
        m_devices.put( "REG", dev);

        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L1A";
        dev.m_strName = "ЛГ-1.Анод.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L1A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L1T";
        dev.m_strName = "ЛГ-1.Штенгель.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L1T", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L2A";
        dev.m_strName = "ЛГ-2.Анод.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L2A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L2T";
        dev.m_strName = "ЛГ-2.Штенгель.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L2T", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L3A";
        dev.m_strName = "ЛГ-3.Анод.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L3A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L3T";
        dev.m_strName = "ЛГ-3.Штенгель.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L3T", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L4A";
        dev.m_strName = "ЛГ-4.Анод.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L4A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L4T";
        dev.m_strName = "ЛГ-4.Штенгель.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L4T", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L5A";
        dev.m_strName = "ЛГ-5.Анод.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L5A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L5T";
        dev.m_strName = "ЛГ-5.Штенгель.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L5T", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L6A";
        dev.m_strName = "ЛГ-6.Анод.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L6A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L6T";
        dev.m_strName = "ЛГ-6.Штенгель.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L6T", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L7A";
        dev.m_strName = "ЛГ-7.Анод.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L7A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L7T";
        dev.m_strName = "ЛГ-7.Штенгель.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L7T", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L8A";
        dev.m_strName = "ЛГ-8.Анод.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L8A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "L8T";
        dev.m_strName = "ЛГ-8.Штенгель.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Ток");
        dev.m_mapParameters.put( "03", "Напряжение");
        
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "мкА");
        dev.m_mapParametersUnits.put( "03", "В");
        
        m_devices.put( "L8T", dev);
        
        /*
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "LAA";
        dev.m_strName = "Все аноды приборов.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        m_devices.put( "LAA", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "LAT";
        dev.m_strName = "Все штенгели приборов.";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        m_devices.put( "LAT", dev);
        */
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "DAC1";
        dev.m_strName = "Напряжение на DAC1";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "1", "Канал 1");
        dev.m_mapParameters.put( "2", "Канал 2");
        dev.m_mapParameters.put( "3", "Канал 3");
        dev.m_mapParameters.put( "4", "Канал 4");
        
        dev.m_lstCanGraph = null;
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "1", "В");
        dev.m_mapParametersUnits.put( "2", "В");
        dev.m_mapParametersUnits.put( "3", "В");
        dev.m_mapParametersUnits.put( "4", "В");
        
        m_devices.put( "DAC1", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "DAC2";
        dev.m_strName = "Напряжение на DAC2";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "1", "Канал 1");
        dev.m_mapParameters.put( "2", "Канал 2");
        dev.m_mapParameters.put( "3", "Канал 3");
        dev.m_mapParameters.put( "4", "Канал 4");
        
        dev.m_lstCanGraph = null;
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "1", "В");
        dev.m_mapParametersUnits.put( "2", "В");
        dev.m_mapParametersUnits.put( "3", "В");
        dev.m_mapParametersUnits.put( "4", "В");
        
        m_devices.put( "DAC2", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "DAC3";
        dev.m_strName = "Напряжение на DAC3";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "1", "Канал 1");
        dev.m_mapParameters.put( "2", "Канал 2");
        dev.m_mapParameters.put( "3", "Канал 3");
        dev.m_mapParameters.put( "4", "Канал 4");
        
        dev.m_lstCanGraph = null;
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "1", "В");
        dev.m_mapParametersUnits.put( "2", "В");
        dev.m_mapParametersUnits.put( "3", "В");
        dev.m_mapParametersUnits.put( "4", "В");
        
        m_devices.put( "DAC3", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_HvDevice();
        dev.m_strID = "DAC4";
        dev.m_strName = "Напряжение на DAC4";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "1", "Канал 1");
        dev.m_mapParameters.put( "2", "Канал 2");
        dev.m_mapParameters.put( "3", "Канал 3");
        dev.m_mapParameters.put( "4", "Канал 4");
        
        dev.m_lstCanGraph = null;
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "1", "В");
        dev.m_mapParametersUnits.put( "2", "В");
        dev.m_mapParametersUnits.put( "3", "В");
        dev.m_mapParametersUnits.put( "4", "В");
        
        m_devices.put( "DAC4", dev);
    }
   
    public static HVV_HvDevices getInstance() {
      if( singletonDevices == null) {
         singletonDevices = new HVV_HvDevices();
      }
      return singletonDevices;
    }
   

    // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
    //MSW.Главный рубильник
    //PRE.Уставка
    //VIB.Вибрация
    //REG.Режим
    //01A.ЛГ-1.Анод
    //01T.ЛГ-1.Штенгель
    //02A.ЛГ-2.Анод
    //02T.ЛГ-2.Штенгель
    //03A.ЛГ-3.Анод
    //03T.ЛГ-3.Штенгель
    //04A.ЛГ-4.Анод
    //04T.ЛГ-4.Штенгель
    //05A.ЛГ-5.Анод
    //05T.ЛГ-5.Штенгель
    //06A.ЛГ-6.Анод
    //06T.ЛГ-6.Штенгель
    //07A.ЛГ-7.Анод
    //07T.ЛГ-7.Штенгель
    //08A.ЛГ-8.Анод
    //08T.ЛГ-8.Штенгель
    //0AA.Все аноды приборов
    //0AT.все штенгели приборов
    //DAC1.Напряжения на DAC1
    //DAC2.Напряжения на DAC2
    //DAC3.Напряжения на DAC3
    //DAC4.Напряжения на DAC4
    
    /*
    public void fillComboWait( DefaultComboBoxModel model) {
        model.removeAllElements();
        Set set = m_devices.entrySet();
        Iterator it = set.iterator();
        while( it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HVV_HvDevice dev = ( HVV_HvDevice) entry.getValue();
            if( dev.m_lstCanWait != null) {
                if( dev.m_lstCanWait.size() > 0) {
                    Iterator it2 = dev.m_lstCanWait.iterator();
                    while( it2.hasNext()) {
                        String strParameterKey = ( String) it2.next();
                        String strParameterName = ( String) dev.m_mapParameters.get( strParameterKey);
                        model.addElement( dev.m_strID + "." + dev.m_strName + "." + strParameterKey + "." + strParameterName);
                    }
                }
            }
        }
    }
    */
    
    public void fillComboGraph( DefaultComboBoxModel model, boolean bClear) {
        
        if( bClear)
            model.removeAllElements();
        
        Set set = m_devices.entrySet();
        Iterator it = set.iterator();
        while( it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HVV_HvDevice dev = ( HVV_HvDevice) entry.getValue();
            if( dev.m_lstCanGraph != null) {
                if( dev.m_lstCanGraph.size() > 0 ) {
                    Iterator it2 = dev.m_lstCanGraph.iterator();
                    while( it2.hasNext()) {
                        String strParameterKey = ( String) it2.next();
                        String strParameterName = ( String) dev.m_mapParameters.get( strParameterKey);
                        model.addElement( dev.m_strID + "." + dev.m_strName.substring( 0, dev.m_strName.length() -1) + "." + strParameterKey + "." + strParameterName);
                    }
                }
            }
        }
    }
}
