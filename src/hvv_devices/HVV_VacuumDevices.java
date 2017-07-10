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
public class HVV_VacuumDevices {
    public TreeMap m_devices;
    
    private static HVV_VacuumDevices singletonDevices = null;
   
    protected HVV_VacuumDevices() {
        // Exists only to defeat instantiation.
        m_devices = new TreeMap();
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        HVV_VacuumDevice dev = new HVV_VacuumDevice();
        dev.m_strID = "00А";
        dev.m_strName = "Контур контроля вакуума";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "00A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "001";
        dev.m_strName = "Насос форвакуумный";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        
        m_devices.put( "001", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "002";
        dev.m_strName = "Насос турбомолекулярный";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Обороты");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "об. / мин");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add("02");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add("02");
        m_devices.put( "002", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "003";
        dev.m_strName = "Откачная станция";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Обороты");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл / выкл");
        dev.m_mapParametersUnits.put( "02", "об. / мин");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "02");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add("02");
        m_devices.put( "003", dev);

        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "04A";
        dev.m_strName = "Датчик вакуума MicroPirani (на форвакууумном насосе)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Значение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Па");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "01");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add("01");
        m_devices.put( "04A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "04B";
        dev.m_strName = "Датчик вакуума MicroPirani (на форвакуумном баллоне)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Значение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Па");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "01");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add("01");
        m_devices.put( "04B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "04C";
        dev.m_strName = "Датчик вакуума MicroPirani (на откачной станции)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Значение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Па");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "01");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add("01");
        m_devices.put( "04C", dev);
     
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "005";
        dev.m_strName = "Вакууметр DualMag (на турбомолекулярном насосе)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Значение (Показания вакуума)");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Па");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "01");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add("01");
        m_devices.put( "005", dev);

        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "006";
        dev.m_strName = "Baratron 750B (камера приборов)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Значение (Показания вакуума)");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Па");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "01");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add("01");
        m_devices.put( "006", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "007";
        dev.m_strName = "Baratron 627A (гребёнка)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Значение (Показания вакуума)");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Па");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "01");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add("01");
        m_devices.put( "007", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "08A";
        dev.m_strName = "Клапан XLCV";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "08A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "08B";
        dev.m_strName = "Клапан XLCV";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "08B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "08C";
        dev.m_strName = "Клапан XLCV";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "08C", dev);

        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "09A";
        dev.m_strName = "Клапан XSA1";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "09A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "09B";
        dev.m_strName = "Клапан XSA1";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "09B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "09C";
        dev.m_strName = "Клапан XSA1";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "09C", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "09D";
        dev.m_strName = "Клапан XSA1";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "09D", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "10A";
        dev.m_strName = "Клапан XSA3";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "10A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "10B";
        dev.m_strName = "Клапан XSA3";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "10B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "10C";
        dev.m_strName = "Клапан XSA3";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "10C", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "11A";
        dev.m_strName = "Клапан Ap-Tech (большое сечение)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "11A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "11B";
        dev.m_strName = "Клапан Ap_tech (малое сечение)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "11B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "012";
        dev.m_strName = "Затвор Pfeifer Vacuum";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "012", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "013";
        dev.m_strName = "Клапан SS-BN8VCR8-C Swagelok";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "013", dev);
     
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "14A";
        dev.m_strName = "Клапан Parker (Гребёнка O2)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "14A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "14B";
        dev.m_strName = "Клапан Parker (Гребёнка Ne20)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "14B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "14C";
        dev.m_strName = "Клапан Parker (Гребёнка He4)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "14C", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "14D";
        dev.m_strName = "Клапан Parker (Гребёнка Ne20+22)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "14D", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "14E";
        dev.m_strName = "Клапан Parker (Гребёнка He3)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "14E", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "15A";
        dev.m_strName = "Клапан Ap-Tech (подвод O2)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "15A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "15B";
        dev.m_strName = "Клапан Ap-Tech (подвод Ne20)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "15B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "15C";
        dev.m_strName = "Клапан Ap-Tech (подвод He4)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        
        m_devices.put( "15C", dev);

        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "16A";
        dev.m_strName = "Регулятор расхода газа MKS 1179 (O2)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Уставка потока");
        dev.m_mapParameters.put( "03", "Измеряемый поток");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        dev.m_mapParametersUnits.put( "02", "Поток.уставка.");
        dev.m_mapParametersUnits.put( "03", "Поток.протекающий.");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "03");
        dev.m_lstCanSet = new LinkedList();
        dev.m_lstCanSet.add( "02");
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "16A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "16B";
        dev.m_strName = "Регулятор расхода газа MKS 1179 (Ne20)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Уставка потока");
        dev.m_mapParameters.put( "03", "Измеряемый поток");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        dev.m_mapParametersUnits.put( "02", "Поток.уставка.");
        dev.m_mapParametersUnits.put( "03", "Поток.протекающий.");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "03");
        dev.m_lstCanSet = new LinkedList();
        dev.m_lstCanSet.add( "02");
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "16B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "16C";
        dev.m_strName = "Регулятор расхода газа MKS 1179 (He4)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Уставка потока");
        dev.m_mapParameters.put( "03", "Измеряемый поток");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        dev.m_mapParametersUnits.put( "02", "Поток.уставка.");
        dev.m_mapParametersUnits.put( "03", "Поток.протекающий.");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "03");
        dev.m_lstCanSet = new LinkedList();
        dev.m_lstCanSet.add( "02");
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "16C", dev);

        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "17A";
        dev.m_strName = "Регулятор расхода газа MKS M330B (Ne20+22)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Уставка потока");
        dev.m_mapParameters.put( "03", "Измеряемый поток");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        dev.m_mapParametersUnits.put( "02", "Поток.уставка.");
        dev.m_mapParametersUnits.put( "03", "Поток.протекающий.");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "03");
        dev.m_lstCanSet = new LinkedList();
        dev.m_lstCanSet.add( "02");
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "17A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "17B";
        dev.m_strName = "Регулятор расхода газа MKS M330B (He3)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Уставка потока");
        dev.m_mapParameters.put( "03", "Измеряемый поток");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        dev.m_mapParametersUnits.put( "02", "Поток.уставка.");
        dev.m_mapParametersUnits.put( "03", "Поток.протекающий.");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "03");
        dev.m_lstCanSet = new LinkedList();
        dev.m_lstCanSet.add( "02");
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "17B", dev);
     
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "018";
        dev.m_strName = "Регулятор расхода газа MKS 1480A (N2)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        dev.m_mapParameters.put( "02", "Уставка потока");
        dev.m_mapParameters.put( "03", "Измеряемый поток");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        dev.m_mapParametersUnits.put( "02", "Поток.уставка.");
        dev.m_mapParametersUnits.put( "03", "Поток.протекающий.");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "03");
        dev.m_lstCanSet = new LinkedList();
        dev.m_lstCanSet.add( "02");
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "018", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "020";
        dev.m_strName = "Реле атмосферы 41A11DCA2AF0002 (для напуска N2)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Замкнуто/разомкнуто");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = new LinkedList();
        dev.m_lstCanWait.add( "01");
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "020", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "021";
        dev.m_strName = "Геттер Capacitorr D100, «SAES Getters»";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "021", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "23A";
        dev.m_strName = "Клапан 6LV-BNBW4-P1-O Swagelok (подвод Ne20+22)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "23A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "23B";
        dev.m_strName = "Клапан 6LV-BNBW4-P1-O Swagelok (подвод He3)";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Состояние");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Открыт/закрыт");
        
        dev.m_bCanTurnOnOff = false;
        dev.m_bCanOpenClose = true;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = null;
        m_devices.put( "23B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "24A";
        dev.m_strName = "ЛГ1.Печка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Включение");
        dev.m_mapParameters.put( "02", "Температура");
        dev.m_mapParameters.put( "03", "Подключение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл/выкл");
        dev.m_mapParametersUnits.put( "02", "°С");
        dev.m_mapParametersUnits.put( "03", "Подключено/Отключено");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "24A", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "24B";
        dev.m_strName = "ЛГ2.Печка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Включение");
        dev.m_mapParameters.put( "02", "Температура");
        dev.m_mapParameters.put( "03", "Подключение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл/выкл");
        dev.m_mapParametersUnits.put( "02", "°С");
        dev.m_mapParametersUnits.put( "03", "Подключено/Отключено");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "24B", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "24C";
        dev.m_strName = "ЛГ3.Печка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Включение");
        dev.m_mapParameters.put( "02", "Температура");
        dev.m_mapParameters.put( "03", "Подключение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл/выкл");
        dev.m_mapParametersUnits.put( "02", "°С");
        dev.m_mapParametersUnits.put( "03", "Подключено/Отключено");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "24C", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "24D";
        dev.m_strName = "ЛГ4.Печка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Включение");
        dev.m_mapParameters.put( "02", "Температура");
        dev.m_mapParameters.put( "03", "Подключение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл/выкл");
        dev.m_mapParametersUnits.put( "02", "°С");
        dev.m_mapParametersUnits.put( "03", "Подключено/Отключено");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "24D", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "24E";
        dev.m_strName = "ЛГ5.Печка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Включение");
        dev.m_mapParameters.put( "02", "Температура");
        dev.m_mapParameters.put( "03", "Подключение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл/выкл");
        dev.m_mapParametersUnits.put( "02", "°С");
        dev.m_mapParametersUnits.put( "03", "Подключено/Отключено");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "24E", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "24F";
        dev.m_strName = "ЛГ6.Печка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Включение");
        dev.m_mapParameters.put( "02", "Температура");
        dev.m_mapParameters.put( "03", "Подключение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл/выкл");
        dev.m_mapParametersUnits.put( "02", "°С");
        dev.m_mapParametersUnits.put( "03", "Подключено/Отключено");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "24F", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "24G";
        dev.m_strName = "ЛГ7.Печка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Включение");
        dev.m_mapParameters.put( "02", "Температура");
        dev.m_mapParameters.put( "03", "Подключение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл/выкл");
        dev.m_mapParametersUnits.put( "02", "°С");
        dev.m_mapParametersUnits.put( "03", "Подключено/Отключено");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "24G", dev);
        
        // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
        dev = new HVV_VacuumDevice();
        dev.m_strID = "24H";
        dev.m_strName = "ЛГ8.Печка";
        
        dev.m_mapParameters = new TreeMap();
        dev.m_mapParameters.put( "01", "Включение");
        dev.m_mapParameters.put( "02", "Температура");
        dev.m_mapParameters.put( "03", "Подключение");
        
        dev.m_mapParametersUnits = new TreeMap();
        dev.m_mapParametersUnits.put( "01", "Вкл/выкл");
        dev.m_mapParametersUnits.put( "02", "°С");
        dev.m_mapParametersUnits.put( "03", "Подключено/Отключено");
        
        dev.m_bCanTurnOnOff = true;
        dev.m_bCanOpenClose = false;
        dev.m_lstCanWait = null;
        dev.m_lstCanSet = null;
        dev.m_lstCanGraph = new LinkedList();
        dev.m_lstCanGraph.add( "01");
        dev.m_lstCanGraph.add( "02");
        dev.m_lstCanGraph.add( "03");
        m_devices.put( "24H", dev);
        
    }
   
    public static HVV_VacuumDevices getInstance() {
      if( singletonDevices == null) {
         singletonDevices = new HVV_VacuumDevices();
      }
      return singletonDevices;
   }
   

    // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***
    // 00А.Контур контроля вакуума
    // 001.Насос форвакуумный
    // 002.Насос турбомолекулярный
    // 003.Откачная станция
    // 04A.Датчик вакуума MicroPirani (на форвакууумном насосе)
    // 04B.Датчик вакуума MicroPirani (на форвакуумном баллоне)
    // 04C.Датчик вакуума MicroPirani (на откачной станции)
    // 005.Вакууметр DualMag (на турбомолекулярном насосе)
    // 006.Baratron 750B (камера приборов)
    // 007.Baratron 627A (гребёнка)
    // 08A.Клапан XLCV
    // 08B.Клапан XLCV
    // 08C.Клапан XLCV
    // 09A.Клапан XSA1
    // 09B.Клапан XSA1
    // 09C.Клапан XSA1
    // 10A.Клапан XSA3
    // 10B.Клапан XSA3
    // 10C.Клапан XSA3
    // 11A.Клапан Ap-Tech (большое сечение)
    // 11B.Клапан Ap_tech (малое сечение)
    // 012.Затвор Pfeifer Vacuum
    // 013.Клапан SS-BN8VCR8-C Swagelok
    // 14A.Клапан Parker (Гребёнка O2)
    // 14B.Клапан Parker (Гребёнка Ne20)
    // 14C.Клапан Parker (Гребёнка He4)
    // 14D.Клапан Parker (Гребёнка Ne20+22)
    // 14E.Клапан Parker (Гребёнка He3)
    // 15A.Клапан Ap-Tech (подвод O2)
    // 15B.Клапан Ap-Tech (подвод Ne20)
    // 15C.Клапан Ap-Tech (подвод He4)
    // 16A.Регулятор расхода газа MKS 1179 (O2)
    // 16B.Регулятор расхода газа MKS 1179 (Ne20)
    // 16C.Регулятор расхода газа MKS 1179 (He4)
    // 17A.Регулятор расхода газа MKS M330B (Ne20+22)
    // 17B.Регулятор расхода газа MKS M330B (He3)
    // 018.Регулятор расхода газа MKS 1480A (N2)
    // 020.Реле атмосферы 41A11DCA2AF0002 (для напуска N2)
    // 23A.Клапан 6LV-BNBW4-P1-O Swagelok (подвод Ne20+22)
    // 23B.Клапан 6LV-BNBW4-P1-O Swagelok (подвод He3)
        
    public void fillComboOpenClose( DefaultComboBoxModel model) {
        model.removeAllElements();
        Set set = m_devices.entrySet();
        Iterator it = set.iterator();
        while( it.hasNext()) {
            Map.Entry entry = ( Map.Entry) it.next();
            HVV_VacuumDevice dev = ( HVV_VacuumDevice) entry.getValue();
            if( dev.m_bCanOpenClose)
                model.addElement( dev);
        }
    }
    
    public void fillComboTurnOnOff( DefaultComboBoxModel model) {
        model.removeAllElements();
        Set set = m_devices.entrySet();
        Iterator it = set.iterator();
        while( it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HVV_VacuumDevice dev = ( HVV_VacuumDevice) entry.getValue();
            if( dev.m_bCanTurnOnOff)
                model.addElement( dev);
        }
    }
    
    public void fillComboSet( DefaultComboBoxModel model) {
        model.removeAllElements();
        Set set = m_devices.entrySet();
        Iterator it = set.iterator();
        while( it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HVV_VacuumDevice dev = ( HVV_VacuumDevice) entry.getValue();
            if( dev.m_lstCanSet != null) {
                if( dev.m_lstCanSet.size() > 0 ) {
                    Iterator it2 = dev.m_lstCanSet.iterator();
                    while( it2.hasNext()) {
                        String strParameterKey = ( String) it2.next();
                        String strParameterName = ( String) dev.m_mapParameters.get( strParameterKey);
                        model.addElement( dev.m_strID + "." + dev.m_strName + "." + strParameterKey + "." + strParameterName);
                    }
                }
            }
        }
    }
    
    public void fillComboWait( DefaultComboBoxModel model) {
        model.removeAllElements();
        Set set = m_devices.entrySet();
        Iterator it = set.iterator();
        while( it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HVV_VacuumDevice dev = ( HVV_VacuumDevice) entry.getValue();
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
    
    public void fillComboGraph( DefaultComboBoxModel model, boolean bClear) {
        if( bClear)
            model.removeAllElements();
        
        Set set = m_devices.entrySet();
        Iterator it = set.iterator();
        while( it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HVV_VacuumDevice dev = ( HVV_VacuumDevice) entry.getValue();
            if( dev.m_lstCanGraph != null) {
                if( dev.m_lstCanGraph.size() > 0 ) {
                    Iterator it2 = dev.m_lstCanGraph.iterator();
                    while( it2.hasNext()) {
                        String strParameterKey = ( String) it2.next();
                        String strParameterName = ( String) dev.m_mapParameters.get( strParameterKey);
                        model.addElement( dev.m_strID + "." + dev.m_strName + "." + strParameterKey + "." + strParameterName);
                    }
                }
            }
        }
    }
}
