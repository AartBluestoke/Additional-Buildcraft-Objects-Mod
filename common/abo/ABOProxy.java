/** 
 * Copyright (C) 2012 Flow86
 * 
 * AdditionalBuildcraftObjects is open-source.
 *
 * It is distributed under the terms of my Open Source License. 
 * It grants rights to read, modify, compile or run the code. 
 * It does *NOT* grant the right to redistribute this software or its 
 * modifications in any form, binary or source, except if expressively
 * granted by the copyright holder.
 */

package AdditionalBuildcraftObjects;

import cpw.mods.fml.common.SidedProxy;

public class ABOProxy {

	@SidedProxy(clientSide = "AdditionalBuildcraftObjects.ABOProxyClient", serverSide = "AdditionalBuildcraftObjects.ABOProxy")
	public static ABOProxy proxy;

	public void registerTileEntities() {
	}

	public void registerRenderers() {
	}
}