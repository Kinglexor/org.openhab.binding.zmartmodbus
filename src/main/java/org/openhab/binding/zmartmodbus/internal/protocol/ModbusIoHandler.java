/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.zmartmodbus.internal.protocol;

import org.openhab.binding.zmartmodbus.internal.controller.ModbusController;
import org.openhab.binding.zmartmodbus.internal.transceiver.ModbusTransceiver;

/**
 *
 * @author Peter Kristensen
 *
 */
public class ModbusIOHandler implements IModbusIOHandler {
 
    private ModbusTransceiver transceiver = null;
    private ModbusController controller;

    public ModbusIOHandler(ModbusController controller) {
        super();
        this.controller = controller;
    }

    public ModbusTransceiver getTransceiver() {
        return transceiver;
    }

    public void setTransceiver(ModbusTransceiver transceiver) {
        this.transceiver = transceiver;
    }

    public ModbusController getController() {
        return controller;
    }

}
